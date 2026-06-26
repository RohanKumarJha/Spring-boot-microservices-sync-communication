package com.synchronous.rest_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest-client")
public class RestClientController {

    private final RestClientService restClientService;

    public RestClientController(RestClientService restClientService) {
        this.restClientService = restClientService;
    }

    @GetMapping("/get-instance")
    public String getInstance() {
        return restClientService.getInstance();
    }
}
