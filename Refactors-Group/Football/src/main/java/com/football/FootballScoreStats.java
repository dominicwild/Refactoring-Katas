package com.football;

public class FootballScoreStats {

    public int teamTotal(String teamName) {
        int total = 0;
        for (Game game : Game.getAllPlayed()) {
            if (game.isHomeTeam(teamName))
                total += game.getHomeTeamScore();
            if (game.isAwayTeam(teamName))
                total += game.getAwayTeamScore();
        }
        return total;
    }

}
