package com.ahmed35m.SBoot.dao;

import com.ahmed35m.SBoot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FakePersonDaoService implements PersonDao{

    private static List<Person> DB = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

}
