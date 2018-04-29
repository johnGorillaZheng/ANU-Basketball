package com.pink.anubasketball.model;

public class Competition {
    private int id;
    private String competitionName;
    private String logoLocation;
    private int seasonYear;
    private String gender;
    private int managerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getLogoLocation() {
        return logoLocation;
    }

    public void setLogoLocation(String logoLocation) {
        this.logoLocation = logoLocation;
    }

    public int getSeasonYear() {
        return seasonYear;
    }

    public void setSeasonYear(int seasonYear) {
        this.seasonYear = seasonYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }
}
