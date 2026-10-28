package com.example.gustosValen;

public class SaborNotFoundException extends RuntimeException{
    public SaborNotFoundException(String sabor){
        super(sabor);
    }
}
