package com.pokedex.pokedex.services;

import com.pokedex.pokedex.repositories.PokemonTypes;

public class PokemonShiny extends PokemonDecorator{
    
    public PokemonShiny(PokemonTypes pokemonTypes){
        super(pokemonTypes);
    }
    
    public String decorate(){
        return super.decorate() + decorateShiny();
    }
    
    private String decorateShiny(){
        return "es Shiny";
    }
}
