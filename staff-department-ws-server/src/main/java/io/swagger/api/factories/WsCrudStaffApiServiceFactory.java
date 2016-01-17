package io.swagger.api.factories;

import io.swagger.api.WsCrudStaffApiService;
import io.swagger.api.impl.WsCrudStaffApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-17T17:09:25.913Z")
public class WsCrudStaffApiServiceFactory {

   private final static WsCrudStaffApiService service = new WsCrudStaffApiServiceImpl();

   public static WsCrudStaffApiService getWsCrudStaffApi()
   {
      return service;
   }
}
