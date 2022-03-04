package com.pokedex.pokedex.services;

import com.pokedex.pokedex.repositories.PokemonTypes;

public abstract class PokemonDecorator implements PokemonTypes {
    private PokemonTypes poketype;

    public PokemonDecorator(PokemonTypes pokemonTypes) {
    }

    @Override
    public String decorate(){
        return poketype.decorate();
    }
}
