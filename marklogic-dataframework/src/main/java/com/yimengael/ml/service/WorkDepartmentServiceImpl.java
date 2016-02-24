package com.yimengael.ml.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.yimengael.ml.dao.IWorkDepartmentDao;
import com.yimengael.ml.dao.WorkDepartmentDaoImpl;
import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.TripleVO;
import com.yimengael.ml.model.TriplesVO;
import com.yimengael.ml.model.WorkDepartmentVO;
import com.yimengael.ml.tools.Constants;
import com.yimengael.ml.tools.Utils;

public class WorkDepartmentServiceImpl implements IWorkDepartmentService {

	final IWorkDepartmentDao mWorkDepartmentDao = new WorkDepartmentDaoImpl();

	/**
	 * 
	 */
	@Override
	public String addWorkDepartment(WorkDepartmentVO pWorkDepartmentVO) throws TechnicalException {

		// Set Work Department document properties
		pWorkDepartmentVO.setDocumentURI(Constants.WORK_DEPARTMENT_URI_PREFIX
				+ Constants.WORK_DEPARTMENT_FILES_URI_PREFIX + "_" + pWorkDepartmentVO.getDepartmentId());
		pWorkDepartmentVO.setTriples(new TriplesVO());

		List<TripleVO> tripleVOList = pWorkDepartmentVO.getTriples().getListOfTriples();
		tripleVOList.add(new TripleVO(pWorkDepartmentVO.getDocumentURI(), Constants.WORK_DEPARTMENT_PREDICATE,
				pWorkDepartmentVO.getDepartmentId()));
		tripleVOList.add(new TripleVO(pWorkDepartmentVO.getDocumentURI(), Constants.WORK_DEPARTMENT_PREDICATE,
				pWorkDepartmentVO.getDepartmentName()));

		return mWorkDepartmentDao.addWorkDepartment(pWorkDepartmentVO);
	}

	/**
	 * 
	 */
	@Override
	public WorkDepartmentVO getWorkDepartment(String pDepartmentId) throws TechnicalException {
		String vWorkDeptDocumentURI = Constants.WORK_DEPARTMENT_URI_PREFIX + Constants.WORK_DEPARTMENT_FILE_PREFIX_NAME + "_"
				+ pDepartmentId;
		WorkDepartmentVO vWorkDepartmentVO = mWorkDepartmentDao.findWorkDepartmentById(vWorkDeptDocumentURI);
		return vWorkDepartmentVO;
	}

}
