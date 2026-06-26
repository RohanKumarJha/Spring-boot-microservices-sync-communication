package com.synchronous.web_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/web-client")
public class WebController {

    private final WebClientService webClientService;

    public WebController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping("/get-instance")
    public String getInstance() {
        return webClientService.getInstance();
    }
}
