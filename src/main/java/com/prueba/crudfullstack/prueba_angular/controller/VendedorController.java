package com.prueba.crudfullstack.prueba_angular.controller;

import com.prueba.crudfullstack.prueba_angular.entity.Vendedor;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.prueba.crudfullstack.prueba_angular.service.VendedorService;


//Expone la API REST para interactuar con clientes


@RestController
//http://localhost:8080/crud/vendedores
//@RequestMapping("/crud/vendedores")
public class VendedorController {

    private final VendedorService vendedorService;
    
    public VendedorController(VendedorService vendedorService){
        this.vendedorService=vendedorService;
    }

    //http://localhost:8080/crud/vendedores/
    @PostMapping("/create")
    public Vendedor save(@RequestBody Vendedor vendedor){
        return vendedorService.save(vendedor);
    }

    //http://localhost:8080/crud/customers/
    @GetMapping
    public List <Vendedor> findAll(){
        return vendedorService.findAll();
    }

    //http://localhost:8080/crud/customers/"ID"
    @GetMapping("/{id}")
    public Vendedor findById(@PathVariable Integer id){
        return vendedorService.findById(id);
    }

    //http://localhost:8080/crud/customers/"ID"
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        vendedorService.deleteById(id);
    }

    //http://localhost:8080/crud/customers/
    @PutMapping
    public Vendedor updateCustomer(@RequestBody Vendedor vendedor){
        Vendedor VendedorDB=vendedorService.findById(vendedor.getId());
        VendedorDB.setFName(vendedor.getFName());
        VendedorDB.setLName(vendedor.getLName());
        VendedorDB.setEmail(vendedor.getEmail());
        return vendedorService.update(VendedorDB);
    }
}
