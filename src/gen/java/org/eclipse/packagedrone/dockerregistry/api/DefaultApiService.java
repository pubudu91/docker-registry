package org.eclipse.packagedrone.dockerregistry.api;

import org.eclipse.packagedrone.dockerregistry.api.*;
import org.eclipse.packagedrone.dockerregistry.models.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.eclipse.packagedrone.dockerregistry.models.InlineResponse401;

import java.util.List;
import org.eclipse.packagedrone.dockerregistry.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;


public abstract class DefaultApiService {
    public abstract Response rootGet(SecurityContext securityContext) throws NotFoundException;
}
