package com.esfe.cleanapp.domain.port.out;

public interface SqlHealthPort {
    boolean ping() throws Exception;
}
