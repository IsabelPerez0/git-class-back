package com.grupo13.app.rents.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.grupo13.app.rents.entities.Quadbike;

public interface IQuadbikeRepository extends CrudRepository <Quadbike, Integer> {
    
}
