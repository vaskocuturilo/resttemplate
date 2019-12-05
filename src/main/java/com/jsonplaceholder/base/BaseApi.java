package com.jsonplaceholder.base;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.jsonplaceholder.mock.MockService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;


/**
 * The class Base api.
 */
public class BaseApi {

    /**
     * The private value mWireMockServer.
     */
    private WireMockServer mWireMockServer;

    /**
     * The constant HTTP_PORT.
     */
    public static final int HTTP_PORT = 8091;


    /**
     * Before test.
     */
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        mWireMockServer = new WireMockServer(options().port(HTTP_PORT));
        mWireMockServer.start();

        final MockService mockService = new MockService();
        mockService.startMockService();
    }

    /**
     * After test.
     */
    @AfterTest
    public void afterTest() {
        mWireMockServer.stop();
    }

}
