package com.github.ambry.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a client for Java application to invoke Ambry REST api.
 *
 * @author Zhong.Zewei Create on 2016.06.08.
 */
public class AmbryClient implements IAmbryClient{

    private final Logger logger = LoggerFactory.getLogger(AmbryClient.class);

    @Override
    public String getFileInfo(String ambryId) {
        return null;
    }
}
