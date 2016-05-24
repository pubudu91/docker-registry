package io.swagger.api.factories;

import io.swagger.api.NameApiService;
import io.swagger.api.impl.NameApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-24T22:16:54.859+05:30")
public class NameApiServiceFactory {

   private final static NameApiService service = new NameApiServiceImpl();

   public static NameApiService getNameApi()
   {
      return service;
   }
}
