package com.lite.curso.ms_producto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @GetMapping("/")
    public List<Producto> getProductos() {
        Producto producto = new Producto(1, "Producto 1", 100.0);
        Producto producto2 = new Producto(2, "Producto 2", 200.0);
        Producto producto3 = new Producto(3, "Producto 3", 300.0);
        List<Producto> productos = List.of(producto, producto2, producto3);
        return productos;
    }

    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Long id) {
        // logica de busqueda de producto
        return new Producto(id.intValue(), "Producto 1", 100.0);
    }

    @GetMapping("/")
    public Producto getProductos(@RequestParam Long id, @RequestParam String nombre ) {
        // logica de busqueda de producto
        return new Producto(id.intValue(), nombre, 100.0);
    }


    /*
    @PostMapping("/productos")
    public Producto addProducto(@RequestBody Producto producto) {
        return productoService.addProducto(producto);
    }

    @PutMapping("/productos/{id}")
    public Producto updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        return productoService.updateProducto(id, producto);
    }

    @DeleteMapping("/productos/{id}")
    public void deleteProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
    }
        */
}