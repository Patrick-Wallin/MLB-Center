package com.patrickwallin.projects.mlbcenter.viewholder;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.patrickwallin.projects.mlbcenter.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by piwal on 8/21/2017.
 */

public class ScoresViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.away_team_image_view)
    public ImageView mAwayTeamImageView;
    @BindView(R.id.away_team_name_text_view)
    public TextView mAwayTeamNameTextView;
    @BindView(R.id.away_team_runs_text_view)
    public TextView mAwayTeamRunsTextView;
    @BindView(R.id.away_team_hits_text_view)
    public TextView mAwayTeamHitsTextView;
    @BindView(R.id.away_team_errors_text_view)
    public TextView mAwayTeamErrorsTextView;
    @BindView(R.id.home_team_image_view)
    public ImageView mHomeTeamImageView;
    @BindView(R.id.home_team_name_text_view)
    public TextView mHomeTeamNameTextView;
    @BindView(R.id.home_team_runs_text_view)
    public TextView mHomeTeamRunsTextView;
    @BindView(R.id.home_team_hits_text_view)
    public TextView mHomeTeamHitsTextView;
    @BindView(R.id.home_team_errors_text_view)
    public TextView mHomeTeamErrorsTextView;

    public ScoresViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
