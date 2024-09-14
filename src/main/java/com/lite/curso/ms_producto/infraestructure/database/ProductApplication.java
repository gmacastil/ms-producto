package com.lite.curso.ms_producto.infraestructure.database;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductApplication extends JpaRepository<Producto, Long> {
    
}
