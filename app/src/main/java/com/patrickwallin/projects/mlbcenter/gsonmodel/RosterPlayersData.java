package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/23/2017.
 */

public class RosterPlayersData {
    @SerializedName("rosterplayers")
    @Expose
    private RosterPlayersJSONData rosterplayers;

    public RosterPlayersJSONData getRosterplayers() {
        return rosterplayers;
    }

    public void setRosterplayers(RosterPlayersJSONData rosterplayers) {
        this.rosterplayers = rosterplayers;
    }}
