package com.mamud.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String root() {
        return "Primeira Aplicação Java com Spring";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
