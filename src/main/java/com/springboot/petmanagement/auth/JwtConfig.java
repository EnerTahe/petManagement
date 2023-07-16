package com.springboot.petmanagement.auth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Value("${jwt.secret}")
    private String secretKey;

    @Value("${jwt.expiration-time}")
    private int expirationTime;

    public String getSecretKey() {
        return secretKey;
    }

    public int getExpirationTime() {
        return expirationTime;
    }
}
