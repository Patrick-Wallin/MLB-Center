package com.patrickwallin.projects.mlbcenter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patrickwallin.projects.mlbcenter.R;
import com.patrickwallin.projects.mlbcenter.gsonmodel.BasicStatsInfoJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.CumulativePlayersStatsData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.PlayerJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.PlayersStatsEntryJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.PlayersStatsJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.TeamJSONData;
import com.patrickwallin.projects.mlbcenter.viewholder.PlayersStatisticsViewHolder;
import com.patrickwallin.projects.mlbcenter.viewholder.ScoresViewHolder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by piwal on 8/21/2017.
 */

public class PlayersStatisticsAdapter extends RecyclerView.Adapter<PlayersStatisticsViewHolder> {
    private HashMap<String,CumulativePlayersStatsData> mCumulativePlayersStatsDataList;

    private final List<String> mStatisticsMenuKey = new ArrayList<>();
    private final List<String> mStatisticsMenuTitle = new ArrayList<>();
    private final HashMap<String,String[]> mRecordsForStatistics = new HashMap<>();

    private Context mContext;

    public PlayersStatisticsAdapter(Context context, HashMap<String,CumulativePlayersStatsData> cumulativePlayersStatsDataList) {
        mContext = context;
        mCumulativePlayersStatsDataList = cumulativePlayersStatsDataList;
        String[] mainStatisticsMenuTitle = mContext.getResources().getStringArray(R.array.statistics_menu_title);
        String[] mainStatisticsMenuKey = mContext.getResources().getStringArray(R.array.statistics_menu_key);
        for(int i = 0; i < mainStatisticsMenuTitle.length; i++) {
            mStatisticsMenuKey.add(mainStatisticsMenuKey[i]);
            mStatisticsMenuTitle.add(mainStatisticsMenuTitle[i]);
            mRecordsForStatistics.put(mainStatisticsMenuKey[i],new String[]{"",""});
        }
        //updateRecords();
    }

    public void refreshWithData(HashMap<String,CumulativePlayersStatsData> cumulativePlayersStatsDataList) {
        mCumulativePlayersStatsDataList = cumulativePlayersStatsDataList;
        //updateRecords();
        notifyDataSetChanged();
    }

    private void updateRecords() {
        /*
                mCumulativePlayersStatsData.getCumulativeplayerstats() != null &&
                mCumulativePlayersStatsData.getCumulativeplayerstats().getPlayerstatsentry() != null &&
                mCumulativePlayersStatsData.getCumulativeplayerstats().getPlayerstatsentry().size() > 0) {
            List<PlayersStatsEntryJSONData> playersStatsEntryJSONDataList =
                    mCumulativePlayersStatsData.getCumulativeplayerstats().getPlayerstatsentry();
            ArrayList<Double> battingAverageList = new ArrayList<>();
            for(int i = 0;  i < playersStatsEntryJSONDataList.size(); i++) {
                PlayerJSONData playerJSONData = playersStatsEntryJSONDataList.get(i).getPlayer();
                TeamJSONData teamJSONData = playersStatsEntryJSONDataList.get(i).getTeam();
                PlayersStatsJSONData playersStatsJSONData = playersStatsEntryJSONDataList.get(i).getStats();
                BasicStatsInfoJSONData battingAverage = playersStatsJSONData.getBattingAvg();
                Integer gamePlayed = Integer.valueOf(playersStatsJSONData.getGamesPlayed().getText().trim());
                Integer plateAppearance = Integer.valueOf(playersStatsJSONData.getPlateAppearances().getText().trim());
                if(gamePlayed > 0) {
                    double platePerGame = (double) plateAppearance / gamePlayed;
                    if(platePerGame > 3)
                        battingAverageList.add(Double.parseDouble(battingAverage.getText().toString()));
                }
            }

            Collections.sort(battingAverageList,Collections.<Double>reverseOrder());
            for(int i = 0; i < battingAverageList.size(); i++) {
                Log.i("tet order",String.valueOf(battingAverageList.get(i)));
            }
            */
            /*
            for(int i = 0;  i < playersStatsEntryJSONDataList.size(); i++) {
                PlayerJSONData playerJSONData = playersStatsEntryJSONDataList.get(i).getPlayer();
                TeamJSONData teamJSONData = playersStatsEntryJSONDataList.get(i).getTeam();
                String[] topBattingAverage = mRecordsForStatistics.get(mContext.getResources().getString(R.string.AVG));
                double firstRankValue = 0;
                double secondRankValue = 0;

                if(topBattingAverage[0].trim().isEmpty()) {
                    firstRankValue = 0;
                    secondRankValue = 0;
                }else {
                    String[] splitValue = topBattingAverage[0].split(";");
                    firstRankValue = Double.parseDouble(splitValue[1].trim());
                    if(!topBattingAverage[1].trim().isEmpty()) {
                        splitValue = topBattingAverage[1].split(";");
                        secondRankValue = Double.parseDouble(splitValue[1].trim());
                    }
                }
                BasicStatsInfoJSONData battingAverage = playersStatsEntryJSONDataList.get(i).getStats().getBattingAvg();

                double avg = Double.parseDouble(battingAverage.getText().toString());
                if(avg < firstRankValue && avg < secondRankValue) {
                    // do nothing
                }else {
                    if (avg > firstRankValue) {
                        topBattingAverage[1] = topBattingAverage[0];
                        topBattingAverage[0] = playerJSONData.getFirstName().trim() + " - " + teamJSONData.getAbbreviation().trim() + ";" + String.valueOf(avg);
                    } else {
                        topBattingAverage[1] = playerJSONData.getFirstName().trim() + " - " + teamJSONData.getAbbreviation().trim() + ";" + String.valueOf(avg);
                    }
                }

            }
            */
       // }
    }

