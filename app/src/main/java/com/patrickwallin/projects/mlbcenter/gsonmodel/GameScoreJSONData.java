package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/21/2017.
 */

public class GameScoreJSONData {
    @SerializedName("game")
    @Expose
    private GameJSONData game;
    @SerializedName("isUnplayed")
    @Expose
    private String isUnplayed;
    @SerializedName("isInProgress")
    @Expose
    private String isInProgress;
    @SerializedName("isCompleted")
    @Expose
    private String isCompleted;
    @SerializedName("playStatus")
    @Expose
    private Object playStatus;
    @SerializedName("awayScore")
    @Expose
    private String awayScore;
    @SerializedName("homeScore")
    @Expose
    private String homeScore;
    @SerializedName("inningSummary")
    @Expose
    private InningJSONData inningSummary;

    public GameJSONData getGame() {
        return game;
    }

    public void setGame(GameJSONData game) {
        this.game = game;
    }

    public String getIsUnplayed() {
        return isUnplayed;
    }

    public void setIsUnplayed(String isUnplayed) {
        this.isUnplayed = isUnplayed;
    }

    public String getIsInProgress() {
        return isInProgress;
    }

    public void setIsInProgress(String isInProgress) {
        this.isInProgress = isInProgress;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }

    public Object getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(Object playStatus) {
        this.playStatus = playStatus;
    }

    public String getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(String awayScore) {
        this.awayScore = awayScore;
    }

    public String getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(String homeScore) {
        this.homeScore = homeScore;
    }

    public InningJSONData getInningSummary() {
        return inningSummary;
    }

    public void setInningSummary(InningJSONData inningSummary) {
        this.inningSummary = inningSummary;
    }}
