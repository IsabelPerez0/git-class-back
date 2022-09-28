package com.grupo13.app.rents.model;

import org.springframework.data.repository.CrudRepository;

public interface IReservationRepository extends CrudRepository <Reservation, Integer> {
    
}
