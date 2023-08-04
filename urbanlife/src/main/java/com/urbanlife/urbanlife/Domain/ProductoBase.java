package com.urbanlife.urbanlife.Domain;

public class ProductoBase {

    private String Nombre,Detalle,color;
    private int Talle;
    private Boolean Categoria;

    public ProductoBase(String nombre, String detalle, String color, int talle, Boolean categoria) {
        Nombre = nombre;
        Detalle = detalle;
        this.color = color;
        Talle = talle;
        Categoria = categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTalle() {
        return Talle;
    }

    public void setTalle(int talle) {
        Talle = talle;
    }

    public Boolean getCategoria() {
        return Categoria;
    }

    public void setCategoria(Boolean categoria) {
        Categoria = categoria;
    }
}