    @Override
    public PlayersStatisticsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.players_statistics_item_fragment, parent, false);
        PlayersStatisticsViewHolder playersStatisticsViewHolder = new PlayersStatisticsViewHolder(v);
        return playersStatisticsViewHolder;
    }

    @Override
    public void onBindViewHolder(PlayersStatisticsViewHolder holder, int position) {
        if(mStatisticsMenuKey != null && mStatisticsMenuKey.size() > 0) {
            holder.mStatisticsTitlesTextView.setText(mStatisticsMenuTitle.get(position));
            if(mCumulativePlayersStatsDataList != null && mCumulativePlayersStatsDataList.size() > 0) {
                CumulativePlayersStatsData cumulativePlayersStatsData = mCumulativePlayersStatsDataList.get(mStatisticsMenuKey.get(position));
                if(cumulativePlayersStatsData != null) {
                    List<PlayersStatsEntryJSONData> playersStatsEntryJSONDataList =
                            cumulativePlayersStatsData.getCumulativeplayerstats().getPlayerstatsentry();
                    boolean bExit = false;
                    int count = 0;
                    for(int i = 0;  i < playersStatsEntryJSONDataList.size(); i++) {
                        PlayerJSONData playerJSONData = playersStatsEntryJSONDataList.get(i).getPlayer();
                        TeamJSONData teamJSONData = playersStatsEntryJSONDataList.get(i).getTeam();
                        PlayersStatsJSONData playersStatsJSONData = playersStatsEntryJSONDataList.get(i).getStats();
                        if(mStatisticsMenuKey.get(position).equalsIgnoreCase(mContext.getString(R.string.AVG))) {
                            BasicStatsInfoJSONData battingAverage = playersStatsJSONData.getBattingAvg();
                            Integer gamePlayed = Integer.valueOf(playersStatsJSONData.getGamesPlayed().getText().trim());
                            Integer plateAppearance = Integer.valueOf(playersStatsJSONData.getPlateAppearances().getText().trim());
                            if (gamePlayed > 0) {
                                double platePerGame = (double) plateAppearance / gamePlayed;
                                if (platePerGame > 3.0) {
                                    count++;
                                    if(count >= 2)
                                        bExit = true;
                                    if(count == 1) {
                                        holder.mFirstRankNumberTextView.setText(String.valueOf(count));
                                        holder.mFirstRankNameTextView.setText(playerJSONData.getLastName()+", " + playerJSONData.getFirstName());
                                        holder.mFirstRankResultTextView.setText(battingAverage.getText());
                                    }else {
                                        holder.mSecondRankNumberTextView.setText(String.valueOf(count));
                                        holder.mSecondRankNameTextView.setText(playerJSONData.getLastName()+", " + playerJSONData.getFirstName());
                                        holder.mSecondRankResultTextView.setText(battingAverage.getText());
                                    }
                                }

                            }
                        }else {
                            if(mStatisticsMenuKey.get(position).equalsIgnoreCase(mContext.getString(R.string.HR))) {
                                String value = "";
                                if(playersStatsJSONData != null && playersStatsJSONData.getHomeruns() != null)
                                    value = playersStatsJSONData.getHomeruns().getText();
                                count++;
                                if(count == 1) {
                                    holder.mFirstRankNumberTextView.setText(String.valueOf(count));
                                    holder.mFirstRankNameTextView.setText(playerJSONData.getLastName()+", " + playerJSONData.getFirstName());
                                    holder.mFirstRankResultTextView.setText(value);
                                }else {
                                    bExit = true;
                                    holder.mSecondRankNumberTextView.setText(String.valueOf(count));
                                    holder.mSecondRankNameTextView.setText(playerJSONData.getLastName()+", " + playerJSONData.getFirstName());
                                    holder.mSecondRankResultTextView.setText(value);
                                }
                            }else {
                                bExit = true;
                            }
                        }
                        if(bExit)
                            break;
                    }
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return (mStatisticsMenuKey != null ? mStatisticsMenuKey.size() : 0);
    }
}
