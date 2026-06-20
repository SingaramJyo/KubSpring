// java
package com.example.anudemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.anudemo")
public class AnuDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(AnuDemoApplication.class, args);
        System.out.println("AnuDemoApplication started successfully!");
    }
}
