package com.springsecurity.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ExerciseController {

    @GetMapping("/health")
    public ResponseEntity<Object> healthCheck(){
        return ResponseEntity.ok().body("health ok");
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(){
        System.out.println("HelloLogin!");
        return ResponseEntity.ok().body("login success");
    }

}
