package com.liveon.domain.entities.player;

public abstract class Person {
    private String name;
    private String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
