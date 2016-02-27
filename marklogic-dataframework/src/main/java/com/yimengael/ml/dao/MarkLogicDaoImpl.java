package com.yimengael.ml.dao;

import org.apache.log4j.Logger;

import com.marklogic.client.DatabaseClient;
import com.marklogic.client.Transaction;
import com.marklogic.client.document.DocumentManager.Metadata;
import com.marklogic.client.document.ServerTransform;
import com.marklogic.client.document.XMLDocumentManager;
import com.marklogic.client.io.DocumentMetadataHandle;
import com.marklogic.client.io.DocumentMetadataHandle.DocumentCollections;
import com.marklogic.client.io.Format;
import com.marklogic.client.io.StringHandle;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.BiTemporalVO;
import com.yimengael.ml.model.MarkLogicVO;
import com.yimengael.ml.model.StaffInformationVO;
import com.yimengael.ml.model.TripleVO;
import com.yimengael.ml.model.TriplesVO;
import com.yimengael.ml.model.WorkDepartmentVO;
import com.yimengael.ml.tools.Constants;
import com.yimengael.ml.tools.MLDataSource;

public class MarkLogicDaoImpl implements IMarkLogicDao {

	private static final Logger LOGGER = Logger.getLogger(MarkLogicDaoImpl.class);
	static XStream xstream = new XStream(new StaxDriver());

	static {
		xstream.processAnnotations(MarkLogicVO.class);
		xstream.processAnnotations(TriplesVO.class);
		xstream.processAnnotations(TripleVO.class);
		xstream.processAnnotations(BiTemporalVO.class);
		xstream.processAnnotations(StaffInformationVO.class);
		xstream.processAnnotations(WorkDepartmentVO.class);

		final DateConverter vDateConverter = new DateConverter();
		xstream.registerConverter(vDateConverter);
	}

	@Override
	public String write(final MarkLogicVO pMarkLogicVO, final String pCollection) throws TechnicalException {

		final DatabaseClient dbClient = MLDataSource.getConnection();

		XMLDocumentManager vXmlDocMgr = null;
		if (dbClient != null) {
			vXmlDocMgr = dbClient.newXMLDocumentManager();
		}
		final DocumentMetadataHandle vMetadataHandle = new DocumentMetadataHandle();
		DocumentCollections vCollections = null;

		if (vXmlDocMgr != null) {
			vXmlDocMgr.setMetadataCategories(Metadata.COLLECTIONS);
		}

		// replace all the native balise by marklogic balises
		String vXML = xstream.toXML(pMarkLogicVO);
		vXML = vXML.replaceAll("<triple>", "<sem:triple>");
		vXML = vXML.replaceAll("</triple>", "</sem:triple>");
		vXML = vXML.replaceAll("<sem:triples>", "<sem:triples xmlns:sem=\"http://marklogic.com/semantics\">");

		// if object has already an URI
		if (pMarkLogicVO.getDocumentURI() != null) {
			LOGGER.debug(pMarkLogicVO.getDocumentURI());
			Transaction tx = null;
			try {
				tx = dbClient.openTransaction();
				LOGGER.debug("Starting Inserting document : " + vXML);

				final StringHandle handle = new StringHandle(vXML).withFormat(Format.XML);
				vCollections = vMetadataHandle.getCollections();
				vCollections.addAll(pCollection);

				//vXmlDocMgr.write(pMarkLogicVO.getDocumentURI(), vMetadataHandle, handle, new ServerTransform("transform_to_semantic_v1"), null, Constants.BITEMPORAL_COLLECTION);
				//vXmlDocMgr.write(pMarkLogicVO.getDocumentURI(), vMetadataHandle, handle, new ServerTransform("transform_to_semantic_v1"), tx);
				vXmlDocMgr.write(pMarkLogicVO.getDocumentURI(), handle);

				tx.commit();

			} catch (Exception e) {
				if (tx != null)
					tx.rollback();
				LOGGER.debug("Error when inserting document : " + vXML);
				e.printStackTrace();
				throw new TechnicalException(e);
			} finally {
				if (dbClient != null)
					dbClient.release();
			}
			LOGGER.debug("Inserting document successfull : " + pMarkLogicVO.getDocumentURI());
			return pMarkLogicVO.getDocumentURI();
		} else {
			// Object has no URI yet
			LOGGER.error("Document has no URI : " + vXML);
			throw new TechnicalException("Document has no URI");
		}
	}

	@Override
	public void writeSet(MarkLogicVO[] pMarkLogicVOArray, String pCollection) throws TechnicalException {
		// TODO Auto-generated method stub

	}

	@Override
	public MarkLogicVO getDocumentByURI(String pDocumentURI, String pCollection) throws TechnicalException {

		final DatabaseClient dbClient = MLDataSource.getConnection();

		final DocumentMetadataHandle vMetadataHandle = new DocumentMetadataHandle();
		DocumentCollections vCollections = null;

		MarkLogicVO vMarkLogicVO = null;
		String vDocumentXML = "";
		final XMLDocumentManager vXmlDocMgr = dbClient.newXMLDocumentManager();
		final StringHandle stringHandle = new StringHandle();
		LOGGER.debug("Getting the document from URI : " + pDocumentURI + " ...");
		try {
			vCollections = vMetadataHandle.getCollections();
			vCollections.addAll(pCollection);
			vCollections.addAll(Constants.LATEST_COLLECTION);
			vMetadataHandle.setCollections(vCollections);

			vXmlDocMgr.read(pDocumentURI, vMetadataHandle, stringHandle);
			//vXmlDocMgr.read(pDocumentURI, stringHandle);
			vCollections = vMetadataHandle.getCollections();
			LOGGER.debug("Content of Handler = " + stringHandle.get());
			vDocumentXML = stringHandle.get();
			LOGGER.debug("Collections of document = " + vCollections.toString());

			vDocumentXML = vDocumentXML.replaceAll("", "");
			vDocumentXML = vDocumentXML.replaceAll("", "");

			LOGGER.debug("Translating of XML to POJO ...");
			vMarkLogicVO = (MarkLogicVO) xstream.fromXML(vDocumentXML);

			if (vMarkLogicVO.getTriples() == null || vMarkLogicVO.getTriples().getListOfTriples() != null) {
				vMarkLogicVO.setTriples(new TriplesVO());
			}
		} catch (Exception e) {
			throw new TechnicalException(e);
		}

		return vMarkLogicVO;
	}

}
