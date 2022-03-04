package com.pokedex.pokedex.services;

import com.pokedex.pokedex.models.Pokemon;
import com.pokedex.pokedex.repositories.PokemonRepository;
import com.pokedex.pokedex.repositories.PokemonTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PokemonService {
    @Autowired
    private PokemonRepository pokemonRepository;

    public ArrayList<Pokemon> obtenerPokemons(){
        return (ArrayList<Pokemon>) pokemonRepository.findAll();
    }

    public Pokemon guardarPokemon(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    public Optional<Pokemon> obtenerId(Long id){
        return pokemonRepository.findById(id);
    }

    public ArrayList<Pokemon> obtenerNombre(Integer categoria){
        return pokemonRepository.findByNombre(categoria);
    }

    public boolean eliminarPokemon(Long id){
        try{
            pokemonRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }



}
