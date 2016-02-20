package com.yimengael.ml.service;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.StaffInformationVO;

/**
 * IStaffInformationService - Interface Staff Information Service.
 *
 * @version 1.0
 * @see
 * @author Gael Yimen
 */
public interface IStaffInformationService {

	public String addStaffInformation(StaffInformationVO pStaffInformationVO) throws TechnicalException;
	public StaffInformationVO getStaffInformation(String pStaffID) throws TechnicalException;
}
