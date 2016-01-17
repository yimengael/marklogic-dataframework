package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.WorkDepartment;
import io.swagger.model.ErrorModel;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-17T17:09:25.913Z")
public abstract class WsCrudDepartmentApiService {
  
      public abstract Response wsCrudDepartmentGet(List<String> timestamp,List<String> departmentId,List<String> departmentName,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudDepartmentPost(WorkDepartment body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudDepartmentIdGet(String id,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudDepartmentIdPut(String id,WorkDepartment body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudDepartmentIdDelete(String id,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudDepartmentIdPatch(String id,WorkDepartment body,SecurityContext securityContext)
      throws NotFoundException;
  
}
