package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/23/2017.
 */

public class PlayerEntryJSONData {
    @SerializedName("player")
    @Expose
    private PlayerJSONData player;
    @SerializedName("team")
    @Expose
    private TeamJSONData team;

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
    }}
