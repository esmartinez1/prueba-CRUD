package com.prueba.crudfullstack.prueba_angular.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;


//Define la estructura de la tabla

@Entity
@Table(name="vendedores")
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    @JsonProperty("fName")
    private String fname;

    
    @JsonProperty("lName")
    private String lname;

    @Column(unique = true, nullable = false)
    private String email;

    public Vendedor() {}

    
    public Vendedor(Integer id, String fName, String lName, String email) {
        this.id = id;
        this.fname = fName;
        this.lname = lName;
        this.email = email;
    }

    
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getFName() { 
        return fname; 
    }

    public void setFName(String fName) { 
        this.fname = fName; 
    }

    public String getLName() { 
        return lname; 
    }
    public void setLName(String lName) { 
        this.lname = lName; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
}
