package com.github.ambry.api;

import java.io.File;
import java.io.InputStream;

/**
 * This is a client for Java application to invoke Ambry REST api.
 *
 * @author Zhong.Zewei Create on 2016.06.08.
 */
public interface IAmbryClient {

    /**
     * Check the status of the frontend
     * @return the status code
     */
    int healthCheck();

    /**
     * Get the file properties represented by the ambryId
     * @param ambryId the file's ambryId
     * @return file's info of the given resource id
     */
    String getFileProperty(String ambryId);

    /**
     * Upload a file with the file's path.
     * @param filePath file's path at local
     * @return information with save status and the resource id, i.e. ambryId, response from Amby
     */
    String postFile(String filePath);

    /**
     * Upload a file with the given input stream
     * @param inputStream file's input stream
     * @return save status and the resource id response from Ambry
     */
    String postFile(InputStream inputStream);

    /**
     * Upload a file
     * @param file the file which will be uploaded
     * @return save status and the resource id response from Ambry
     */
    String postFile(File file);

    /**
     * Delete a file with a given resource Id
     * @param ambryId resource id of the target file
     * @return remove status
     */
    String deleteFile(String ambryId);

}
