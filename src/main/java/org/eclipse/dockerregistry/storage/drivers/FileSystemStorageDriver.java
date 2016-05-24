package org.eclipse.dockerregistry.storage.drivers;

import org.eclipse.dockerregistry.storage.FileInfo;
import org.eclipse.dockerregistry.storage.StorageDriver;

import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * An implementation of the Storage Driver interface to provide support for file system storage
 * for the Docker Registry.
 */
public class FileSystemStorageDriver implements StorageDriver {
    private String name;

    public String getName() {
        return this.name;
    }

    public byte[] getContent(String path) {
        return new byte[0];
    }

    public boolean putContent(String path, byte[] content) {
        return false;
    }

    public InputStream getInputStream(String path, long offset) {
        return null;
    }

    public FileWriter getWriter(String path, boolean append) {
        return null;
    }

    public FileInfo getStats(String path) {
        return null;
    }

    public List<String> getDirectDescendants(String path) {
        return null;
    }

    public boolean move(String sourcePath, String destinationPath) {
        return false;
    }

    public boolean delete(String path) {
        return false;
    }

    public URL urlFor(String path, Map<String, String> options) {
        throw new UnsupportedOperationException();
    }

    private boolean isValidPath(String path) {
        Pattern pattern = Pattern.compile("^(/[A-Za-z0-9._-]+)+$");
        return pattern.matcher(path).matches();
    }
}
