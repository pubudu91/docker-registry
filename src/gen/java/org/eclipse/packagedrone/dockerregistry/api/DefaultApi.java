package org.eclipse.packagedrone.dockerregistry.api;

import org.eclipse.packagedrone.dockerregistry.models.*;
import org.eclipse.packagedrone.dockerregistry.api.DefaultApiService;
import org.eclipse.packagedrone.dockerregistry.api.factories.DefaultApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.eclipse.packagedrone.dockerregistry.models.InlineResponse401;

import java.util.List;
import org.eclipse.packagedrone.dockerregistry.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/")


@io.swagger.annotations.Api(description = "the  API")

public class DefaultApi  {
   private final DefaultApiService delegate = DefaultApiServiceFactory.getDefaultApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "Tells whether this Docker Registry instance supports Docker Registry HTTP API v2", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response. API v2 supported", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Registry does not implement v2 of the API", response = void.class) })
    public Response rootGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rootGet(securityContext);
    }
}
