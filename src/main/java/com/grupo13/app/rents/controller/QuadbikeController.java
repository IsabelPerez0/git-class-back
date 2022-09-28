package com.grupo13.app.rents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo13.app.rents.model.IQuadbikeRepository;
import com.grupo13.app.rents.model.Quadbike;

@RestController
@RequestMapping("/api/Quadbike")
public class QuadbikeController {

    @Autowired
    IQuadbikeRepository repository;
    
    @GetMapping("/all")
    public Iterable<Quadbike> getQuadbikes(){
        Iterable<Quadbike> response = repository.findAll();

        return response;
    }

    @PostMapping("/save")
    public String createQuadbike(@RequestBody Quadbike request){
       repository.save(request);
        return "Created ...";
    }
}
