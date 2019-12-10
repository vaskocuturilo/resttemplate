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
     * Start get mock service.
     */
    public void startGetMockService() {
        configureFor("localhost", HTTP_PORT);
        stubFor(get(urlPathMatching("/users/1"))
                .willReturn(aResponse()
                        .withStatus(SUCCESS)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"id\":1,\"name\":\"Leanne Graham\"," +
                                "\"username\": \"Bret\",\"email\": \"Sincere@april.biz\"}")));
    }

    /**
     * Start post mock service.
     */
    public void startPostMockService() {
        configureFor("localhost", HTTP_PORT);
        givenThat(post(urlEqualTo("/users/message"))
                .withRequestBody(equalToJson("{\"message\": \"Hello World!\"}"))
                .willReturn(aResponse().withStatus(200)));
    }


    /**
     * Start any mock service.
     */
    public void startAnyMockService() {
        configureFor("localhost", HTTP_PORT);
        stubFor(get(urlPathMatching("/users/test"))
                .willReturn(aResponse()
                        .withStatus(404)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\"status\":\"Error\"}")));
    }
}
