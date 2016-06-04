package org.eclipse.packagedrone.dockerregistry.api.impl;

import org.eclipse.packagedrone.dockerregistry.api.*;
import org.eclipse.packagedrone.dockerregistry.models.*;

import org.eclipse.packagedrone.dockerregistry.models.InlineResponse401;

import java.util.List;
import org.eclipse.packagedrone.dockerregistry.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public class DefaultApiServiceImpl extends DefaultApiService {
    @Override
    public Response rootGet(SecurityContext securityContext) throws NotFoundException {
        return Response.ok().header("Docker-Distribution-API-Version", "registry/2.0").build();
    }
}
