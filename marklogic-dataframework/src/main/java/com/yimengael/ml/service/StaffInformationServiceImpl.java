package com.yimengael.ml.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.yimengael.ml.dao.IStaffInformationDao;
import com.yimengael.ml.dao.StaffInformationDaoImpl;
import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.StaffInformationVO;
import com.yimengael.ml.model.TripleVO;
import com.yimengael.ml.model.TriplesVO;
import com.yimengael.ml.tools.Constants;

public class StaffInformationServiceImpl implements IStaffInformationService {
	
	final IStaffInformationDao mStaffInformationDao = new StaffInformationDaoImpl();

	@Override
	public String addStaffInformation(StaffInformationVO pStaffInformationVO) throws TechnicalException {
		
		//Set Staff information document properties
		pStaffInformationVO.setDocumentURI(Constants.STAFF_INFORMATION_COLLECTION_FILES_URI_PREFIX + Constants.STAFF_INFORMATION_FILE_PREFIX_NAME + "_" + pStaffInformationVO.getStaffId());
		pStaffInformationVO.setTriples(new TriplesVO());
		
		//Set triples for staff information
		List<TripleVO> tripleVOList = pStaffInformationVO.getTriples().getListOfTriples();
		tripleVOList.add(new TripleVO(pStaffInformationVO.getDocumentURI(), Constants.STAFF_INFORMATION_PREDICATE, pStaffInformationVO.getStaffId()));
		tripleVOList.add(new TripleVO(pStaffInformationVO.getDocumentURI(), Constants.STAFF_INFORMATION_PREDICATE, pStaffInformationVO.getStaffLastName()));
		tripleVOList.add(new TripleVO(pStaffInformationVO.getDocumentURI(), Constants.STAFF_INFORMATION_PREDICATE, pStaffInformationVO.getStaffFirstName()));
		tripleVOList.add(new TripleVO(pStaffInformationVO.getDocumentURI(), Constants.STAFF_INFORMATION_PREDICATE, pStaffInformationVO.getStaffHireDate()));
		tripleVOList.add(new TripleVO(pStaffInformationVO.getDocumentURI(), Constants.STAFF_INFORMATION_PREDICATE, pStaffInformationVO.getStaffSsn()));
		tripleVOList.add(new TripleVO(pStaffInformationVO.getDocumentURI(), Constants.STAFF_INFORMATION_PREDICATE, pStaffInformationVO.getStaffManager()));
		
		//Set triples for staff and his head
		String vStaffManagerDocumentURI = Constants.STAFF_INFORMATION_COLLECTION_URI_PREFIX + Constants.STAFF_INFORMATION_COLLECTION_FILES_URI_PREFIX + "_" + pStaffInformationVO.getStaffManager();
		tripleVOList.add(new TripleVO(pStaffInformationVO.getDocumentURI(), Constants.HAS_AS_HEAD, vStaffManagerDocumentURI));
		
		//Set triples for staff and his department
		String vStaffWorkDepartmentDocumentURI = Constants.WORK_DEPARTMENT_URI_PREFIX + Constants.WORK_DEPARTMENT_FILES_URI_PREFIX + "_" + pStaffInformationVO.getStaffDepartement();
		tripleVOList.add(new TripleVO(pStaffInformationVO.getDocumentURI(), Constants.WORKS_IN_DEPARTMENT, vStaffWorkDepartmentDocumentURI));
		
		return mStaffInformationDao.addStaffInformation(pStaffInformationVO);
		
	}

	@Override
	public StaffInformationVO getStaffInformation(String pStaffID) throws TechnicalException {
		String vStaffInfoDocumentURI = Constants.STAFF_INFORMATION_COLLECTION_URI_PREFIX + Constants.STAFF_INFORMATION_FILE_PREFIX_NAME + "_"
				+ pStaffID;
		StaffInformationVO vStaffInformationVO = mStaffInformationDao.findStaffInformationById(vStaffInfoDocumentURI);
		return vStaffInformationVO;
	}

}
