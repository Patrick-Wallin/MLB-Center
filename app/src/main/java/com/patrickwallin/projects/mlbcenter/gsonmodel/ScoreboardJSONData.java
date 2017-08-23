package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piwal on 8/21/2017.
 */

public class ScoreboardJSONData {
    @SerializedName("lastUpdatedOn")
    @Expose
    private String lastUpdatedOn;
    @SerializedName("gameScore")
    @Expose
    private List<GameScoreJSONData> gameScore = null;

    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public List<GameScoreJSONData> getGameScore() {
        return gameScore;
    }

    public void setGameScore(List<GameScoreJSONData> gameScore) {
        this.gameScore = gameScore;
    }
}
