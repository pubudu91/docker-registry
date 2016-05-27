package org.eclipse.dockerregistry.storage.drivers;

import org.eclipse.dockerregistry.storage.FileInfo;
import org.eclipse.dockerregistry.storage.StorageDriver;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
    private FileSystemPathBuilder pathBuilder;

    private FileSystemStorageDriver() {
        registryRoot = Paths.get(rootPath);
        blobs = Paths.get(rootPath, "blobs");
        repositories = Paths.get(rootPath, "repositories");
        pathBuilder = new FileSystemPathBuilder(registryRoot, blobs, repositories);
        //TODO: Create the storage layout on disk
    }

    public static FileSystemStorageDriver getInstance() {
        return driver;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public InputStream getInputStreamForManifest(String name, String reference) throws IOException {

        return null;
    }

    @Override
    public InputStream getInputStreamForBlob(String name, String digest) throws IOException {
        Path repoPath = pathBuilder.getPathForLayer(name, digest);
        File file = repoPath.toFile();

        if (file.exists()) {
            Path blobPath = pathBuilder.getPathForBlob(name, digest);
            File blob = blobPath.toFile();

            return new FileInputStream(blob);
        }
        else
            throw new FileNotFoundException("Requested repository path not found: " + file);
    }

    @Override
    public InputStream getInputStreamForBlobUpload(String name, String uuid) throws IOException {
        return null;
    }

    @Override
    public Writer getWriterForManifests(String name, String reference) {
        return null;
    }

    @Override
    public Writer getWriterForBlobPostUpload(String name, String digest) {
        return null;
    }

    @Override
    public Writer getWriterForBlobUploadUuid(String name, String uuid) {
        return null;
    }

    @Override
    public FileInfo getManifestStats(Path path) {
        return null;
    }

    public FileWriter getWriter(Path path, boolean append) {
        return null;
    }

    public FileInfo getStats(Path path) {
        return null;
    }

    public List<String> getTags(String name) {
        Path path = pathBuilder.getPathForTagsList(name);
        File[] tagFiles = path.toFile().listFiles(File::isDirectory);
        List<String> tags = new ArrayList<>();

        for (File tagFile : tagFiles) {
            tags.add(tagFile.getName());
        }
        return tags;
    }

    public boolean move(Path sourcePath, Path destinationPath) {
        return false;
    }

    public boolean delete(Path path) {
        return false;
    }

    @Override
    public boolean repositoryExists(String name) {
        Path path = Paths.get(repositories.toString(), name);
        return path.toFile().exists();
    }

    public URL urlFor(Path path, Map<String, String> options) {
        throw new UnsupportedOperationException();
    }
}
