package com.jsonplaceholder.base;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.jsonplaceholder.mock.MockService;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

public class BaseApi {

    /**
     * Value mWireMockServer.
     */
    private WireMockServer mWireMockServer;

    /**
     * Value HTTP_PORT.
     */
    public static final int HTTP_PORT = 8091;


    /**
     * Before test.
     */
    @BeforeTest(alwaysRun = true)
    public void beforeTest() {
        mWireMockServer = new WireMockServer(options().port(HTTP_PORT));
        mWireMockServer.start();

        MockService mockService = new MockService();
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
