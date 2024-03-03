package com.base.artefactobase.service.dtos.security;

import lombok.Data;

@Data
public class LoginUserDto {
    private String email;
    private String password;
}
