package com.ecom.shopease.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/home")
    public String home() {
        return "Welcome to Shopease!";
    }
    @GetMapping("/")
    public String ErrorPage() {
        return "this is home page";
    }
}
