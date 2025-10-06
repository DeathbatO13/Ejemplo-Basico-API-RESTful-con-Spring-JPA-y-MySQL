package com.deathbato.apirest_productos.controller;

import com.deathbato.apirest_productos.entity.Producto;
import com.deathbato.apirest_productos.service.IProducto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    private IProducto iProducto;

    public ProductoController(IProducto iproducto) {
        this.iProducto = iproducto;
    }

    //Peticiones solo tipo Post
    @PostMapping
    public Producto save(@RequestBody Producto producto){
        return iProducto.save(producto);
    }

    //Peticiones solo tipo Get
    @GetMapping
    public List<Producto> findAll(){
        return iProducto.findAll();
    }
}
