package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by piwal on 8/19/2017.
 */

public class DivisionTeamStandingsJSONData {
    @SerializedName("lastUpdatedOn")
    @Expose
    private String lastUpdatedOn;
    @SerializedName("division")
    @Expose
    private List<DivisionJSONData> division = null;

    public String getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(String lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public List<DivisionJSONData> getDivision() {
        return division;
    }

    public void setDivision(List<DivisionJSONData> division) {
        this.division = division;
    }
}
