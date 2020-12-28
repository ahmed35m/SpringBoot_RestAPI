package com.ahmed35m.SBoot.api;

import com.ahmed35m.SBoot.model.Person;
import com.ahmed35m.SBoot.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    public void addPerson(Person person){
        personService.addPerson((person));
    }
}
