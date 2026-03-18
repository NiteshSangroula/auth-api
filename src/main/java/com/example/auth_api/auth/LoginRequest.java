package com.example.auth_api.auth;

public record LoginRequest(
    String email,
    String password
) {
}
