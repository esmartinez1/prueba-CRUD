package com.prueba.crudfullstack.prueba_angular.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private String message=null;
    public ResourceNotFoundException(String message){
        super(message);
        this.message=message;
    } 

}
