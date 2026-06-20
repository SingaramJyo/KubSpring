// java
package com.example.anudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController {

    @GetMapping("/")
    public String root() {
        return "ok";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Spring Boot on Test Anuuuuu and Jyo Kubernetes!";
    }
}