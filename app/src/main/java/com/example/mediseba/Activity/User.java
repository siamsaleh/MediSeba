package com.example.mediseba.Activity;

public class User {  String name, address,email;
    int number;

    public User(String name, String address, String email, int number) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.number = number;
    }
    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
