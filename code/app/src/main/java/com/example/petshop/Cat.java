package com.example.petshop;

import java.security.PublicKey;
import java.util.Date;

public class Cat extends Pet implements Pettable{ //Cat extends Pet , Cat is a subclass of Pet. Cat has all the pet atributes and behavoiours
//when cat extends pet, and pet has a speak() abstract function but cat has to have it and needs to be overridden
    //if you are using an inetrafce you need to implement it

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthdate) {
        super(name, birthdate);
    }

    @Override
    public String speak(){
        return "Meow";
    }

    @Override
    public void pet() {

    }
}
