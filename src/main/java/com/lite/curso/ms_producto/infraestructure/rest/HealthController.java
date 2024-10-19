package com.lite.curso.ms_producto.infraestructure.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    
    @GetMapping("/")
    public String health() {
        return "OK";
    }
}
