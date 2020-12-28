package com.ahmed35m.SBoot.dao;

import com.ahmed35m.SBoot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

@Repository("fakeDao")
public class FakePersonDaoService implements PersonDao{

    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPerson() {
        return DB;
    }

    @Override
    public int updatePerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        return DB.stream()
                .filter( (person) -> person.getId().equals(id)).findFirst();
    }


}