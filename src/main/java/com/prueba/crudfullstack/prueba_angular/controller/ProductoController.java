package com.prueba.crudfullstack.prueba_angular.controller;

import com.prueba.crudfullstack.prueba_angular.entity.Producto;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.prueba.crudfullstack.prueba_angular.service.ProductoService;


//Expone la API REST para interactuar con clientes



@RestController
//http://localhost:8080/crud/productos
@RequestMapping("/crud/productos")
public class ProductoController {

    private final ProductoService productoService;
    
    public ProductoController(ProductoService productoService){
        this.productoService=productoService;
    }

    //http://localhost:8080/crud/producto/
    @PostMapping //("/create")
    public Producto save(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    //http://localhost:8080/crud/productos/
    @GetMapping
    public List <Producto> findAll(){
        return productoService.findAll();
    }

    //http://localhost:8080/crud/productos/"ID"
    @GetMapping("/{id}")
    public Producto findById(@PathVariable Integer id){
        return productoService.findById(id);
    }

    //http://localhost:8080/crud/productos/"ID"
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        productoService.deleteById(id);
    }

    //http://localhost:8080/crud/productos/
    @PutMapping
    public Producto updateCustomer(@RequestBody Producto producto){
        Producto ProductoDB=productoService.findById(producto.getId());
        ProductoDB.setPName(producto.getPName());
        ProductoDB.setDescription(producto.getDescription());
        return productoService.update(ProductoDB);
    }
}
