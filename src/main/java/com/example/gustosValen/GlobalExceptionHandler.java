package com.example.gustosValen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice 
public class GlobalExceptionHandler {

    @ExceptionHandler(SaborNotFoundException.class)
    public ResponseEntity<DTO_Error> cartaDeDisculpas(SaborNotFoundException ex){

        DTO_Error error = new DTO_Error(
            ex.getMessage(), HttpStatus.NOT_FOUND.value(), System.currentTimeMillis());
        
            return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }
    
}
