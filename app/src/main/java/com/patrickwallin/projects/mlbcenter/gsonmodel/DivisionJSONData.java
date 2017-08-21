package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piwal on 8/19/2017.
 */

public class DivisionJSONData {
    @SerializedName("@name")
    @Expose
    private String name;
    @SerializedName("teamentry")
    @Expose
    private List<TeamEntryJSONData> teamEntry = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TeamEntryJSONData> getTeamEntry() {
        return teamEntry;
    }

    public void setTeamEntry(List<TeamEntryJSONData> teamentry) {
        this.teamEntry = teamentry;
    }
}
