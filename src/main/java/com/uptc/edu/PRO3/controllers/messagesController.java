package com.uptc.edu.PRO3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class messagesController {
    
    
    @GetMapping()
    public String getMessage(){
        return "Hola Mundo";
    }
}
