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
            if(playerEntryJSONData != null) {
                PlayerJSONData playerJSONData = playerEntryJSONData.getPlayer();
                String nameAndJerseyNumber = "";
                String positionAndHeightAndWeightAndAge = "";
                String born = "";
                if (playerJSONData != null) {
                    if(playerJSONData.getLastName() != null)
                        nameAndJerseyNumber = playerJSONData.getLastName().trim();
                    if(playerJSONData.getFirstName() != null)
                        nameAndJerseyNumber += ", " + playerJSONData.getFirstName();
                    if(playerJSONData.getJerseyNumber() != null)
                        nameAndJerseyNumber += " | #" + playerJSONData.getJerseyNumber();
                    if(playerJSONData.getPosition() != null)
                        positionAndHeightAndWeightAndAge = playerJSONData.getPosition().trim();
                    if(playerJSONData.getHeight() != null) {
                        if(!positionAndHeightAndWeightAndAge.isEmpty())
                            positionAndHeightAndWeightAndAge += " | ";
                        positionAndHeightAndWeightAndAge += playerJSONData.getHeight();
                    }
                    if(playerJSONData.getWeight() != null) {
                        if(!positionAndHeightAndWeightAndAge.isEmpty())
                            positionAndHeightAndWeightAndAge += " / ";
                        positionAndHeightAndWeightAndAge += playerJSONData.getWeight();
                    }
                    if(playerJSONData.getAge() != null) {
                        if(!positionAndHeightAndWeightAndAge.isEmpty())
                            positionAndHeightAndWeightAndAge += " | Age: ";
                        positionAndHeightAndWeightAndAge += playerJSONData.getAge();
                    }
                    if(playerJSONData.getBirthDate() != null ||
                            playerJSONData.getBirthCity() != null ||
                            playerJSONData.getBirthCountry() != null) {
                        born = "";
                        if(playerJSONData.getBirthDate() != null)
                            born += playerJSONData.getBirthDate().trim();
                        if(playerJSONData.getBirthCity() != null) {
                            if(!born.isEmpty())
                                born += " | ";
                            born += playerJSONData.getBirthCity();
                        }
                        if(playerJSONData.getBirthCountry() != null) {
                            if(!born.isEmpty())
                                born += ", ";
                            born += playerJSONData.getBirthCountry();
                        }
                        born = "Born: " + born;
                    }

                }
                holder.mPlayerNameTextView.setText(nameAndJerseyNumber);
                holder.mPositionHeightWeightAgeTextView.setText(positionAndHeightAndWeightAndAge);
                holder.mBornTextView.setText(born);
            }
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
