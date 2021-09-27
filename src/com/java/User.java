package com.java;
import java.util.List;

public class User implements Observer{

    private String email;

    public User(String email){
        this.email = email;
    }

    @Override
    public void update(List<Integer> sits) {
        System.out.println(email + ", we have news for you! "
                          + "You can see available sits here: " + sits + "\n");

    }
}
