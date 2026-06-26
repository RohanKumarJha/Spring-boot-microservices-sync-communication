package com.synchronous.open_feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "producer-microservice", url = "http://localhost:8081/api/producer")
public interface OpenFeignClient {

    @GetMapping("/get-instance")
    String getInstance();
}
