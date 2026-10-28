package com.example.gustosValen;

import jakarta.validation.constraints.NotBlank;

public class GustosValenDTO{

        @NotBlank(message = "el campo nombre, no puede estar vacío")
        private String nombre;

        @NotBlank(message = "el campo sabor, no puede estar vacío")
        private String sabor;
        
        @NotBlank(message = "el campo tamaño, no puede estar vacío")
        private String tamano;

    public GustosValenDTO(String nombre, String sabor, String tamano) {
        this.nombre = nombre;
        this.sabor = sabor;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }




    
}
