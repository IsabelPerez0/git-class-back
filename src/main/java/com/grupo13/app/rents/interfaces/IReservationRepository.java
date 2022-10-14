package com.grupo13.app.rents.interfaces;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.grupo13.app.rents.entities.Reservation;


public interface IReservationRepository extends CrudRepository <Reservation, Integer> {
    
    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) DESC")
    public List<Object[]> countTotalclientReservation();
    
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne,Date dateTwo );
    
    public List<Reservation>findAllByStatus(String status);
}
