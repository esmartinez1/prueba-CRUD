package com.prueba.crudfullstack.prueba_angular.service;

import java.util.List;
import com.prueba.crudfullstack.prueba_angular.entity.Vendedor;


//Interfaz con los métodos del servicio.


public interface VendedorService {
    Vendedor save(Vendedor vendedor);
    List<Vendedor>findAll();
    Vendedor findById(Integer id);
    void deleteById(Integer id);
    Vendedor update(Vendedor vendedor);
}
