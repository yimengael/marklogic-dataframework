/**
 * 
 */
package com.yimengael.ml.service;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.TripleVO;
import com.yimengael.ml.model.TriplesVO;
import com.yimengael.ml.model.WorkDepartmentVO;

import junit.framework.TestCase;

/**
 * @author YIMSON
 *
 */
public class WorkDepartmentServiceImplTest extends TestCase {

	IWorkDepartmentService vTestWorkDeptServiceImpl = new WorkDepartmentServiceImpl();

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
	 * {@link com.yimengael.ml.service.WorkDepartmentServiceImpl#addWorkDepartment(com.yimengael.ml.model.WorkDepartmentVO)}
	 * .
	 * 
	 * @throws TechnicalException
	 */
	@Test
	public final void testAddWorkDepartment() throws TechnicalException {

		// Definition of expected values
		WorkDepartmentVO workDeptVO = new WorkDepartmentVO("1", "Human Resources");
		String expStrAddWorkDeptURI = "/WorkDepartment/files/department_1";
		TripleVO expTripleDeptId = new TripleVO("/WorkDepartment/files/department_1", "contains", "1");
		TripleVO expTripleDeptName = new TripleVO("/WorkDepartment/files/department_1", "contains", "Human Resources");

		// Filling of real values
		String actualStrAddWorkDeptURI = vTestWorkDeptServiceImpl.addWorkDepartment(workDeptVO);
		List<TripleVO> triplesList = workDeptVO.getTriples().getListOfTriples();

		// Test assertions
		assertEquals(expStrAddWorkDeptURI, actualStrAddWorkDeptURI);
		assertEquals(
				expTripleDeptId.getSubject() + " " + expTripleDeptId.getPredicate() + " " + expTripleDeptId.getObject(),
				triplesList.get(0).getSubject() + " " + triplesList.get(0).getPredicate() + " "
						+ triplesList.get(0).getObject());
		assertEquals(
				expTripleDeptName.getSubject() + " " + expTripleDeptName.getPredicate() + " "
						+ expTripleDeptName.getObject(),
				triplesList.get(1).getSubject() + " " + triplesList.get(1).getPredicate() + " "
						+ triplesList.get(1).getObject());
	}

	/**
	 * Test method for
	 * {@link com.yimengael.ml.service.WorkDepartmentServiceImpl#getWorkDepartment(java.lang.String)}
	 * .
	 * 
	 * @throws TechnicalException
	 */
	@Test
	public final void testGetWorkDepartment() {

		// Definition of expected values
		WorkDepartmentVO expWorkDeptVO = new WorkDepartmentVO("1", "Human Resources");
		expWorkDeptVO.setDocumentURI("/WorkDepartment/files/department_1");
		TripleVO expTripleDeptId = new TripleVO("/WorkDepartment/files/department_1", "contains", "1");
		TripleVO expTripleDeptName = new TripleVO("/WorkDepartment/files/department_1", "contains", "Human Resources");
		TriplesVO triplesVO = new TriplesVO();
		triplesVO.getListOfTriples().add(expTripleDeptId);
		triplesVO.getListOfTriples().add(expTripleDeptName);
		expWorkDeptVO.setTriples(triplesVO);

		// Filling of real values
		WorkDepartmentVO workDeptVOfromDB;
		try {
			workDeptVOfromDB = vTestWorkDeptServiceImpl.getWorkDepartment("1");
			// Test assertions
		assertEquals(expWorkDeptVO.getDocumentURI(), workDeptVOfromDB.getDocumentURI());
		assertEquals(expWorkDeptVO.getDepartmentId(), workDeptVOfromDB.getDepartmentId());
		assertEquals(expWorkDeptVO.getDepartmentName(), workDeptVOfromDB.getDepartmentName());
		assertEquals(
				expWorkDeptVO.getTriples().getListOfTriples().get(0).getSubject() + " "
						+ expWorkDeptVO.getTriples().getListOfTriples().get(0).getPredicate() + " "
						+ expWorkDeptVO.getTriples().getListOfTriples().get(0).getObject(),
				workDeptVOfromDB.getTriples().getListOfTriples().get(0).getSubject() + " "
						+ workDeptVOfromDB.getTriples().getListOfTriples().get(0).getPredicate() + " "
						+ workDeptVOfromDB.getTriples().getListOfTriples().get(0).getObject());
		assertEquals(
				expWorkDeptVO.getTriples().getListOfTriples().get(1).getSubject() + " "
						+ expWorkDeptVO.getTriples().getListOfTriples().get(1).getPredicate() + " "
						+ expWorkDeptVO.getTriples().getListOfTriples().get(1).getObject(),
				workDeptVOfromDB.getTriples().getListOfTriples().get(1).getSubject() + " "
						+ workDeptVOfromDB.getTriples().getListOfTriples().get(1).getPredicate() + " "
						+ workDeptVOfromDB.getTriples().getListOfTriples().get(1).getObject());
		} catch (TechnicalException e) {
			new TechnicalException("Exception technique caught !!!");
		}

		

	}

}
