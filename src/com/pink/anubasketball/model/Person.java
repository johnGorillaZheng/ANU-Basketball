package com.pink.anubasketball.model;

public class Person {
    private int id;
    private String personName;
    private String gender;
    private String logoLocation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLogoLocation() {
        return logoLocation;
    }

    public void setLogoLocation(String logoLocation) {
        this.logoLocation = logoLocation;
    }

}
