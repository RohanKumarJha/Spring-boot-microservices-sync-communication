package com.synchronous.open_feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/open-feign")
public class OpenFeignController {

    private final OpenFeignClient openFeignClient;

    public OpenFeignController(OpenFeignClient openFeignClient) {
        this.openFeignClient = openFeignClient;
    }

    @GetMapping("/get-instance")
    public String getInstance() {
        return openFeignClient.getInstance();
    }
}
