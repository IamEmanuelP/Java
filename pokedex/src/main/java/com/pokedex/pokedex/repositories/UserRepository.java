package com.pokedex.pokedex.repositories;

import com.pokedex.pokedex.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    //public User findByUsername(String username);
}


//select u from User u where u.username = :username