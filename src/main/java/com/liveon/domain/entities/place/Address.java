package com.liveon.domain.entities.place;

import com.liveon.domain.value_objects.Location;

public class Address {
    private Location location;
    private String neighborhood;
    private String number;
    private String street;

    public Address(Location location, String neighborhood, String number, String street) {
        this.location = location;
        this.neighborhood = neighborhood;
        this.number = checkNumberIsNullOrEmpty(number);
        this.street = street;
    }

    private String checkNumberIsNullOrEmpty(String number){
        if(number.equals("")){
            number = "S/N";
        }
        return number;
    }

}


