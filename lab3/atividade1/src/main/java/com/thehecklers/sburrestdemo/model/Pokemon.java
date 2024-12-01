package com.thehecklers.sburrestdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

public class Pokemon
{
    @Getter
    private final String id;
    
    @Setter
    @Getter
    private String name;

    public Pokemon(String id, String name)
    {
        this.id = id == null ? UUID.randomUUID().toString() : id;
        this.name = name;
    }

    public Pokemon(String name)
    {
        this(UUID.randomUUID().toString(), name);
    }
}
