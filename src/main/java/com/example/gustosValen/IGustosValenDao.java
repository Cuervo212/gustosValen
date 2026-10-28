package com.example.gustosValen;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface IGustosValenDao extends CrudRepository<GustosValen, Long>{
    public Optional<GustosValen> findBySabor(String sabor);
    public Optional<GustosValen> findById(Long id);

}