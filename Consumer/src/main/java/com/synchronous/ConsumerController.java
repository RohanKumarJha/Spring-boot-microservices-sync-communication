package com.synchronous;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consumer")
public class ConsumerController {

    @GetMapping("/get-instance")
    public String getInstance() {
        return "This is Consumer controller";
    }
}
