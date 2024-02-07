package com.uptc.edu.PRO3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.model.Person;
import com.uptc.services.PersonServices;

@RestController
@RequestMapping("/info")
public class messagesController {
    

    @GetMapping("/message")
    public String message(){
        return "Hola mundo";
    }

    @GetMapping("/person")
    public Person getMessage(){
        PersonServices personServices = new PersonServices();
        return personServices.generatePerson();
    }
}
