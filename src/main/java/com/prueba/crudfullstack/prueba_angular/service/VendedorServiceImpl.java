package com.prueba.crudfullstack.prueba_angular.service;

import com.prueba.crudfullstack.prueba_angular.entity.Vendedor;
import com.prueba.crudfullstack.prueba_angular.exception.ResourceNotFoundException;
import com.prueba.crudfullstack.prueba_angular.repository.VendedorRepository;
import java.util.List;
import org.springframework.stereotype.Service;



//Implementa la lógica del servicio.


@Service
public class VendedorServiceImpl implements VendedorService{

    private final VendedorRepository vendedorRepository;

    public VendedorServiceImpl(VendedorRepository vendedorRepository){
        this.vendedorRepository=vendedorRepository;
    }

    @Override
    public Vendedor save(Vendedor vendedor){
         return vendedorRepository.save(vendedor);
    }

    @Override
    public List<Vendedor> findAll(){
        return vendedorRepository.findAll();
    }

    @Override
    public Vendedor findById(Integer id){
        Vendedor vendedor=vendedorRepository.findById(id).orElseThrow(
            ()->{
                throw new ResourceNotFoundException("Vendedor con id "+id+" no se encuentra");
            }
        );
        //return customerRepository.findById(id).get();
        return vendedor;
    }

    @Override
    public  void deleteById(Integer id){
        vendedorRepository.deleteById(id);
    }

    @Override
    public Vendedor update(Vendedor vendedor){
        return vendedorRepository.save(vendedor);
    }

}
