package com.esfe.cleanapp;

import com.esfe.cleanapp.domain.port.in.CheckDbHealthUseCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Prueba de humo: Levanta el contexto real y ejecuta SELECT 1
 * mediante el caso de uso. Requiere red/credenciales válidas.
 */
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DbConnectionSmokeTest {
    @Autowired
    CheckDbHealthUseCase health;
    @Test
    void shouldConnectAndSelectOne() {
        assertTrue(health.isHealthy(),
                "BD no respondió a SELECT 1; revisa credenciales/SSL/red.");
    }
}
