package com.grupo13.app.rents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.grupo13.app.rents.entities.Admin;
import com.grupo13.app.rents.service.AdminService;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {
    
    @Autowired
    AdminService service;

    @GetMapping("/all")
    public Iterable<Admin> getAdmins(){

        /*Iterable<Quadbike> response = repository.findAll();

        return response;*/
        return service.get();
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Admin request){
      
       service.create(request);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@RequestBody Admin request){
 
       service.update(request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Integer id){
 
       service.delete(id);
    }


}
