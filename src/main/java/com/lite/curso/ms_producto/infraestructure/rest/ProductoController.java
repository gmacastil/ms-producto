package com.lite.curso.ms_producto.infraestructure.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lite.curso.ms_producto.infraestructure.database.ProductApplication;
import com.lite.curso.ms_producto.infraestructure.database.Producto;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductApplication productApplication;

    @GetMapping("/")
    public List<Producto> getProductos() {
        return productApplication.findAll();
    }

    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Long id) {
        return productApplication.findById(id).orElse(null);
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