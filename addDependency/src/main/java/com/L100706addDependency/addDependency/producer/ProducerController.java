package com.L100706addDependency.addDependency.producer;

import org.springframework.stereotype.Controller;

@Controller
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }
}
