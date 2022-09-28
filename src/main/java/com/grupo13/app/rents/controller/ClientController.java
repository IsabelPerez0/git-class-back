package com.grupo13.app.rents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo13.app.rents.model.Client;
import com.grupo13.app.rents.model.IClientRepository;
import com.grupo13.app.rents.model.IQuadbikeRepository;
import com.grupo13.app.rents.model.Quadbike;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    IClientRepository repository;
    
    @GetMapping("/all")
    public Iterable<Client> getClients(){
        Iterable<Client> response = repository.findAll();

        return response;
    }

    @PostMapping("/save")
    public String createClient(@RequestBody Client request){
       repository.save(request);
        return "Created ...";
    }
}
