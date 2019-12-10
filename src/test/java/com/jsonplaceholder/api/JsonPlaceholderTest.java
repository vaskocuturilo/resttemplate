package com.jsonplaceholder.api;

import com.jsonplaceholder.api.schema.Error;
import com.jsonplaceholder.api.schema.User;
import com.jsonplaceholder.base.BaseApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class JsonPlaceholderTest extends BaseApi {

    private static final String ENDPOINT = "http://localhost:8091/users/1";

    private static final String FIRST_LAST_NAME = "Leanne Graham";

    @Test(description = "This test did it with rest template.")
    public void testGetUserInformation() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(ENDPOINT, String.class);
        User user = restTemplate.getForObject(ENDPOINT, User.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
        assertThat(user.getId(), equalTo(1));
        assertThat(user.getName(), equalTo(FIRST_LAST_NAME));
        assertThat(user.getUsername(), equalTo("Bret"));
        assertThat(user.getEmail(), equalTo("Sincere@april.biz"));

    }

    @Test(description = "This is test check error status.")
    public void testGetErrorStatus() throws InterruptedException {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8091/users/test", String.class);
        Error errorMessage = restTemplate.getForObject("http://localhost:8091/users/test", Error.class);
        assertThat(errorMessage.getStatus(), equalTo("Error"));
        assertThat(response.getStatusCode(), equalTo(HttpStatus.NOT_FOUND));

    }

}
