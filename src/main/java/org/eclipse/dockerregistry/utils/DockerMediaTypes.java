package org.eclipse.dockerregistry.utils;

public class DockerMediaTypes {
    public static final String SCHEMA1 = "application/vnd.docker.distribution.manifest.v1+json";
    public static final String SCHEMA2 = "application/vnd.docker.distribution.manifest.v2+json";
    public static final String MANIFEST_LIST = "application/vnd.docker.distribution.manifest.list.v2+json";
    public static final String LAYER = "application/vnd.docker.image.rootfs.diff.tar.gzip";
    public static final String CONTAINER_CONFIG = "application/vnd.docker.container.image.v1+json";

    private DockerMediaTypes() {}
}
