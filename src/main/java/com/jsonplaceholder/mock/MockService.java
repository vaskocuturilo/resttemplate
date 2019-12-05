package com.jsonplaceholder.mock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.jsonplaceholder.base.BaseApi.HTTP_PORT;

public class MockService {

    /**
     * The constant SUCCESS.
     */
    private static final int SUCCESS = 200;

    /**
     * Default constructor.
     */
    public MockService() {
        super();
        //empty
        return;
    }

    /**
     * Start mock service.
     */
    public void startMockService() {
        configureFor("localhost", HTTP_PORT);
        stubFor(get(urlPathMatching("/users/1"))
                .willReturn(aResponse()
                        .withStatus(SUCCESS)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"id\":1,\"name\":\"Leanne Graham\"}")));
    }
}
