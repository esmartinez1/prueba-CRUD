package com.prueba.crudfullstack.prueba_angular.service;

import java.util.List;
import com.prueba.crudfullstack.prueba_angular.entity.Producto;


//Interfaz con los métodos del servicio.

public interface ProductoService {
    Producto save(Producto producto);
    List<Producto>findAll();
    Producto findById(Integer id);
    void deleteById(Integer id);
    Producto update(Producto producto);
}