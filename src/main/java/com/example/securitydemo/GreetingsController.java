package com.example.securitydemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String SayHello() {
        return "Hello";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndpoint() {
        return "Hello, user1";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Hello, admin";
    }
}
