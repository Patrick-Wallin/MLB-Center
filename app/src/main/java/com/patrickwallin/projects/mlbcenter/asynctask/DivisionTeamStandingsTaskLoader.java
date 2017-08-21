package com.patrickwallin.projects.mlbcenter.asynctask;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import com.patrickwallin.projects.mlbcenter.gsonmodel.DivisionTeamStandingsJSONData;

import java.util.List;

/**
 * Created by piwal on 8/19/2017.
 */

public class DivisionTeamStandingsTaskLoader extends AsyncTaskLoader<List<DivisionTeamStandingsJSONData>> {
    public DivisionTeamStandingsTaskLoader(Context context) {
        super(context);
    }

    @Override
    public List<DivisionTeamStandingsJSONData> loadInBackground() {
        return null;
    }
}
