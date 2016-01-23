package com.yimengael.ml.dao;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marklogic.client.document.DocumentWriteSet;
import com.marklogic.client.document.JSONDocumentManager;
import com.marklogic.client.io.Format;
import com.marklogic.client.io.StringHandle;
import com.yimengael.ml.model.WorkDepartment;
import com.yimengael.ml.tool.ConfigParameter;
import com.yimengael.ml.tool.MLDataSource;

public class WorkDepartmentDaoImpl implements IWorkDepartmentDao {

	public void addWorkDepartment(WorkDepartment vWorkDepartment) {
		
		//Logger d'entree
		
		JSONDocumentManager jsonDocMgr = MLDataSource.getConnection().newJSONDocumentManager();
		DocumentWriteSet jsonBatch = jsonDocMgr.newWriteSet();
		
		String jsonStrWorkDept = new String("");
		ObjectMapper objMapper = new ObjectMapper();
		try {
			jsonStrWorkDept = objMapper.writeValueAsString(vWorkDepartment);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		StringHandle strHandle = new StringHandle(jsonStrWorkDept).withFormat(Format.JSON);
		jsonBatch.add(ConfigParameter.root_path+ConfigParameter.work_dept_path+ vWorkDepartment.getDepartmentName() +".json", strHandle);
		jsonDocMgr.write(jsonBatch);
		
		//Logger de sortie
		
	}

	public WorkDepartment findWorkDepartmentById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public WorkDepartment removeWorkDepartment(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WorkDepartment> findAllWorkDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	public String displayWorkDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

}
