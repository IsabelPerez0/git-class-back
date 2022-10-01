package com.grupo13.app.rents.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.OptBoolean;
import com.grupo13.app.rents.entities.Quadbike;
import com.grupo13.app.rents.service.QuadbikeService;

@RestController
@RequestMapping("/api/Quadbike")
public class QuadbikeController {
    
    @Autowired
    QuadbikeService service;

    @GetMapping("/all")
    public Iterable<Quadbike> getQuadbikes(){

        /*Iterable<Quadbike> response = repository.findAll();

        return response;*/
        return service.get();
    }

    @GetMapping("/{id}")
    public Optional<Quadbike> get(@PathVariable("id") Integer id){

        return service.get(id);
    }

    @PostMapping("/save")
    public String create(@RequestBody Quadbike request){
    /* 
        Optional<com.grupo13.app.rents.model.Category> cat = categoryRepository.findById(request.getCategory().getId());
        if(!cat.isEmpty()){
            request.setCategory(cat.get());
        }
    
        repository.save(request);*/
      
       return service.create(request);
    }

    
    @PutMapping("/update")
    public Quadbike update(@RequestBody Quadbike request){
 
       return service.update(request);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer id){
 
       return service.delete(id);
    }
}
