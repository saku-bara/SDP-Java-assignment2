package com.java;

public interface Observable {
    void userJoinWaitlist(Observer user);
    void userUnregister(Observer user);
    void notifyAllUsers();
}
