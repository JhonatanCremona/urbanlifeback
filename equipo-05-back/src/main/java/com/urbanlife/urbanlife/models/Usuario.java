package com.urbanlife.urbanlife.models;

import com.urbanlife.urbanlife.services.ProductoService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.logging.Logger;
@Table
@Entity
@Getter
@Setter

public class Usuario {
    @Id
    @SequenceGenerator(name="usuarios_sequence", sequenceName = "usuarios_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuarios_sequence")
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

    private static final Logger LOGGER = Logger.getLogger("");




}
