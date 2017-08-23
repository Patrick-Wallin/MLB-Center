package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/20/2017.
 */

public class FullGameScheduleData {
    @SerializedName("fullgameschedule")
    @Expose
    private FullGameScheduleJSONData fullgameschedule;

    public FullGameScheduleJSONData getFullgameschedule() {
        return fullgameschedule;
    }

    public void setFullgameschedule(FullGameScheduleJSONData fullgameschedule) {
        this.fullgameschedule = fullgameschedule;
    }
}
