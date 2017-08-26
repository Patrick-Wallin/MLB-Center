package com.patrickwallin.projects.mlbcenter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patrickwallin.projects.mlbcenter.R;
import com.patrickwallin.projects.mlbcenter.gsonmodel.GameJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.GameScoreJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.ScoresData;
import com.patrickwallin.projects.mlbcenter.viewholder.ScoresViewHolder;
import com.squareup.picasso.Picasso;

/**
 * Created by piwal on 8/21/2017.
 */

public class ScoresAdapter extends RecyclerView.Adapter<ScoresViewHolder> {
    private ScoresData mScoresData;
    private Context mContext;

    public ScoresAdapter(Context context, ScoresData scoresData) {
        mContext = context;
        mScoresData = scoresData;
    }

    public void refreshWithNewData(ScoresData scoresData) {
        mScoresData = scoresData;
        notifyDataSetChanged();
    }

    @Override
    public ScoresViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.scores_item_fragment, parent, false);
        ScoresViewHolder scoresViewHolder = new ScoresViewHolder(v);
        return scoresViewHolder;
    }

    @Override
    public void onBindViewHolder(ScoresViewHolder holder, int position) {
        if(mScoresData != null && mScoresData.getScoreboard() != null && mScoresData.getScoreboard().getGameScore() != null && position >= 0) {
            final GameScoreJSONData gameScoreJSONData = mScoresData.getScoreboard().getGameScore().get(position);
            holder.mAwayTeamNameTextView.setText(gameScoreJSONData.getGame().getAwayTeam().getName());
            holder.mHomeTeamNameTextView.setText(gameScoreJSONData.getGame().getHomeTeam().getName());
            holder.mAwayTeamRunsTextView.setText(gameScoreJSONData.getAwayScore());
            holder.mHomeTeamRunsTextView.setText(gameScoreJSONData.getHomeScore());
            String awayTeamAbbreviation = gameScoreJSONData.getGame().getAwayTeam().getAbbreviation().trim().toLowerCase();
            String homeTeamAbbreviation = gameScoreJSONData.getGame().getHomeTeam().getAbbreviation().trim().toLowerCase();
            int awayTeamResourceImage = mContext.getResources().getIdentifier(awayTeamAbbreviation, "drawable", mContext.getPackageName());
            if (awayTeamResourceImage > 0) {
                Picasso.with(mContext)
                        .load(awayTeamResourceImage)
                        .into(holder.mAwayTeamImageView);
            }
            int homeTeamResourceImage = mContext.getResources().getIdentifier(homeTeamAbbreviation, "drawable", mContext.getPackageName());
            if (homeTeamResourceImage > 0) {
                Picasso.with(mContext)
                        .load(homeTeamResourceImage)
                        .into(holder.mHomeTeamImageView);
            }
            if(gameScoreJSONData.getGame().getTime() != null) {
                holder.mScoresTimeTextView.setText(gameScoreJSONData.getGame().getTime().trim());
            }
        }
    }

    @Override
    public int getItemCount() {
        int itemCount = 0;
        if(mScoresData != null) {
            if(mScoresData.getScoreboard() != null)
                if(mScoresData.getScoreboard().getGameScore() != null)
                    itemCount = mScoresData.getScoreboard().getGameScore().size();
        }
        return itemCount;
    }
}
