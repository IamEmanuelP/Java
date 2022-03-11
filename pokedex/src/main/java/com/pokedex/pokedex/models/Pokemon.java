package com.pokedex.pokedex.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pokemons")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String nombre;
    private String categoria;
    private String habilidades;
    private Double peso;

}
