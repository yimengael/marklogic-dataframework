package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.WsCrudStaffApiService;
import io.swagger.api.factories.WsCrudStaffApiServiceFactory;
import io.swagger.jaxrs.PATCH;
import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.StaffInformation;
import io.swagger.model.ErrorModel;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/ws_crud_staff")
@Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
@Produces({ "application/json", "application/xml", "text/xml", "text/html" })
@io.swagger.annotations.Api(description = "the ws_crud_staff API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-17T17:09:25.913Z")
public class WsCrudStaffApi  {
   private final WsCrudStaffApiService delegate = WsCrudStaffApiServiceFactory.getWsCrudStaffApi();

    @GET
    
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all staffs in the system", response = StaffInformation.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Staff response", response = StaffInformation.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = StaffInformation.class, responseContainer = "List") })

    public Response wsCrudStaffGet(@ApiParam(value = "tags to filter by timestamp" ,required=true)@HeaderParam("timestamp") List<String> timestamp,@ApiParam(value = "tags to filter by") @QueryParam("staff_id") List<String> staffId,@ApiParam(value = "tags to filter by") @QueryParam("staff_ssn") List<String> staffSsn,@ApiParam(value = "tags to filter by") @QueryParam("staff_firstName") List<String> staffFirstName,@ApiParam(value = "tags to filter by") @QueryParam("staff_lastName") List<String> staffLastName,@ApiParam(value = "tags to filter by") @QueryParam("staff_manager") List<String> staffManager,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudStaffGet(timestamp,staffId,staffSsn,staffFirstName,staffLastName,staffManager,securityContext);
    }
    @POST
    
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new staff in the system", response = StaffInformation.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Staff response", response = StaffInformation.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = StaffInformation.class) })

    public Response wsCrudStaffPost(@ApiParam(value = "The object staff to be saved in the database" ,required=true) StaffInformation body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudStaffPost(body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a staff based on a given id", response = StaffInformation.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Staff response", response = StaffInformation.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = StaffInformation.class) })

    public Response wsCrudStaffIdGet(@ApiParam(value = "ID of a staff to fetch",required=true) @PathParam("id") String id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudStaffIdGet(id,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "update staff based on a single ID", response = StaffInformation.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "staff response", response = StaffInformation.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = StaffInformation.class) })

    public Response wsCrudStaffIdPut(@ApiParam(value = "ID of a staff to fetch",required=true) @PathParam("id") String id,@ApiParam(value = "Parameters to update for staffs" ) StaffInformation body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudStaffIdPut(id,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single staff based on the ID supplied", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "staff to be deleted", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Void.class) })

    public Response wsCrudStaffIdDelete(@ApiParam(value = "ID of staff to delete",required=true) @PathParam("id") String id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudStaffIdDelete(id,securityContext);
    }
    
    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "update partial a department", response = StaffInformation.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "staff response", response = StaffInformation.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = StaffInformation.class) })

    public Response wsCrudStaffIdPatch(@ApiParam(value = "ID of staff to fetch",required=true) @PathParam("id") String id,@ApiParam(value = "Parameters to update for staffs" ) StaffInformation body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudStaffIdPatch(id,body,securityContext);
    }
}
