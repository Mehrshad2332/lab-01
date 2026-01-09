package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    //why abstract? just like regular classes can be exteneded and all but they just cannot be instantouted, no constrcted
    //variables are lowercase
    //Private why?
    private String name;
    private Date  birthdate;

//    public Pet(String name){
//
//        this.name = name;
//        this.birthdate = new Date();//this calls the defeault instrctor of Date and retruns whatever value the dafalut date is
//
//    }
//
//    public Pet(String name, Date birthdate){
//
//        this.name = name;
//        this.birthdate = birthdate;
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) { // void because there is no return type void bc it is doing smth
        this.birthdate = birthdate;
    }

    public abstract String speak();


}



