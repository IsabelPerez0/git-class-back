package com.grupo13.app.rents;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CostumeController {
    
    @GetMapping()
    public String sayHello(){
        return "Hello";
    }
}
