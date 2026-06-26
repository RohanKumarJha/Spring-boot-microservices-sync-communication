package com.synchronous.rest_client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RestClientService {

    private final RestClient restClient;

    public RestClientService(RestClient restClient) {
        this.restClient = restClient;
    }

    public String getInstance() {
        return restClient.get()
                .uri("http://localhost:8081/api/producer/get-instance")
                .retrieve()
                .body(String.class);
    }
}
