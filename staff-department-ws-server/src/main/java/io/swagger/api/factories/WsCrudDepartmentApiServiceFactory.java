package io.swagger.api.factories;

import io.swagger.api.WsCrudDepartmentApiService;
import io.swagger.api.impl.WsCrudDepartmentApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-17T17:09:25.913Z")
public class WsCrudDepartmentApiServiceFactory {

   private final static WsCrudDepartmentApiService service = new WsCrudDepartmentApiServiceImpl();

   public static WsCrudDepartmentApiService getWsCrudDepartmentApi()
   {
      return service;
   }
}
