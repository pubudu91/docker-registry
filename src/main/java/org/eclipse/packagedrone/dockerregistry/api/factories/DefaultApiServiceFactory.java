package org.eclipse.packagedrone.dockerregistry.api.factories;

import org.eclipse.packagedrone.dockerregistry.api.DefaultApiService;
import org.eclipse.packagedrone.dockerregistry.api.impl.DefaultApiServiceImpl;


public class DefaultApiServiceFactory {
    private final static DefaultApiService service = new DefaultApiServiceImpl();

    public static DefaultApiService getDefaultApi() {
        return service;
    }
}
