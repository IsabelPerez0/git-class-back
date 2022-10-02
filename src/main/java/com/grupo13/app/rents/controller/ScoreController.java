package com.grupo13.app.rents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grupo13.app.rents.entities.Score;
import com.grupo13.app.rents.service.ScoreService;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {
    
    @Autowired
    ScoreService service;

    @GetMapping("/all")
    public Iterable<Score> getScores(){

        /*Iterable<Quadbike> response = repository.findAll();

        return response;*/
        return service.get();
    }

    /*@GetMapping("/{id}")
    public Optional<Score> get(@PathVariable("id") Integer id){

        return service.get(id);
    }*/

    @PostMapping("/save")
    public String create(@RequestBody Score request){
    /* 
        Optional<com.grupo13.app.rents.model.Category> cat = categoryRepository.findById(request.getCategory().getId());
        if(!cat.isEmpty()){
            request.setCategory(cat.get());
        }
    
        repository.save(request);*/
      
       return service.create(request);
    }

    
    /*@PutMapping("/update")
    public Quadbike update(@RequestBody Quadbike request){
 
       return service.update(request);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable("id") Integer id){
 
       return service.delete(id);
    }*/
}
