package com.esfe.cleanapp.application.usecase;

import com.esfe.cleanapp.domain.port.in.CheckDbHealthUseCase;
import com.esfe.cleanapp.domain.port.out.SqlHealthPort;

/**
 * Implementación del caso de uso (sin anotaciones de Spring).
 * Orquesta el puerto de salida para mantener el dominio aislado.
 */
public class CheckDbHealthService implements CheckDbHealthUseCase {
    private final SqlHealthPort sql;
    public CheckDbHealthService(SqlHealthPort sql) {
        this.sql = sql;
    }

    @Override
    public boolean isHealthy() {
        try {
            return sql.ping();
        } catch (Exception e) {
            return false;
        }
    }
}
