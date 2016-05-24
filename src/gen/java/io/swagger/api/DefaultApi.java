package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DefaultApiService;
import io.swagger.api.factories.DefaultApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse401;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/")


@io.swagger.annotations.Api(description = "the  API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-24T22:16:54.859+05:30")
public class DefaultApi  {
   private final DefaultApiService delegate = DefaultApiServiceFactory.getDefaultApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Tells whether this Docker Registry instance supports Docker Registry HTTP API v2", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response. API v2 supported", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Registry does not implement v2 of the API", response = void.class) })
    public Response rootGet(
        @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rootGet(securityContext);
    }
}
