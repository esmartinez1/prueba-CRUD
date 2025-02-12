package com.prueba.crudfullstack.prueba_angular.repository;
import com.prueba.crudfullstack.prueba_angular.entity.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Interactúa con la base de datos usando JPA

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor,Integer>{


}
