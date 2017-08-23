package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/22/2017.
 */

public class PlayersStatsEntryJSONData {
    @SerializedName("player")
    @Expose
    private PlayerJSONData player;
    @SerializedName("team")
    @Expose
    private TeamJSONData team;
    @SerializedName("stats")
    @Expose
    private PlayersStatsJSONData stats;

    public PlayerJSONData getPlayer() {
        return player;
    }

    public void setPlayer(PlayerJSONData player) {
        this.player = player;
    }

    public TeamJSONData getTeam() {
        return team;
    }

    public void setTeam(TeamJSONData team) {
        this.team = team;
    }

    public PlayersStatsJSONData getStats() {
        return stats;
    }

    public void setStats(PlayersStatsJSONData stats) {
        this.stats = stats;
    }
}
