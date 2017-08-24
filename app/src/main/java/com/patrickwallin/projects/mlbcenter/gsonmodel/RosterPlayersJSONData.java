package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piwal on 8/23/2017.
 */

public class RosterPlayersJSONData {
    @SerializedName("lastUpdatedOn")
    @Expose
    private String lastUpdatedOn;
    @SerializedName("playerentry")
    @Expose
    private List<PlayerEntryJSONData> playerentry = null;

    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public List<PlayerEntryJSONData> getPlayerentry() {
        return playerentry;
    }

    public void setPlayerentry(List<PlayerEntryJSONData> playerentry) {
        this.playerentry = playerentry;
    }
}
