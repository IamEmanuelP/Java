package com.pokedex.pokedex.controllers;

import com.pokedex.pokedex.models.Pokemon;
import com.pokedex.pokedex.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/pokedex")
public class PokemonController{
    //Singleton Pattern
    @Autowired
    private PokemonService pokemonService;

    @GetMapping()
    public ArrayList<Pokemon> obtenerPokemons(){
        return pokemonService.obtenerPokemons();
    }

    @PostMapping
    public Pokemon guardarPokemon(@RequestBody Pokemon pokemon){
        return this.pokemonService.guardarPokemon(pokemon);
    }

    @GetMapping(path = "/{id}")
    public Optional<Pokemon> obtenerId(@PathVariable("id") Long id){
        return this.pokemonService.obtenerId(id);
    }

    @GetMapping("/query")
    public ArrayList<Pokemon> obtenerNombre(@RequestParam("categoria") Integer categoria){
        return this.pokemonService.obtenerNombre(categoria);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPokemon(@PathVariable("id")Long id){
        boolean ok = this.pokemonService.eliminarPokemon(id);
        if (ok){
            return "Se elimino correctamente el Pokemon" + id;
        }else{
            return "No se pudo encontrar el pokemon con id" + id;
        }
    }
}
