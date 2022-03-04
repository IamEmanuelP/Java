package com.pokedex.pokedex.repositories;

import com.pokedex.pokedex.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//Repository Pattern
@Repository
public interface PokemonRepository extends JpaRepository<Pokemon,Long> {
    public abstract ArrayList<Pokemon> findByNombre(Integer categoria);
}
