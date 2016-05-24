package org.eclipse.dockerregistry.storage;

public class FileInfo {
    private String filename;
    private String path;
    private long size;
    private String createdDate;

    public FileInfo(String filename, String path, long size, String createdDate) {
        this.filename = filename;
        this.path = path;
        this.size = size;
        this.createdDate = createdDate;
    }

    public String getFilename() {
        return filename;
    }

    public String getPath() {
        return path;
    }

    public long getSize() {
        return size;
    }

    public String getCreatedDate() {
        return createdDate;
    }
}
