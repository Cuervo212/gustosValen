package com.example.gustosValen;

/**
 * GustosValenMapper
 */
public class GustosValenMapper {

    public static GustosValenDTO toDTO(GustosValen gustosValen){

        return new GustosValenDTO(gustosValen.getNombre(), gustosValen.getSabor(), gustosValen.getTamano());
    }
}