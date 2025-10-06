package com.deathbato.apirest_productos.service;

import com.deathbato.apirest_productos.entity.Producto;
import com.deathbato.apirest_productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceimpl implements IProducto{

    @Override
    public Producto update(Producto producto) {
        Producto producBd = productoRepository.findById(producto.getId()).get();
        producBd.setNombre(producto.getNombre());
        producBd.setDetalle(producto.getDetalle());
        producBd.setPrecio(producto.getPrecio());
        return productoRepository.save(producBd);
    }

    private ProductoRepository productoRepository;

    public ProductoServiceimpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findById(Integer id) {
        return productoRepository.findById(id).get();
    }

    @Override
    public void deleteByID(Integer id) {
        productoRepository.deleteById(id);
    }
}
