package io.swagger.api.impl;

import io.swagger.api.ApiResponseMessage;
import io.swagger.api.NameApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.Error;
import io.swagger.model.Tags;
import org.eclipse.dockerregistry.storage.StorageDriver;
import org.eclipse.dockerregistry.storage.drivers.FileSystemStorageDriver;
import org.eclipse.dockerregistry.utils.ErrorCodes;
import org.eclipse.dockerregistry.utils.ErrorEntityBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.regex.Pattern;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-24T22:16:54.859+05:30")
public class NameApiServiceImpl extends NameApiService {

    @Override
    public Response nameBlobsDigestGet(String name, String digest, SecurityContext securityContext)
            throws NotFoundException {

        if (!isValidNamespace(name)) {
            Error error = ErrorEntityBuilder.buildError(ErrorCodes.NAME_INVALID, "invalid repository name", "");
            return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
        }

        StorageDriver driver = FileSystemStorageDriver.getInstance();

        if (!driver.repositoryExists(name)) {
            Error error = ErrorEntityBuilder.buildError(ErrorCodes.NAME_UNKNOWN,
                    "Repository name not known to registry", "");

            return Response.status(Response.Status.NOT_FOUND).entity(error).build();
        }

        try {
            InputStream input = driver.getInputStreamForBlob(name, digest);
            return Response.ok(input, MediaType.APPLICATION_OCTET_STREAM)
                    .header("Docker-Content-Digest", digest).build();
        } catch (IOException e) {
            e.printStackTrace();
            Error error = ErrorEntityBuilder.buildError(ErrorCodes.BLOB_UNKNOWN, "blob unknown to registry", "");

            return Response.status(Response.Status.NOT_FOUND).entity(error).build();
        }
    }

    @Override
    public Response nameBlobsDigestHead(String name, String digest, SecurityContext securityContext)
            throws NotFoundException {
        return null;
    }

    /*    if (!isValidNamespace(name))
            return Response.status(Response.Status.BAD_REQUEST).build();

        StorageDriver driver = FileSystemStorageDriver.getInstance();

        if (!driver.repositoryExists(name))
            return Response.status(Response.Status.NOT_FOUND).build();

        try {
            InputStream input = driver.getInputStreamForBlob(name, digest);
            long contentLength = 0;

            while (input.read() != -1)
                contentLength++;

            Logger log = LoggerFactory.getLogger(this.getClass());
            log.info("Content Length: " + contentLength);
            return Response.ok(MediaType.APPLICATION_OCTET_STREAM)
                    .header("Docker-Content-Digest", digest)
                    .header("Content-Length", contentLength).build();

        } catch (IOException e) {
            e.printStackTrace();
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }*/

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

        if (!isValidNamespace(name)) {
            Error error = ErrorEntityBuilder.buildError(ErrorCodes.NAME_INVALID, "invalid repository name", "");
            return Response.status(Response.Status.BAD_REQUEST).entity(error).build();
        }

        StorageDriver driver = FileSystemStorageDriver.getInstance();

        if (!driver.repositoryExists(name)) {
            Error error = ErrorEntityBuilder.buildError(ErrorCodes.NAME_UNKNOWN,
                    "Repository name not known to registry", "");

            return Response.status(Response.Status.NOT_FOUND).entity(error).build();
        }

        try {
            InputStream input = driver.getInputStreamForManifest(name, reference);
            return Response.ok(input, MediaType.APPLICATION_JSON)
                    .header("Docker-Content-Digest", reference).build();
        } catch (IOException e) {
            e.printStackTrace();
            Error error = ErrorEntityBuilder.buildError(ErrorCodes.BLOB_UNKNOWN, "blob unknown to registry", "");

            return Response.status(Response.Status.NOT_FOUND).entity(error).build();
        }
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
        List<String> tags = driver.getTags(name);

        Tags entity = new Tags()
                .name(name)
                .tags(tags);

        return Response.ok().entity(entity).build();
    }

    private boolean isValidNamespace(String path) {
        Pattern pattern = Pattern.compile("^([A-Za-z0-9._s-]+)+$");
        return pattern.matcher(path).matches();
    }
}
