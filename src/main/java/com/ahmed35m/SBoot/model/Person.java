package com.ahmed35m.SBoot.model;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;

    public Person(UUID id, String name){
        this.id = id;
        this.name = name;
    }

    public Person() {
        name = null;
        id = null;
    }

    public String getName(){
        return name;
    }

    public UUID getId() {
        return id;
    }
}
