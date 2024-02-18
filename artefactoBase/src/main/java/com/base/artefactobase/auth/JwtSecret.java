package com.base.artefactobase.auth;

public class JwtSecret {

    private final String key;

    public JwtSecret(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}