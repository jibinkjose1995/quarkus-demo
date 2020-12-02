package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private short age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player()
    {

    }

    public Player(String firstName, String lastName, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
