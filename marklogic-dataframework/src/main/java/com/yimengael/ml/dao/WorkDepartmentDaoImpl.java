package com.yimengael.ml.dao;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.WorkDepartmentVO;
import com.yimengael.ml.tools.Constants;

public class WorkDepartmentDaoImpl implements IWorkDepartmentDao {

	private IMarkLogicDao vMarkLogicDao = new MarkLogicDaoImpl();

	/**
	 * @param pWorkDepartmentVO
	 */
	@Override
	public String addWorkDepartment(WorkDepartmentVO pWorkDepartmentVO) throws TechnicalException {
		
		//pWorkDepartmentVO.setDocumentURI(Constants.WORK_DEPARTMENT_URI_PREFIX + Constants.WORK_DEPARTMENT_FILE_PREFIX_NAME + "_" + pWorkDepartmentVO.getDepartmentId());
		return vMarkLogicDao.write(pWorkDepartmentVO, Constants.WORK_DEPARTMENT_COLLECTION);
	}

	/**
	 * @param pDepartmentID
	 */
	@Override
	public WorkDepartmentVO findWorkDepartmentById(String pDepartmentID) throws TechnicalException {
		
		String vDocumentURI = Constants.WORK_DEPARTMENT_URI_PREFIX + Constants.WORK_DEPARTMENT_FILE_PREFIX_NAME + "_" + pDepartmentID;
		
		WorkDepartmentVO vWorkDepartmentVO = (WorkDepartmentVO) vMarkLogicDao.getDocumentByURI(vDocumentURI, Constants.WORK_DEPARTMENT_COLLECTION);
		vWorkDepartmentVO.setDocumentURI(vDocumentURI);
		
		return vWorkDepartmentVO;
	}

}
