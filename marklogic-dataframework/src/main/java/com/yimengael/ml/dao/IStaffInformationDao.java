package com.yimengael.ml.dao;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.StaffInformationVO;

public interface IStaffInformationDao {

	public String addWorkDepartment(StaffInformationVO pStaffInformation) throws TechnicalException;

	public StaffInformationVO findWorkDepartmentById(String pStaffID) throws TechnicalException;
}
