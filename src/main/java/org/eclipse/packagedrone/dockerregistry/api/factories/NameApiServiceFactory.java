package org.eclipse.packagedrone.dockerregistry.api.factories;

import org.eclipse.packagedrone.dockerregistry.api.NameApiService;
import org.eclipse.packagedrone.dockerregistry.api.impl.NameApiServiceImpl;


public class NameApiServiceFactory {
    private final static NameApiService service = new NameApiServiceImpl();

    public static NameApiService getNameApi() {
        return service;
    }
}
