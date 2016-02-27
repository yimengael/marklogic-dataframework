/**
 * 
 */
package com.yimengael.ml.service;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.StaffInformationVO;
import com.yimengael.ml.model.TripleVO;
import com.yimengael.ml.model.TriplesVO;

import junit.framework.TestCase;

/**
 * @author YIMSON
 *
 */
public class StaffInformationServiceImplTest extends TestCase {

	IStaffInformationService vTestStaffInfoServiceImpl = new StaffInformationServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for
	 * {@link com.yimengael.ml.service.StaffInformationServiceImpl#addStaffInformation(com.yimengael.ml.model.StaffInformationVO)}
	 * .
	 * 
	 * @throws TechnicalException
	 */
	@Test
	public final void testAddStaffInformation() throws TechnicalException {

		// Defintiion of expected elements
		StaffInformationVO staffInfoVO = new StaffInformationVO("00001", "19986127548", "Gael", "Yimen Yimga",
				"03/11/2014", "00002", "1");
		String expStrAddstaffInfoURI = "/StaffInformation/files/staff_00001";
		TripleVO expTriplestaffId = new TripleVO("/StaffInformation/files/staff_00001", "contains", "00001");
		TripleVO expTriplestaffSsn = new TripleVO("/StaffInformation/files/staff_00001", "contains", "19986127548");
		TripleVO expTriplestaffFirstName = new TripleVO("/StaffInformation/files/staff_00001", "contains", "Gael");
		TripleVO expTriplestaffLastName = new TripleVO("/StaffInformation/files/staff_00001", "contains",
				"Yimen Yimga");
		TripleVO expTriplestaffMgr = new TripleVO("/StaffInformation/files/staff_00001", "contains", "00002");
		TripleVO expTriplestaffDept = new TripleVO("/StaffInformation/files/staff_00001", "contains", "1");

		// Filling of actual values
		String actualStrAddStaffInfoURI = vTestStaffInfoServiceImpl.addStaffInformation(staffInfoVO);
		List<TripleVO> triplesList = staffInfoVO.getTriples().getListOfTriples();

		// Test assertions
		assertEquals(expStrAddstaffInfoURI, actualStrAddStaffInfoURI);
		assertEquals(
				expTriplestaffId.getSubject() + " " + expTriplestaffId.getPredicate() + " "
						+ expTriplestaffId.getObject(),
				triplesList.get(0).getSubject() + " " + triplesList.get(0).getPredicate() + " "
						+ triplesList.get(0).getObject());
		assertEquals(
				expTriplestaffSsn.getSubject() + " " + expTriplestaffSsn.getPredicate() + " "
						+ expTriplestaffSsn.getObject(),
				triplesList.get(1).getSubject() + " " + triplesList.get(1).getPredicate() + " "
						+ triplesList.get(1).getObject());
		assertEquals(
				expTriplestaffFirstName.getSubject() + " " + expTriplestaffFirstName.getPredicate() + " "
						+ expTriplestaffFirstName.getObject(),
				triplesList.get(2).getSubject() + " " + triplesList.get(2).getPredicate() + " "
						+ triplesList.get(2).getObject());
		assertEquals(
				expTriplestaffLastName.getSubject() + " " + expTriplestaffLastName.getPredicate() + " "
						+ expTriplestaffLastName.getObject(),
				triplesList.get(3).getSubject() + " " + triplesList.get(3).getPredicate() + " "
						+ triplesList.get(3).getObject());
		assertEquals(
				expTriplestaffMgr.getSubject() + " " + expTriplestaffMgr.getPredicate() + " "
						+ expTriplestaffMgr.getObject(),
				triplesList.get(5).getSubject() + " " + triplesList.get(5).getPredicate() + " "
						+ triplesList.get(5).getObject());
		assertEquals(
				expTriplestaffDept.getSubject() + " " + expTriplestaffDept.getPredicate() + " "
						+ expTriplestaffDept.getObject(),
				triplesList.get(6).getSubject() + " " + triplesList.get(6).getPredicate() + " "
						+ triplesList.get(6).getObject());
	}

	/**
	 * Test method for
	 * {@link com.yimengael.ml.service.StaffInformationServiceImpl#getStaffInformation(java.lang.String)}
	 * .
	 */
	@Test
	public final void testGetStaffInformation() {

		// Defintiion of expected elements
		StaffInformationVO expStaffInfoVO = new StaffInformationVO("00001", "19986127548", "Gael", "Yimen Yimga",
				"03/11/2014", "00002", "1");
		expStaffInfoVO.setDocumentURI("/StaffInformation/files/staff_00001");
		TripleVO expTriplestaffId = new TripleVO("/StaffInformation/files/staff_00001", "contains", "00001");
		TripleVO expTriplestaffSsn = new TripleVO("/StaffInformation/files/staff_00001", "contains", "19986127548");
		TripleVO expTriplestaffFirstName = new TripleVO("/StaffInformation/files/staff_00001", "contains", "Gael");
		TripleVO expTriplestaffLastName = new TripleVO("/StaffInformation/files/staff_00001", "contains",
				"Yimen Yimga");
		TripleVO expTriplestaffHireDate = new TripleVO("/StaffInformation/files/staff_00001", "contains", "03/11/2014");
		TripleVO expTriplestaffMgr = new TripleVO("/StaffInformation/files/staff_00001", "contains", "00002");
		TripleVO expTriplestaffDept = new TripleVO("/StaffInformation/files/staff_00001", "contains", "1");

		TriplesVO triplesVO = new TriplesVO();
		triplesVO.getListOfTriples().add(expTriplestaffId);
		triplesVO.getListOfTriples().add(expTriplestaffSsn);
		triplesVO.getListOfTriples().add(expTriplestaffFirstName);
		triplesVO.getListOfTriples().add(expTriplestaffLastName);
		triplesVO.getListOfTriples().add(expTriplestaffHireDate);
		triplesVO.getListOfTriples().add(expTriplestaffMgr);
		triplesVO.getListOfTriples().add(expTriplestaffDept);
		expStaffInfoVO.setTriples(triplesVO);

		// Filling of actual values
		StaffInformationVO staffInfoVOfromDB;
		try {
			staffInfoVOfromDB = vTestStaffInfoServiceImpl.getStaffInformation("00001");

			// Test assertions
			assertEquals(expStaffInfoVO.getDocumentURI(), staffInfoVOfromDB.getDocumentURI());
			assertEquals(expStaffInfoVO.getStaffId(), staffInfoVOfromDB.getStaffId());
			assertEquals(expStaffInfoVO.getStaffSsn(), staffInfoVOfromDB.getStaffSsn());
			assertEquals(expStaffInfoVO.getStaffFirstName(), staffInfoVOfromDB.getStaffFirstName());
			assertEquals(expStaffInfoVO.getStaffLastName(), staffInfoVOfromDB.getStaffLastName());
			assertEquals(expStaffInfoVO.getStaffManager(), staffInfoVOfromDB.getStaffManager());
			assertEquals(expStaffInfoVO.getStaffDepartement(), staffInfoVOfromDB.getStaffDepartement());

			assertEquals(
					expStaffInfoVO.getTriples().getListOfTriples().get(0).getSubject() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(0).getPredicate() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(0).getObject(),
					staffInfoVOfromDB.getTriples().getListOfTriples().get(0).getSubject() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(0).getPredicate() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(0).getObject());

			assertEquals(
					expStaffInfoVO.getTriples().getListOfTriples().get(1).getSubject() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(1).getPredicate() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(1).getObject(),
					staffInfoVOfromDB.getTriples().getListOfTriples().get(1).getSubject() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(1).getPredicate() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(1).getObject());

			assertEquals(
					expStaffInfoVO.getTriples().getListOfTriples().get(2).getSubject() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(2).getPredicate() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(2).getObject(),
					staffInfoVOfromDB.getTriples().getListOfTriples().get(2).getSubject() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(2).getPredicate() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(2).getObject());

			assertEquals(
					expStaffInfoVO.getTriples().getListOfTriples().get(3).getSubject() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(3).getPredicate() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(3).getObject(),
					staffInfoVOfromDB.getTriples().getListOfTriples().get(3).getSubject() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(3).getPredicate() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(3).getObject());

			assertEquals(
					expStaffInfoVO.getTriples().getListOfTriples().get(5).getSubject() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(5).getPredicate() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(5).getObject(),
					staffInfoVOfromDB.getTriples().getListOfTriples().get(5).getSubject() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(5).getPredicate() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(5).getObject());

			assertEquals(
					expStaffInfoVO.getTriples().getListOfTriples().get(6).getSubject() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(6).getPredicate() + " "
							+ expStaffInfoVO.getTriples().getListOfTriples().get(6).getObject(),
					staffInfoVOfromDB.getTriples().getListOfTriples().get(6).getSubject() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(6).getPredicate() + " "
							+ staffInfoVOfromDB.getTriples().getListOfTriples().get(6).getObject());

		} catch (TechnicalException e) {
			new TechnicalException("Exception technique caught !!!");
		}

	}

}
