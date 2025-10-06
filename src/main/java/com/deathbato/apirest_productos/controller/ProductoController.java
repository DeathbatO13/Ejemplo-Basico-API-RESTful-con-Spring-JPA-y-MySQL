package com.deathbato.apirest_productos.controller;

import com.deathbato.apirest_productos.entity.Producto;
import com.deathbato.apirest_productos.service.IProducto;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Producto findById(@PathVariable Integer id){
        return iProducto.findById(id);
    }

    @DeleteMapping("/{idProduct}")
    public void deleteById(@PathVariable("idProduct") Integer id){
        iProducto.deleteByID(id);
    }
}
