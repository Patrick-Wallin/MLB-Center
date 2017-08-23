package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/20/2017.
 */

public class HomeTeamJSONData {
    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("City")
    @Expose
    private String city;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Abbreviation")
    @Expose
    private String abbreviation;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
