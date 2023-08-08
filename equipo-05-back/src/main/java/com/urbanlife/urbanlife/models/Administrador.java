package com.urbanlife.urbanlife.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Administrador extends Usuario  {

    public Administrador(String nombre, String correo, String contrasena, RolUser rol) {
        super(nombre, correo, contrasena, rol);
    }


  /*
    // Función para agregar un producto a la lista
    public static void agregarProducto(Producto producto) {
        listaProductosBase.add(producto);
    }

    // Función para eliminar un producto de la lista por índice
    public static void eliminarProducto(int indice) {
        if (indice >= 0 && indice < listaProductos.size()) {
            listaProductos.remove(indice);
        } else {
            System.out.println("Índice inválido. No se eliminó ningún producto.");
        }
    }

    // Función para modificar un producto en la lista por índice
    public static void modificarProducto(int indice, Producto productoModificado) {
        if (indice >= 0 && indice < listaProductos.size()) {
            listaProductos.set(indice, productoModificado);
        } else {
            System.out.println("Índice inválido. No se modificó ningún producto.");
        }
    }
}
*/
/*public class Administrador {
    public static void main(String[] args) {
        // Agregar productos usando la función de la clase Producto
        Producto.agregarProducto(new Producto("Camiseta", 20.99));
        Producto.agregarProducto(new Producto("Pantalón", 35.50));
        Producto.agregarProducto(new Producto("Zapatos", 59.99));

        // Mostrar la lista de productos
        System.out.println("Lista de productos:");
        for (Producto producto : Producto.listaProductos) {
            System.out.println(producto);
        }

        // Eliminar un producto usando la función de la clase Producto
        Producto.eliminarProducto(1); // Eliminar el segundo producto (índice 1)

        // Modificar un producto usando la función de la clase Producto
        Producto.modificarProducto(0, new Producto("Chaqueta", 45.75)); // Modificar el primer producto (índice 0)

        // Mostrar la lista de productos actualizada
        System.out.println("\nLista de productos actualizada:");
        for (Producto producto : Producto.listaProductos) {
            System.out.println(producto);
        }
    }

    @Override
    public void crearProducto(ProductosDto productosDto) {
        if (productosDto != null) {
            guardarProducto(productosDto);
            logger.info("Paciente: Se registro exitosamente!");
        }else { logger.error("Surgio un problema");}
    }
    private void guardarProducto(ProductosDto productosDto){
        Productos newProducto = objectMapper.convertValue(productosDto, Productos.class);
        productoRepository.save(newProducto);
    }

    @Override
    public Collection<ProductosDto> obtenerListaProductos() {
        Iterable<Productos> listarProductos = productoRepository.findAll();
        Set<ProductosDto> listarProductoDto = new HashSet<ProductosDto>();
        for (Productos producto : listarProductos) {
            listarProductoDto.add(objectMapper.convertValue(producto, ProductosDto.class));
        }
        logger.info("Proceso Finalizado con Exito!");
        return listarProductoDto;

}*/

}