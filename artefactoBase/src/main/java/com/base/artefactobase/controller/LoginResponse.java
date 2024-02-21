package com.base.artefactobase.controller;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private long expiresIn;

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }
}