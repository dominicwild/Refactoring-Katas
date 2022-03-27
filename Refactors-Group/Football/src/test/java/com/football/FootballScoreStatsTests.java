package com.football;

import org.junit.Assert;
import org.junit.Test;


public class FootballScoreStatsTests {

    @Test
    public void totalsFootballScoresForTeam() {
        FootballScoreStats stats = new FootballScoreStats();
        Assert.assertEquals(6, stats.teamTotal("Liverpool"));
    }

}
