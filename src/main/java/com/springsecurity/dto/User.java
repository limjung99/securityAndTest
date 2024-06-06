package com.springsecurity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    String id;
    String password;
    String authority;
}
