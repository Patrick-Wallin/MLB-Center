package com.patrickwallin.projects.mlbcenter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patrickwallin.projects.mlbcenter.R;
import com.patrickwallin.projects.mlbcenter.gsonmodel.PlayerEntryJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.PlayerJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.RosterPlayersData;
import com.patrickwallin.projects.mlbcenter.viewholder.PlayersViewHolder;
import com.patrickwallin.projects.mlbcenter.viewholder.ScoresViewHolder;

/**
 * Created by piwal on 8/23/2017.
 */

public class PlayersAdapter extends RecyclerView.Adapter<PlayersViewHolder> {
    private Context mContext;
    private RosterPlayersData mRosterPlayersData;

    public PlayersAdapter(Context context, RosterPlayersData rosterPlayersData) {
        mContext = context;
        mRosterPlayersData = rosterPlayersData;
    }

    public void refreshWithData(RosterPlayersData rosterPlayersData) {
        mRosterPlayersData = rosterPlayersData;
        notifyDataSetChanged();
    }

    @Override
    public PlayersViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.players_item_fragment, parent, false);
        PlayersViewHolder playersViewHolder = new PlayersViewHolder(v);
        return playersViewHolder;
    }

    @Override
    public void onBindViewHolder(PlayersViewHolder holder, int position) {
        if(position >= 0 && mRosterPlayersData != null &&
                mRosterPlayersData.getRosterplayers() != null &&
                mRosterPlayersData.getRosterplayers().getPlayerentry() != null) {
            PlayerEntryJSONData playerEntryJSONData = mRosterPlayersData.getRosterplayers().getPlayerentry().get(position);
            PlayerJSONData playerJSONData = playerEntryJSONData.getPlayer();
            holder.mPlayerNameTextView.setText(playerJSONData.getLastName().trim() + ", " + playerJSONData.getFirstName());
            holder.mHeightWeightTextView.setText(playerJSONData.getHeight() + " " + playerJSONData.getWeight().trim() + " lbs");
            holder.mBirthDateTextView.setText(playerJSONData.getBirthDate());
            holder.mAgeTextView.setText(playerJSONData.getAge());
            holder.mBirthCountryTextView.setText(playerJSONData.getBirthCountry());
            holder.mBirthCityTextView.setText(playerJSONData.getBirthCity());
            holder.mRookieTextView.setText(playerJSONData.getIsRookie().trim());
        }
    }

    @Override
    public int getItemCount() {
        int itemCount = 0;
        if(mRosterPlayersData != null) {
            if(mRosterPlayersData.getRosterplayers() != null)
                if(mRosterPlayersData.getRosterplayers().getPlayerentry() != null)
                    itemCount = mRosterPlayersData.getRosterplayers().getPlayerentry().size();
        }
        return itemCount;
    }
}
