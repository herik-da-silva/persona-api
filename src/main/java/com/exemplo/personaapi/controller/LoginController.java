package com.exemplo.personaapi.controller;

import com.exemplo.personaapi.service.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    private final JwtService jwtService;

    public LoginController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> login(@RequestParam String username, @RequestParam String password) {
        // TODO Simulação de login, alterar para base de dados
        if ("teste".equals(username) && "teste123".equals(password)) {
            String token = jwtService.generateToken(username, "USER");
            return ResponseEntity.ok(Map.of("token", token));
        }

        return ResponseEntity.status(401).body(Map.of("error", "Credenciais inválidas"));
    }
}
