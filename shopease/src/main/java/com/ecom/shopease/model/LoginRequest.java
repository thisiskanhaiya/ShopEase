package com.ecom.shopease.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String Password;
}
