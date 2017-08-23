package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/21/2017.
 */

public class ScoresData {
    @SerializedName("scoreboard")
    @Expose
    private ScoreboardJSONData scoreboard;

    public ScoreboardJSONData getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(ScoreboardJSONData scoreboard) {
        this.scoreboard = scoreboard;
    }
}
