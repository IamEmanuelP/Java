package com.pokedex.pokedex.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

}
