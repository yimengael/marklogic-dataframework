package com.yimengael.ml.dao;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.StaffInformationVO;

public interface IStaffInformationDao {

	public String addStaffInformation(StaffInformationVO pStaffInformation) throws TechnicalException;

	public StaffInformationVO findStaffInformationById(String pStaffID) throws TechnicalException;
}
