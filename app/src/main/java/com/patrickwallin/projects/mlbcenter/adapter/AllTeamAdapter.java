package com.patrickwallin.projects.mlbcenter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patrickwallin.projects.mlbcenter.R;
import com.patrickwallin.projects.mlbcenter.model.TeamData;
import com.patrickwallin.projects.mlbcenter.viewholder.AllTeamViewHolder;

import java.util.List;

/**
 * Created by piwal on 8/17/2017.
 */

public class AllTeamAdapter extends RecyclerView.Adapter<AllTeamViewHolder> {
    private List<TeamData> mTeamDataList;
    private Context mContext;

    public AllTeamAdapter(Context context, List<TeamData> teamDataList) {
        mContext = context;
        mTeamDataList = teamDataList;
    }

    @Override
    public AllTeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_team_item,parent,false);
        AllTeamViewHolder allTeamViewHolder = new AllTeamViewHolder(v);
        return allTeamViewHolder;
    }

    @Override
    public void onBindViewHolder(AllTeamViewHolder holder, int position) {
        if(mTeamDataList != null && !mTeamDataList.isEmpty() && position >= 0) {

        }

    }

    @Override
    public int getItemCount() {
        return (mTeamDataList == null ? 0 : mTeamDataList.size());
    }
}
