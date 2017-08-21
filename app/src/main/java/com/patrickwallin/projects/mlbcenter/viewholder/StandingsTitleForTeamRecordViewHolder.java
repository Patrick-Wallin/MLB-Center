package com.patrickwallin.projects.mlbcenter.viewholder;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.patrickwallin.projects.mlbcenter.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by piwal on 8/19/2017.
 */

public class StandingsTitleForTeamRecordViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.standings_title_team_name_text_view) public TextView mStandingsTitleTeamNameTextView;
    @BindView(R.id.standings_title_wins_text_view) public TextView mStandingsTitleWinsTextView;
    @BindView(R.id.standings_title_lost_text_view) public TextView mStandingsTitleLostTextView;
    @BindView(R.id.standings_title_percentage_text_view) public TextView mStandingsTitlePercentageTextView;
    @BindView(R.id.standings_title_gamesback_text_view) public TextView mStandingsTitleGamesbackTextView;
    @BindView(R.id.standings_title_runs_for_text_view) public TextView mStandingsTitleRunsForTextView;
    @BindView(R.id.standings_title_runs_against_text_view) public TextView mStandingTitleRunsAgainstTextView;

    public StandingsTitleForTeamRecordViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
