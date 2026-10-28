package com.example.gustosValen;

import java.util.List;
import java.util.Optional;

public interface IGustosValenServicio {

    public List<GustosValen> listaGustos();
    public void guardar(GustosValen gustosValen);
    public void borrar(GustosValen gustosValen);
    public GustosValen localizarGusto(GustosValen gustosValen);
    public Optional<GustosValen> findBySabor(String sabor);
    public Optional<GustosValen> findById(Long id);
}