package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.StaffInformation;
import io.swagger.model.ErrorModel;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-17T17:09:25.913Z")
public abstract class WsCrudStaffApiService {
  
      public abstract Response wsCrudStaffGet(List<String> timestamp,List<String> staffId,List<String> staffSsn,List<String> staffFirstName,List<String> staffLastName,List<String> staffManager,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudStaffPost(StaffInformation body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudStaffIdGet(String id,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudStaffIdPut(String id,StaffInformation body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudStaffIdDelete(String id,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response wsCrudStaffIdPatch(String id,StaffInformation body,SecurityContext securityContext)
      throws NotFoundException;
  
}
