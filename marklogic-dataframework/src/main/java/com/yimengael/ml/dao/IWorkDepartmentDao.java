package com.yimengael.ml.dao;

import com.yimengael.ml.exceptions.TechnicalException;
import com.yimengael.ml.model.WorkDepartmentVO;

/**
 * IWorkDepartmentDao - Interface Work Department DAO.
 *
 * @version 1.0
 * @see
 * @author
 */
public interface IWorkDepartmentDao {

	public String addWorkDepartment(WorkDepartmentVO pWorkDepartment) throws TechnicalException;

	public WorkDepartmentVO findWorkDepartmentById(String pDepartmentID) throws TechnicalException;
}
