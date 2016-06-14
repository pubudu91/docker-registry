package org.eclipse.dockerregistry.storage;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

/**
 * <h1>Storage Driver</h1>
 * This interface decouples the Docker Registry from the storage and allows to plug in
 * any suitable storage mechanism.
 */
public interface StorageDriver {
    /**
     * This method is used to retrieve the name of the storage driver
     * @return String The name of this storage driver
     */
    String getName();

    /**
     * This method retrieves an InputStream for the file specified by the path parameter. The offset
     * can be used as a means of resuming a stream reading.
     * @param path Path of the file to be read
     * @param offset Starting point to read the file
     * @return InputStream Returns an InputStream for the specified file, if it is present.
     */
//    InputStream getInputStream(Path path, long offset);

    InputStream getInputStreamForManifest(String name, String reference) throws IOException;

    InputStream getInputStreamForBlob(String name, String digest) throws IOException;

    InputStream getInputStreamForBlobUpload(String name, String uuid) throws IOException;

    /**
     * This method returns a FileWriter to write data to the file specified by the path parameter.
     * @param path Destination file to write data to
     * @param append Pass 'true' if the data needs to be appended to the specified file
     * @return FileWriter
     */
    Writer getWriterForManifests(String name, String reference);

    OutputStream getOutputStreamForBlobPostUpload(String name, String digest) throws IOException;

    Writer getWriterForBlobUploadUuid(String name, String uuid);


    /**
     * This method returns a FileInfo object containing data about the file specified by the path parameter.
     * @param path Path of the file
     * @return FileInfo
     */
    FileInfo getManifestStats(Path path);

    /**
     * This method returns a list of direct descendants of the path specified by the path parameter.
     *  @return List<Path> A list of direct descendants
     * @param name
     */
    List<String> getTags(String name);

    /**
     * This method copies the file at sourcePath to the path specified by the destinationPath. The original file
     * is then deleted.
     * @param sourcePath Source file to be moved
     * @param destinationPath Destination path of the source file
     * @return boolean Returns true if the file was moved successfully.
     */
    boolean move(Path sourcePath, Path destinationPath);

    /**
     * This method deletes the file specified by the path parameter.
     * @param path File to be deleted
     * @return boolean Returns true if the file was successfully deleted.
     */
    boolean delete(Path path);

    boolean repositoryExists(String name);

    /**
     * This method returns a URL the file specified by the path parameter. This URL can be used to
     * retrieve content located at the given path.
     * @param path Path of the file
     * @param options Optional set of options according to which the URL should be created
     * @return URL Returns a URL object
     */
    URL urlFor(Path path, Map<String, String> options);
}
