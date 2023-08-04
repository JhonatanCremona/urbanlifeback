package com.urbanlife.urbanlife.Domain;

public class Producto extends ProductoBase {

    private int PrecioBase,Cantidad;

    public Producto(String nombre, String detalle, String color, int talle, Boolean categoria, int precioBase, int cantidad) {
        super(nombre, detalle, color, talle, categoria);
        PrecioBase = precioBase;
        Cantidad = cantidad;
    }

    public int getPrecioBase() {
        return PrecioBase;
    }

    public void setPrecioBase(int precioBase) {
        PrecioBase = precioBase;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
}
