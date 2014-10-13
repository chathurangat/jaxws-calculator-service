package com.chathurangaonline.sample.jaxws;

import javax.xml.ws.Endpoint;

/**
 * <p>
 *     simple web service publisher for testing the web service in the development environment.
 *     remove this publisher class in the production environment and deploy the web service with
 *     j2ee compliant web server.
 * </p>
 */
public class CalculatorServicePublisher {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:6655/jaxWsCalcService",new CalculatorServiceImpl());
    }
}
