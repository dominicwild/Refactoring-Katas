package com.football;

public class Game {

    public static final String LIVERPOOL = "Liverpool";
    public static final String EVERTON = "Everton";
    public static final String WEST_HAM = "West Ham";
    public static final String ASTON_VILLA = "Aston Villa";
    private final String homeTeam;
    private final int homeTeamScore;
    private final String awayTeam;
    private final int awayTeamScore;

    public Game(String homeTeam, int homeTeamScore, String awayTeam, int awayTeamScore) {
        this.homeTeam = homeTeam;
        this.homeTeamScore = homeTeamScore;
        this.awayTeam = awayTeam;
        this.awayTeamScore = awayTeamScore;
    }

    public static Game[] getAllPlayed() {
        Game[] played = new Game[3];
        played[0] = new Game(LIVERPOOL, 2, EVERTON, 0);
        played[1] = new Game(ASTON_VILLA, 1, LIVERPOOL, 1);
        played[2] = new Game(LIVERPOOL, 3, WEST_HAM, 1);
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

    boolean isHomeTeam(String teamName) {
        return getHomeTeam().equals(teamName);
    }

    boolean isAwayTeam(String teamName) {
        return getAwayTeam().equals(teamName);
    }
}
