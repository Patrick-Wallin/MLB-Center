package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/21/2017.
 */

public class GameJSONData {
    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("scheduleStatus")
    @Expose
    private String scheduleStatus;
    @SerializedName("originalDate")
    @Expose
    private Object originalDate;
    @SerializedName("originalTime")
    @Expose
    private Object originalTime;
    @SerializedName("delayedOrPostponedReason")
    @Expose
    private Object delayedOrPostponedReason;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("awayTeam")
    @Expose
    private AwayTeamJSONData awayTeam;
    @SerializedName("homeTeam")
    @Expose
    private HomeTeamJSONData homeTeam;
    @SerializedName("location")
    @Expose
    private String location;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public Object getOriginalDate() {
        return originalDate;
    }

    public void setOriginalDate(Object originalDate) {
        this.originalDate = originalDate;
    }

    public Object getOriginalTime() {
        return originalTime;
    }

    public void setOriginalTime(Object originalTime) {
        this.originalTime = originalTime;
    }

    public Object getDelayedOrPostponedReason() {
        return delayedOrPostponedReason;
    }

    public void setDelayedOrPostponedReason(Object delayedOrPostponedReason) {
        this.delayedOrPostponedReason = delayedOrPostponedReason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public AwayTeamJSONData getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeamJSONData awayTeam) {
        this.awayTeam = awayTeam;
    }

    public HomeTeamJSONData getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeamJSONData homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
