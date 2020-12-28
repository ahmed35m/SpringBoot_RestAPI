package com.ahmed35m.SBoot.service;

import com.ahmed35m.SBoot.dao.PersonDao;
import com.ahmed35m.SBoot.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao){
        this.personDao = personDao;
    }
    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}
