package com.grupo13.app.rents.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.grupo13.app.rents.dto.ReportClientDto;
import com.grupo13.app.rents.dto.ReportStatusDto;
import com.grupo13.app.rents.entities.Reservation;
import com.grupo13.app.rents.service.ReservationService;


@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")
public class ReservationController {

    
    @Autowired
    ReservationService service;

    @GetMapping("/all")
    public Iterable<Reservation> getReservations(){

        /*Iterable<Quadbike> response = repository.findAll();

        return response;*/
        return service.get();
    }

    @GetMapping("/report-clients")
    public List<ReportClientDto> getReport() {
        return service.getClientReport();
    }

    @GetMapping("/report-dates/{dateOne}/{dateTwo}")
    public List<Reservation> getReservationsReportDates(@PathVariable("dateOne") String dateOne, @PathVariable("dateTwo") String dateTwo) {
        return service.getReportDates(dateOne, dateTwo);
    }

    @GetMapping("/report-status")
    public ReportStatusDto getReservationsStatusReport() {
        return service.getReservationsStatusReport();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Reservation request){
      
       service.create(request);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Reservation request){
 
       service.update(request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Integer id){
 
       service.delete(id);
    }

   /* @Autowired
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
    }*/
}
