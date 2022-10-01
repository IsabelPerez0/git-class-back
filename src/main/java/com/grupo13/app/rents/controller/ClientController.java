package com.grupo13.app.rents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo13.app.rents.entities.Client;
import com.grupo13.app.rents.service.ClientService;


@RestController
@RequestMapping("/api/Client")
public class ClientController {
    
    @Autowired
    ClientService service;
    
    @GetMapping("/all")
    public Iterable<Client> get(){
        Iterable<Client> response = service.get();
        
        return response;
    }
    
    @PostMapping("/save")
    public String create(@RequestBody Client request){
        
      //  repository.save(request);
        
        return service.create(request);
    }

}
