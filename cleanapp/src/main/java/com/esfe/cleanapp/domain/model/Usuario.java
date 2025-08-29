package com.esfe.cleanapp.domain.model;

public class Usuario {
    private String Nombre;
    private String email;
    private String password;
    private boolean Estado;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String password, boolean estado) {
        Nombre = nombre;
        this.email = email;
        this.password = password;
        Estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
}
