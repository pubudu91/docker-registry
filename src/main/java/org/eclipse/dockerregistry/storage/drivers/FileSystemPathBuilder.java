package org.eclipse.dockerregistry.storage.drivers;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class FileSystemPathBuilder {
    private final String rootPath = "/home/pubudu/gsoc/docker/registry/v2/"; //TODO: Make this configurable through the yaml file
    private final Path registryRoot; // Represents the root directory of the Registry storage
    private final Path blobs; // Represents the <registryRoot>/blobs directory
    private final Path repositories; // Represents the <registryRoot>/repositories directory

    public FileSystemPathBuilder() {
        registryRoot = Paths.get(rootPath);
        blobs = Paths.get(rootPath, "blobs");
        repositories = Paths.get(rootPath, "repositories");
    }

    public Path getPathForManifests(String name, String reference) {
        return Paths.get(repositories.toString(), name, reference);
    }

    public Path getPathForTagsList(String name) {
        return Paths.get(repositories.toString(), name, "manifests/tags");
    }

    private boolean isValidNamespace(String path) {
        Pattern pattern = Pattern.compile("^(/[A-Za-z0-9._-]+)+$");
        return pattern.matcher(path).matches();
    }
}
