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
 * Created by piwal on 8/23/2017.
 */

public class PlayersViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.player_team_image_view)
    public ImageView mPlayerTeamImageView;
    @BindView(R.id.player_name_text_view)
    public TextView mPlayerNameTextView;
    @BindView(R.id.position_height_weight_age_text_view)
    public TextView mPositionHeightWeightAgeTextView;
    @BindView(R.id.born_text_view)
    public TextView mBornTextView;

    public PlayersViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
