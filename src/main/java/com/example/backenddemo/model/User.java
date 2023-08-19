package com.example.backenddemo.model;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    User () {
    }
    User (int i, String fn, String ln) {
        id = i;
        firstName = fn;
        lastName = ln;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String ln) {
        lastName = ln;
    }

}
