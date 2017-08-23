package com.patrickwallin.projects.mlbcenter.viewholder;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.patrickwallin.projects.mlbcenter.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by piwal on 8/21/2017.
 */

public class ScoresViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.away_team_name_text_view)
    public TextView mAwayTeamNameTextView;
    @BindView(R.id.home_team_name_text_view)
    public TextView mHomeTeamNameTextView;

    public ScoresViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
