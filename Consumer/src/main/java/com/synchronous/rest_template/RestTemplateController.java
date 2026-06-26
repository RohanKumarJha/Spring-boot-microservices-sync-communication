package com.synchronous.rest_template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest-template")
public class RestTemplateController {

    private final RestTemplateClient restTemplateClient;

    public RestTemplateController(RestTemplateClient restTemplateClient) {
        this.restTemplateClient = restTemplateClient;
    }

    @GetMapping("/get-instance")
    public String getInstance() {
        return restTemplateClient.getInstance();
    }
}
