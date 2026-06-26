package com.synchronous;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/producer")
public class ProducerController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/get-instance")
    public String getInstance() {
        return "This Producer microservice is running on port number : "+port;
    }
}
