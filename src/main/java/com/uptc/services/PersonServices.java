package com.uptc.services;

import com.uptc.model.Person;

public class PersonServices {
    private Person personOne;

    public Person generatePerson(){
        Person person = new Person();
        person.setName("Oscar");
        person.setLastname("Gonzalez");
        person.setWeight(123);
        return person;
        
    }
}
