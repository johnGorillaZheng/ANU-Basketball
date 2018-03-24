package com.pink.anubasketball.bean;

import java.util.Date;

public class BasketballMatchDO {
    private int id;
    private int round;
    private Date matchDate;
    private String location;
    private int homeTeamScore;
    private int guestTeamScore;
    private int competitionId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getGuestTeamScore() {
        return guestTeamScore;
    }

    public void setGuestTeamScore(int guestTeamScore) {
        this.guestTeamScore = guestTeamScore;
    }

    public int getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(int competitionId) {
        this.competitionId = competitionId;
    }
}
