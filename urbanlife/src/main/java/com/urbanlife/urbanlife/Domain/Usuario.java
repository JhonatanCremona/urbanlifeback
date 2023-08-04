package com.urbanlife.urbanlife.Domain;

public class Usuario {

    private String  Nombre,Correo,Contrasena;

    private RolUser rol;

    public Usuario(String nombre, String correo, String contrasena, RolUser rol) {
        Nombre = nombre;
        Correo = correo;
        Contrasena = contrasena;
        this.rol = rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public RolUser getRol() {
        return rol;
    }

    public void setRol(RolUser rol) {
        this.rol = rol;
    }
}
