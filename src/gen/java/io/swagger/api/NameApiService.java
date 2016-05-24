package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse401;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-24T22:16:54.859+05:30")
public abstract class NameApiService {
  
      public abstract Response nameBlobsDigestGet(String name,String digest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameBlobsDigestHead(String name,String digest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameBlobsUploadsPost(String name,String digest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameBlobsUploadsUuidDelete(String name,String uuid,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameBlobsUploadsUuidGet(String name,String uuid,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameBlobsUploadsUuidPatch(String name,String uuid,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameBlobsUploadsUuidPut(String name,String uuid,String digest,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameManifestsReferenceDelete(String name,String reference,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameManifestsReferenceGet(String name,String reference,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameManifestsReferencePut(String name,String reference,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response nameTagsListGet(String name,SecurityContext securityContext)
      throws NotFoundException;
  
}
