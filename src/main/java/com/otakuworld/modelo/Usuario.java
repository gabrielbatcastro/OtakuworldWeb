package com.otakuworld.modelo;

public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String contraseña;
    private String rol; // admin o usuario

    // Constructor
    public Usuario(String id, String nombre, String email, String contraseña, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Constructor vacío
    public Usuario() {
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Método para convertir a formato de archivo (CSV-like)
    @Override
    public String toString() {
        return id + "|" + nombre + "|" + email + "|" + contraseña + "|" + rol;
    }

    // Método estático para crear Usuario desde línea de archivo
    public static Usuario fromString(String linea) {
        try {
            String[] partes = linea.split("\\|");
            if (partes.length == 5) {
                return new Usuario(partes[0], partes[1], partes[2], partes[3], partes[4]);
            }
        } catch (Exception e) {
            System.out.println("Error al parsear usuario: " + e.getMessage());
        }
        return null;
    }
}
