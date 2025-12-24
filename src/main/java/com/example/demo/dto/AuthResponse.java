package com.example.demo.dto;

public class AuthResponse {

    private String token;
    private String email;
    private Long userId;

    // ✅ REQUIRED
    public AuthResponse() {}

    // ✅ REQUIRED
    public AuthResponse(String token, String email, String role) {
        this.token = token;
        this.email = email;
    }

    // ✅ REQUIRED BY TEST
    public Long getUserId() {
        return userId;
    }
}
