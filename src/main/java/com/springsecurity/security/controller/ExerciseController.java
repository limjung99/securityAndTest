package com.springsecurity.security.controller;

import com.springsecurity.security.service.CacheTestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ExerciseController {
    private final CacheTestService cacheTestService;

    public ExerciseController(CacheTestService cacheTestService) {
        this.cacheTestService = cacheTestService;
    }

    @GetMapping("/health")
    public ResponseEntity<Object> healthCheck(){
        return ResponseEntity.ok().body("health ok");
    }

    @GetMapping("/test")
    public ResponseEntity<String> cacheTest() throws InterruptedException {
        cacheTestService.checkTime(1);
        cacheTestService.checkTime(1);
        cacheTestService.checkTime(1);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(){
        System.out.println("HelloLogin!");
        return ResponseEntity.ok().body("login success");
    }

}
