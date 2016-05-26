package org.eclipse.dockerregistry.storage.drivers;

import org.eclipse.dockerregistry.storage.FileInfo;
import org.eclipse.dockerregistry.storage.StorageDriver;
import org.eclipse.dockerregistry.utils.Endpoint;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * An implementation of the Storage Driver interface to provide support for file system storage
 * for the Docker Registry.
 */
public class FileSystemStorageDriver implements StorageDriver {
    private static final FileSystemStorageDriver driver = new FileSystemStorageDriver();
    private final String name = "File System Storage Driver";
    private final String rootPath = "/home/pubudu/gsoc/docker/registry/v2/"; //TODO: Make this configurable through the yaml file
    private final Path registryRoot; // Represents the root directory of the Registry storage
    private final Path blobs; // Represents the <registryRoot>/blobs directory
    private final Path repositories; // Represents the <registryRoot>/repositories directory

    private FileSystemStorageDriver() {
        registryRoot = Paths.get(rootPath);
        blobs = Paths.get(rootPath, "blobs");
        repositories = Paths.get(rootPath, "repositories");
    }

    public static FileSystemStorageDriver getInstance() {
        return driver;
    }

    public String getName() {
        return this.name;
    }

    public InputStream getInputStream(Path path, long offset) {

        return null;
    }

    public FileWriter getWriter(Path path, boolean append) {
        return null;
    }

    public FileInfo getStats(Path path) {
        return null;
    }

    public List<File> getDirectDescendants(Endpoint endpoint, String... parameters) {
        switch (endpoint) {
            case TagsList:
                Path path = new FileSystemPathBuilder().getPathForTagsList(parameters[0]);
                File[] tags = path.toFile().listFiles(File::isDirectory);
                return Arrays.asList(tags);
        }
        return null;
    }

    public boolean move(Path sourcePath, Path destinationPath) {
        return false;
    }

    public boolean delete(Path path) {
        return false;
    }

    public URL urlFor(Path path, Map<String, String> options) {
        throw new UnsupportedOperationException();
    }
}
