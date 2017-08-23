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

public class PlayersStatisticsViewHolder extends RecyclerView.ViewHolder {
    @Nullable
    @BindView(R.id.statistics_titles_text_view) public TextView mStatisticsTitlesTextView;
    @BindView(R.id.first_rank_number_text_view) public TextView mFirstRankNumberTextView;
    @BindView(R.id.first_rank_name_text_view) public TextView mFirstRankNameTextView;
    @BindView(R.id.first_rank_result_text_view) public TextView mFirstRankResultTextView;
    @BindView(R.id.second_rank_number_text_view) public TextView mSecondRankNumberTextView;
    @BindView(R.id.second_rank_name_text_view) public TextView mSecondRankNameTextView;
    @BindView(R.id.second_rank_result_text_view) public TextView mSecondRankResultTextView;

    public PlayersStatisticsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
