package com.deathbato.apirest_productos.repository;

import com.deathbato.apirest_productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
