package com.esfe.cleanapp.infrastructure.web;

import com.esfe.cleanapp.domain.port.in.CheckDbHealthUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/** Controlador REST para consultar salud de la BD: GET /health/db */
@RestController
@RequestMapping("/health")
public class HealthController {

    private final CheckDbHealthUseCase health;

    public HealthController(CheckDbHealthUseCase health) {
        this.health = health;
    }

    @GetMapping("/db")
    public ResponseEntity<Map<String, Object>> db() {
        boolean ok = health.isHealthy();
        return ResponseEntity.ok(Map.of("healthy", ok));
    }
}
