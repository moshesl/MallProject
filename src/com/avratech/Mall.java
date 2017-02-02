package com.avratech;


import java.util.ArrayList;

/*
 * Created by stu on 25/01/17.
 */
public class Mall {

    private ArrayList<Shop> shops = new ArrayList<>();
    private ArrayList<Stand> stands = new ArrayList<>();
    private ArrayList<Eateries> eateries = new ArrayList<>();
    private ArrayList<DepartmentStore> departmentStores = new ArrayList<>();
    private ArrayList<Shop> coordinates = new ArrayList<>();

    private String name;
    private Owner owner;
    private Location location;

    public Mall(String name, Owner owner, Location location) {
        setName(name);
        setOwner(owner);
        setLocation(location);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public Location getLocation() {
        return location;
    }

    public static void coordinates (){

    }



}
