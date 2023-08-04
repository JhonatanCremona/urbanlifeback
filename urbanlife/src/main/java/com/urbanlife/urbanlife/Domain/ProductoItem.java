package com.urbanlife.urbanlife.Domain;

public class ProductoItem extends ProductoBase{

    private int PrecioFinal,Stock;

    public ProductoItem(String nombre, String detalle, String color, int talle, Boolean categoria, int precioFinal, int stock) {
        super(nombre, detalle, color, talle, categoria);
        PrecioFinal = precioFinal;
        Stock = stock;
    }

    public int getPrecioFinal() {
        return PrecioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        PrecioFinal = precioFinal;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}
