package com.ahmed35m.SBoot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
//import javax.validation.constraints.NotBlank;

import java.util.UUID;

public class Person {
    private final UUID id;

    //@NotBlank
    private final String name;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name){
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
