package io.swagger.api.factories;

import io.swagger.api.DefaultApiService;
import io.swagger.api.impl.DefaultApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-24T22:16:54.859+05:30")
public class DefaultApiServiceFactory {

   private final static DefaultApiService service = new DefaultApiServiceImpl();

   public static DefaultApiService getDefaultApi()
   {
      return service;
   }
}
