package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piwal on 8/20/2017.
 */

public class FullGameScheduleJSONData {
    @SerializedName("lastUpdatedOn")
    @Expose
    private String lastUpdatedOn;
    @SerializedName("gameentry")
    @Expose
    private List<GameEntryJSONData> gameentry = null;

    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public List<GameEntryJSONData> getGameentry() {
        return gameentry;
    }

    public void setGameentry(List<GameEntryJSONData> gameentry) {
        this.gameentry = gameentry;
    }}
