package com.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ExerciseController {

    @PostMapping("/login")
    @PreAuthorize("hasRole(ROLE_USER)")
    public ResponseEntity<Object> login(){
        return ResponseEntity.ok().body("login success");
    }

}
