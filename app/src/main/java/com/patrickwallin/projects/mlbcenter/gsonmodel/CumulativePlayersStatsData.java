package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/22/2017.
 */

public class CumulativePlayersStatsData {
    @SerializedName("cumulativeplayerstats")
    @Expose
    private CumulativePlayersStatsJSONData cumulativeplayerstats;

    public CumulativePlayersStatsJSONData getCumulativeplayerstats() {
        return cumulativeplayerstats;
    }

    public void setCumulativeplayerstats(CumulativePlayersStatsJSONData cumulativeplayerstats) {
        this.cumulativeplayerstats = cumulativeplayerstats;
    }
}
