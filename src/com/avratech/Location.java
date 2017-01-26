package com.avratech;

/**
 * Created by stu on 26/01/17.
 */
public class Location {
    private City city;
    private String street;
    private int number;

    public Location(City city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city=" + city +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
