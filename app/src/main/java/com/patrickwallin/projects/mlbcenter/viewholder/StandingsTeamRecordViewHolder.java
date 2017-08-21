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

public class StandingsTeamRecordViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.standings_team_name_text_view) public TextView mStandingsTeamNameTextView;
    @BindView(R.id.standings_wins_text_view) public TextView mStandingsWinsTextView;
    @BindView(R.id.standings_lost_text_view) public TextView mStandingsLostTextView;
    @BindView(R.id.standings_percentage_text_view) public TextView mStandingsPercentageTextView;
    @BindView(R.id.standings_gamesback_text_view) public TextView mStandingsGamesBackTextView;
    @BindView(R.id.standings_runs_for_text_view) public TextView mStandingsRunsForTextView;
    @BindView(R.id.standings_runs_against_text_view) public TextView mStandingsRunsAgainstTextView;

    public StandingsTeamRecordViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
