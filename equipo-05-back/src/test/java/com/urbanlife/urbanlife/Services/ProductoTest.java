package com.urbanlife.urbanlife.Services;

import com.urbanlife.urbanlife.models.Imagenes;
import com.urbanlife.urbanlife.models.Productos;
import com.urbanlife.urbanlife.models.ProductosDto;
import com.urbanlife.urbanlife.services.ProductoService;
import org.assertj.core.error.ShouldBeAfterYear;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {

    @Test

    @Order(1)

    public void crearProductoTest() {
        // Crear una instancia de Producto para ser creado
       // ProductosDto productoACrear = new Productos(1, "camiseta", 100, "Estampada", "negra", "8 august 2023", "false", new Imagenes(1,"https://media.gq.com.mx/photos/63f53660937b5d59a717b034/16:9/w_1280,c_limit/ropa-barata-de-hombre-en-tendencia-febrero-2023.jpg",""));

        // Crear una instancia de ProductoService
        ProductoService productoService = new ProductoService();

        // Llamar al método no estático crearProducto en la instancia de ProductoService
       // productoService.crearProducto(productoACrear);


    }

   /* public void crearProducto(){
        //Dado
        ProductoService productoACrear = new Productos(1,"camiseta",100,"Estampada","negra","8 august 2023","false");
        //Cuando
        ProductoService.crearProducto(productoACrear);
        //Entonces
        //assertEquals(1L,pacienteGuardado.getId());

    }*/




}
