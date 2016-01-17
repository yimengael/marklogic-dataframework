package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.WsCrudDepartmentApiService;
import io.swagger.api.factories.WsCrudDepartmentApiServiceFactory;
import io.swagger.jaxrs.PATCH;
import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.WorkDepartment;
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

@Path("/ws_crud_department")
@Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
@Produces({ "application/json", "application/xml", "text/xml", "text/html" })
@io.swagger.annotations.Api(description = "the ws_crud_department API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-17T17:09:25.913Z")
public class WsCrudDepartmentApi  {
   private final WsCrudDepartmentApiService delegate = WsCrudDepartmentApiServiceFactory.getWsCrudDepartmentApi();

    @GET
    
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns all departments in the system", response = WorkDepartment.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Department response", response = WorkDepartment.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = WorkDepartment.class, responseContainer = "List") })

    public Response wsCrudDepartmentGet(@ApiParam(value = "data to filter by timestamp" ,required=true)@HeaderParam("timestamp") List<String> timestamp,@ApiParam(value = "tags to filter by") @QueryParam("department_id") List<String> departmentId,@ApiParam(value = "tags to filter by") @QueryParam("department_name") List<String> departmentName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudDepartmentGet(timestamp,departmentId,departmentName,securityContext);
    }
    @POST
    
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Creates a new department in the system", response = WorkDepartment.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Department response", response = WorkDepartment.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = WorkDepartment.class) })

    public Response wsCrudDepartmentPost(@ApiParam(value = "The object department to be saved in the database" ,required=true) WorkDepartment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudDepartmentPost(body,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a department based on a given id", response = WorkDepartment.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Department response", response = WorkDepartment.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = WorkDepartment.class) })

    public Response wsCrudDepartmentIdGet(@ApiParam(value = "ID of a department to fetch",required=true) @PathParam("id") String id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudDepartmentIdGet(id,securityContext);
    }
    @PUT
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "update department based on a single ID", response = WorkDepartment.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "department response", response = WorkDepartment.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = WorkDepartment.class) })

    public Response wsCrudDepartmentIdPut(@ApiParam(value = "ID of a department to fetch",required=true) @PathParam("id") String id,@ApiParam(value = "Parameters to update for departments" ) WorkDepartment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudDepartmentIdPut(id,body,securityContext);
    }
    @DELETE
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "deletes a single department based on the ID supplied", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "department to be deleted", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Void.class) })

    public Response wsCrudDepartmentIdDelete(@ApiParam(value = "ID of department to delete",required=true) @PathParam("id") String id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudDepartmentIdDelete(id,securityContext);
    }
    
    @PATCH
    @Path("/{id}")
    @Consumes({ "application/json", "application/xml", "text/xml", "text/html" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "update partial a department", response = WorkDepartment.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Department response", response = WorkDepartment.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = WorkDepartment.class) })

    public Response wsCrudDepartmentIdPatch(@ApiParam(value = "ID of department to fetch",required=true) @PathParam("id") String id,@ApiParam(value = "Parameters to update for departments" ) WorkDepartment body,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.wsCrudDepartmentIdPatch(id,body,securityContext);
    }
}
