package com.football;

public class Game {

    private String homeTeam;
    private int homeTeamScore;
    private String awayTeam;
    private int awayTeamScore;

    public Game(String homeTeam, int homeTeamScore, String awayTeam, int awayTeamScore) {
        this.homeTeam = homeTeam;
        this.homeTeamScore = homeTeamScore;
        this.awayTeam = awayTeam;
        this.awayTeamScore = awayTeamScore;
    }

    public static Game[] getAllPlayed() {
        Game[] played = new Game[3];
        played[0] = new Game("Liverpool", 2, "Everton", 0);
        played[1] = new Game("Aston Villa", 1, "Liverpool", 1);
        played[2] = new Game("Liverpool", 3, "West Ham", 1);
        return played;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

}
