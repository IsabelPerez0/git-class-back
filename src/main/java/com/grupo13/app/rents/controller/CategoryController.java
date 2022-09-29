package com.grupo13.app.rents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo13.app.rents.model.Category;
import com.grupo13.app.rents.model.ICategoryRepository;


@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    
    @Autowired
    ICategoryRepository repository;
    
    @GetMapping("/all")
    public Iterable<Category> get(){
        Iterable<Category> response = repository.findAll();
        
        return response;
    }
    
    @PostMapping("/save")
    public String create(@RequestBody Category request){
        
        repository.save(request);
        
        return "created....";
    }


    
    
}