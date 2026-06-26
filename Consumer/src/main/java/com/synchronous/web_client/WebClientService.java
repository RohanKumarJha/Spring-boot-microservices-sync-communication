package com.synchronous.web_client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebClientService {

    private final WebClient webClient;

    public WebClientService(WebClient webClient) {
        this.webClient = webClient;
    }

    public String getInstance() {

        return webClient.get()
                .uri("http://localhost:8081/api/producer/get-instance")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}