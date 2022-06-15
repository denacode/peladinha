package com.liveon.domain.entities.place;

public class PlaceEntity {
    private Address address;
    private Integer capacity;
    private String name;


    public PlaceEntity(Address address, Integer capacity) {
        this.address = address;
        this.capacity = capacity;
    }
}
