package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piwal on 8/22/2017.
 */

public class CumulativePlayersStatsJSONData {
    @SerializedName("lastUpdatedOn")
    @Expose
    private String lastUpdatedOn;
    @SerializedName("playerstatsentry")
    @Expose
    private List<PlayersStatsEntryJSONData> playerstatsentry = null;

    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public List<PlayersStatsEntryJSONData> getPlayerstatsentry() {
        return playerstatsentry;
    }

    public void setPlayerstatsentry(List<PlayersStatsEntryJSONData> playerstatsentry) {
        this.playerstatsentry = playerstatsentry;
    }
}
