package com.deathbato.apirest_productos.service;

import com.deathbato.apirest_productos.entity.Producto;
import java.util.List;

public interface IProducto {
    Producto save(Producto producto);
    List<Producto> findAll();
    Producto findById(Integer id);
    void deleteByID(Integer id);
    Producto update(Producto producto);
}
