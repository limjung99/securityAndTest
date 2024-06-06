package com.springsecurity.security.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    String id;
    String password;
    String authority;
}
