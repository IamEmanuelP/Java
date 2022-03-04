package com.pokedex.pokedex.services;

import com.pokedex.pokedex.repositories.PokemonTypes;

public class TypesImplement  implements PokemonTypes {
    @Override
    public String decorate(){
        return "Tipo de Pokemon";
    }
}
