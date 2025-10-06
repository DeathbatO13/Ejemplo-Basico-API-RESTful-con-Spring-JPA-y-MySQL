package com.deathbato.apirest_productos.service;

import com.deathbato.apirest_productos.entity.Producto;
import com.deathbato.apirest_productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceimpl implements IProducto{

    private ProductoRepository productoRepository;

    public ProductoServiceimpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }
}
