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
 * Created by piwal on 8/17/2017.
 */

public class AllTeamViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.team_icon_image_view) public ImageView mTeamImageView;
    @BindView(R.id.team_name_text_view) public TextView mTeamNameTextView;
    @BindView(R.id.team_record_text_view) public TextView mTeamRecordTextView;
    @BindView(R.id.team_latest_game_score) public TextView mTeamLatestScoreTextView;

    public AllTeamViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
