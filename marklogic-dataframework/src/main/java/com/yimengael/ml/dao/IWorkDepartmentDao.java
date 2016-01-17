package com.yimengael.ml.dao;

import java.util.List;

import com.yimengael.ml.model.WorkDepartment;

/**
 * IWorkDepartmentDao - Interface Individual Contact.
 *
 * @version 1.0
 * @see
 * @author
 */
public interface IWorkDepartmentDao {

	public void addWorkDepartment(WorkDepartment vWorkDepartment);

	public WorkDepartment findWorkDepartmentById(String id);

	public WorkDepartment removeWorkDepartment(String id);

	public List<WorkDepartment> findAllWorkDepartment();

	public String displayWorkDepartment();
}
