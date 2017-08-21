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

public class StandingsLeagueTitleViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.standings_league_title_text_view) public TextView mStandingsLeagueTitleTextView;

    public StandingsLeagueTitleViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
