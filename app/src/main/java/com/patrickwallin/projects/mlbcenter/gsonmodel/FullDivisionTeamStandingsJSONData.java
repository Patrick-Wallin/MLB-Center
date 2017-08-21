package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/20/2017.
 */

public class FullDivisionTeamStandingsJSONData {
    @SerializedName("divisionteamstandings")
    @Expose
    private DivisionTeamStandingsJSONData divisionTeamStandingsJSONData;

    public DivisionTeamStandingsJSONData getDivisionTeamStandingsJSONData() {
        return divisionTeamStandingsJSONData;
    }

    public void setDivisionTeamStandingsJSONData(DivisionTeamStandingsJSONData divisionteamstandings) {
        this.divisionTeamStandingsJSONData = divisionteamstandings;
    }}
