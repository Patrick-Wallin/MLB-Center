package com.patrickwallin.projects.mlbcenter.asynctask;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import com.patrickwallin.projects.mlbcenter.model.TeamData;

import java.util.List;

/**
 * Created by piwal on 8/17/2017.
 */

public class TeamDataTaskLoader extends AsyncTaskLoader<List<TeamData>> {
    private List<TeamData> mTeamDataList;

    public TeamDataTaskLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<TeamData> loadInBackground() {
        return mTeamDataList;
    }

    @Override
    protected List<TeamData> onLoadInBackground() {
        return super.onLoadInBackground();
    }
}
