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
                .atPriority(10)
                .willReturn(aResponse()
                        .withStatus(SUCCESS)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"id\": 1,\n" +
                                "  \"name\": \"Leanne Graham\",\n" +
                                "  \"username\": \"Bret\",\n" +
                                "  \"email\": \"Sincere@april.biz\",\n" +
                                "  \"address\": {\n" +
                                "    \"street\": \"Kulas Light\",\n" +
                                "    \"suite\": \"Apt. 556\",\n" +
                                "    \"city\": \"Gwenborough\",\n" +
                                "    \"zipcode\": \"92998-3874\",\n" +
                                "    \"geo\": {\n" +
                                "      \"lat\": \"-37.3159\",\n" +
                                "      \"lng\": \"81.1496\"\n" +
                                "    }\n" +
                                "  },\n" +
                                "  \"phone\": \"1-770-736-8031 x56442\",\n" +
                                "  \"website\": \"hildegard.org\",\n" +
                                "  \"company\": {\n" +
                                "    \"name\": \"Romaguera-Crona\",\n" +
                                "    \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                                "    \"bs\": \"harness real-time e-markets\"\n" +
                                "  }\n" +
                                "}")));
    }
}
