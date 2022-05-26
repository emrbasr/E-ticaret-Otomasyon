package entities.concrete;

import entities.abstracts.Entity;

public class User implements Entity {
    String name;
    String lastName;
    String email;
    String passport;

    public User(String name, String lastName, String email, String passport) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }




}
