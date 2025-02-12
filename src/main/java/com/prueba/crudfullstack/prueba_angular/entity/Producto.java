package com.prueba.crudfullstack.prueba_angular.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;


//Define la estructura de la tabla

@Entity
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    @JsonProperty("pName")
    private String pname;

    
    @JsonProperty("description")
    private String description;


    public Producto() {}

    
    public Producto(Integer id, String pName, String description) {
        this.id = id;
        this.pname = pName;
        this.description = description;
    }

    
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getPName() { 
        return pname; 
    }

    public void setPName(String pName) { 
        this.pname = pName; 
    }

    public String getDescription() { 
        return description; 
    }
    public void setDescription(String description) { 
        this.description = description; 
    }
}