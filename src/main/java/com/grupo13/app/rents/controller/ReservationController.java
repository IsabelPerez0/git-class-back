package com.grupo13.app.rents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo13.app.rents.model.IReservationRepository;
import com.grupo13.app.rents.model.Reservation;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    IReservationRepository repository;
    
    @GetMapping("/all")
    public Iterable<Reservation> get(){
        Iterable<Reservation> response = repository.findAll();
        
        return response;
    }
    
    @PostMapping("/save")
    public String create(@RequestBody Reservation request){
        
        repository.save(request);
        
        return "crated....";
    }
}
