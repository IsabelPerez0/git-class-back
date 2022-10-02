package com.grupo13.app.rents.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo13.app.rents.entities.Message;
import com.grupo13.app.rents.service.MessageService;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    MessageService service;

    @GetMapping("/all")
    public Iterable<Message> getMesssages(){

        return service.get();
    }

    @PostMapping("/save")
    public String create(@RequestBody Message request){
       return service.create(request);
    }

    
   /*  @Autowired
    IMessageRepository repository;
    
    @GetMapping("/all")
    public Iterable<Message> getMessages(){
        Iterable<Message> response = repository.findAll();
        
        return response;
    }*/
    
 /*   @PostMapping("/save")
    public String createMessage(@RequestBody Message request){
        
        repository.save(request);
        
        return "crated....";
    } */

}
