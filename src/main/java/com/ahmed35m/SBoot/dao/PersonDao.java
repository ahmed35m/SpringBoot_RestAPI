package com.ahmed35m.SBoot.dao;
import com.ahmed35m.SBoot.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }


     List<Person> getAllPerson();
     int updatePerson(UUID id, Person person);
     int deletePersonById(UUID id);
     Optional<Person> getPersonById(UUID id);
}
