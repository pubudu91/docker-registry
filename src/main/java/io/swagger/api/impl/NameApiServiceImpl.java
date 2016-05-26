package io.swagger.api.impl;

import io.swagger.api.*;

import io.swagger.model.InlineResponse2001;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import io.swagger.api.NotFoundException;

import org.eclipse.dockerregistry.storage.StorageDriver;
import org.eclipse.dockerregistry.storage.drivers.FileSystemStorageDriver;
import org.eclipse.dockerregistry.utils.Endpoint;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-24T22:16:54.859+05:30")
public class NameApiServiceImpl extends NameApiService {
    
    @Override
    public Response nameBlobsDigestGet(String name, String digest, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameBlobsDigestHead(String name, String digest, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameBlobsUploadsPost(String name, String digest, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameBlobsUploadsUuidDelete(String name, String uuid, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameBlobsUploadsUuidGet(String name, String uuid, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameBlobsUploadsUuidPatch(String name, String uuid, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameBlobsUploadsUuidPut(String name, String uuid, String digest, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameManifestsReferenceDelete(String name, String reference, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameManifestsReferenceGet(String name, String reference, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameManifestsReferencePut(String name, String reference, SecurityContext securityContext)
    throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    
    @Override
    public Response nameTagsListGet(String name, SecurityContext securityContext)
    throws NotFoundException {
        StorageDriver driver = FileSystemStorageDriver.getInstance(); // TODO: Set this to be taken from a config file
        List<File> tagFiles = driver.getDirectDescendants(Endpoint.TagsList, name);
        List<String> tags = new ArrayList<>();

        tagFiles.forEach(tag -> tags.add(tag.getName()));

        InlineResponse2001 entity = new InlineResponse2001()
                                            .name(name)
                                            .tags(tags);

        return Response.ok().entity(entity).build();
    }
    
}
