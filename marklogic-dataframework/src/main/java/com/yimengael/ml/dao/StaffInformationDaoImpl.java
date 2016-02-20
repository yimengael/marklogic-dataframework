package com.yimengael.ml.dao;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.StaffInformationVO;
import com.yimengael.ml.tools.Constants;

public class StaffInformationDaoImpl implements IStaffInformationDao {
	
	private IMarkLogicDao vMarkLogicDao = new MarkLogicDaoImpl();

	/**
	 * @param pStaffInformationVO
	 */
	@Override
	public String addWorkDepartment(StaffInformationVO pStaffInformationVO) throws TechnicalException {
		
		pStaffInformationVO.setDocumentURI(Constants.STAFF_INFORMATION_COLLECTION_FILES_URI_PREFIX + Constants.STAFF_INFORMATION_FILE_PREFIX_NAME + "_" + pStaffInformationVO.getStaffId());
		return vMarkLogicDao.write(pStaffInformationVO, Constants.STAFF_INFORMATION_COLLECTION);
	}

	/**
	 * @param pStaffID
	 */
	@Override
	public StaffInformationVO findWorkDepartmentById(String pStaffID) throws TechnicalException {
		// TODO Auto-generated method stub
		String vDocumentURI = Constants.STAFF_INFORMATION_COLLECTION_FILES_URI_PREFIX + Constants.STAFF_INFORMATION_FILE_PREFIX_NAME + "_" + pStaffID;
		
		StaffInformationVO vStaffInformationVO = (StaffInformationVO) vMarkLogicDao.getDocumentByURI(vDocumentURI, Constants.STAFF_INFORMATION_COLLECTION);
		vStaffInformationVO.setDocumentURI(vDocumentURI);
		
		return vStaffInformationVO;
	}

}
