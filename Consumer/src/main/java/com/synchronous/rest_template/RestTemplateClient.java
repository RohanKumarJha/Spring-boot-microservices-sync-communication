package com.synchronous.rest_template;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateClient {

    private final RestTemplate restTemplate;

    public RestTemplateClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getInstance() {
        return restTemplate.getForObject(
                "http://localhost:8081/api/producer/get-instance", String.class);
    }
}
