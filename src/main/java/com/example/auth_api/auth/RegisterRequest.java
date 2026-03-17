package com.example.auth_api.auth;

public record RegisterRequest(
    String username,
    String email,
    String password
) {
}
