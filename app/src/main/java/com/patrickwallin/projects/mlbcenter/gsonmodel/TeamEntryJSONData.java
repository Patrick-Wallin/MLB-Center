package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/19/2017.
 */

public class TeamEntryJSONData {
    @SerializedName("team")
    @Expose
    private TeamJSONData team;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("stats")
    @Expose
    private StatsJSONData stats;

    public TeamJSONData getTeam() {
        return team;
    }

    public void setTeam(TeamJSONData team) {
        this.team = team;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public StatsJSONData getStats() {
        return stats;
    }

    public void setStats(StatsJSONData stats) {
        this.stats = stats;
    }
}
