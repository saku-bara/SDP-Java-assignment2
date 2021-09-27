package com.java;

import java.util.ArrayList;
import java.util.List;

public class TicketSaleSite implements Observable{

    private List<Observer> user = new ArrayList<>();
    private List<Integer> sits = new ArrayList<>();


    public void updateSits(Integer sits){
        this.sits.add(sits);
        notifyAllUsers();
    }

    public void removeSits(Integer sits){
        this.sits.remove(sits);
        notifyAllUsers();
    }

    @Override
    public void userJoinWaitlist(Observer user) {
        this.user.add(user);
        System.out.println("New user joined the waitlist\n");
    }


    @Override
    public void userUnregister(Observer user) {
        this.user.remove(user);
        System.out.println("User successfully unregistered\n");
    }

    @Override
    public void notifyAllUsers() {
        for (Observer user: user){
            user.update(this.sits);
        }

    }
}
