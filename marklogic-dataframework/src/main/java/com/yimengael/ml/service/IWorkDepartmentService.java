package com.yimengael.ml.service;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.WorkDepartmentVO;

/**
 * IWorkDepartmentService - Interface Work Department Service.
 *
 * @version 1.0
 * @see
 * @author Gael Yimen
 */
public interface IWorkDepartmentService {

	public String addWorkDepartment(WorkDepartmentVO pWorkDepartmentVO) throws TechnicalException;
	public WorkDepartmentVO getWorkDepartment(String pDepartmentId) throws TechnicalException;

}
