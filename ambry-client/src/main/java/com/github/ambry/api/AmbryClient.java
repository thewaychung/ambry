package com.github.ambry.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.InputStream;

/**
 * This is a client for Java application to invoke Ambry REST api.
 *
 * @author Zhong.Zewei Create on 2016.06.08.
 */
public class AmbryClient implements IAmbryClient{

    private final Logger logger = LoggerFactory.getLogger(AmbryClient.class);

    @Override
    public int healthCheck() {
        return 0;
    }

    @Override
    public String getFileProperty(String ambryId) {
        return null;
    }

    @Override
    public String postFile(String filePath) {
        return null;
    }

    @Override
    public String postFile(InputStream inputStream) {
        return null;
    }

    @Override
    public String postFile(File file) {
        return null;
    }

    @Override
    public String deleteFile(String ambryId) {
        return null;
    }
}
