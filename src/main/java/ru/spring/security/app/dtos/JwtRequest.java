package ru.spring.security.app.dtos;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
