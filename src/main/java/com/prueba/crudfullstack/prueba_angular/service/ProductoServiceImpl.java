package com.prueba.crudfullstack.prueba_angular.service;

import com.prueba.crudfullstack.prueba_angular.entity.Producto;
import com.prueba.crudfullstack.prueba_angular.exception.ResourceNotFoundException;
import com.prueba.crudfullstack.prueba_angular.repository.ProductoRepository;
import java.util.List;
import org.springframework.stereotype.Service;


//Implementa la lógica del servicio.



@Service
public class ProductoServiceImpl implements ProductoService{

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository){
        this.productoRepository=productoRepository;
    }

    @Override
    public Producto save(Producto producto){
         return productoRepository.save(producto);
    }

    @Override
    public List<Producto> findAll(){
        return productoRepository.findAll();
    }

    @Override
    public Producto findById(Integer id){
        Producto producto=productoRepository.findById(id).orElseThrow(
            ()->{
                throw new ResourceNotFoundException("Producto con id "+id+" no se encuentra");
            }
        );
        //return customerRepository.findById(id).get();
        return producto;
    }

    @Override
    public  void deleteById(Integer id){
        productoRepository.deleteById(id);
    }

    @Override
    public Producto update(Producto producto){
        return productoRepository.save(producto);
    }

}
