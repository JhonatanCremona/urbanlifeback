package com.urbanlife.urbanlife.models;

import com.urbanlife.urbanlife.services.ProductoService;

import java.util.List;
import java.util.logging.Logger;

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

    private static final Logger LOGGER = Logger.getLogger("");

    public void AgregarProductoAdmin (ProductosDto productosDto){

        if (rol == RolUser.ADMINISTRADOR) {
            return ProductoService.guardarProducto(productosDto);
            LOGGER.info("producto Agregado correctamente");
        } else {

            System.out.println("Acceso denegado. Esta acción solo está permitida para Administradores.");
        }

        public void EliminarProductoAdmin (ProductosDto productosDto){

            if (rol == RolUser.ADMINISTRADOR) {
                return productosDto.Delete;
                LOGGER.info("producto Eliminado correctamente");
            } else {
                System.out.println("Acceso denegado. Esta acción solo está permitida para Administradores.");
            }

            public List<Productos> buscarTodosProductos(){
                if (rol == RolUser.ADMINISTRADOR) {
                    return ProductoService.obtenerListaProductos();
                    LOGGER.info("Productos Encontrados");
                } else {
                    System.out.println("Acceso denegado. Esta acción solo está permitida para Administradores.");
                }


            }


}
