package com.patrickwallin.projects.mlbcenter.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patrickwallin.projects.mlbcenter.R;
import com.patrickwallin.projects.mlbcenter.gsonmodel.DivisionJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.DivisionTeamStandingsJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.FullDivisionTeamStandingsJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.StatsJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.TeamEntryJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.TeamJSONData;
import com.patrickwallin.projects.mlbcenter.viewholder.StandingsDivisionTitleViewHolder;
import com.patrickwallin.projects.mlbcenter.viewholder.StandingsLeagueTitleViewHolder;
import com.patrickwallin.projects.mlbcenter.viewholder.StandingsTeamRecordViewHolder;
import com.patrickwallin.projects.mlbcenter.viewholder.StandingsTitleForTeamRecordViewHolder;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by piwal on 8/19/2017.
 */

public class DivisionStandingsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final int ITEM_VIEW_TYPE_LEAGUE_TITLE = 0;
    private static final int ITEM_VIEW_TYPE_DIVISION_TITLE = 1;
    private static final int ITEM_VIEW_TYPE_TEAM_RECORD_TITLE = 2;
    private static final int ITEM_VIEW_TYPE_TEAM_RECORD = 3;

    private DivisionTeamStandingsJSONData mDivisionTeamStandingsJSONData;
    private List<String> mOrganizatedMLBStandings;
    private List<Integer> mItemViewType;
    private Context mContext;

    public DivisionStandingsAdapter(Context context, FullDivisionTeamStandingsJSONData fullDivisionTeamStandingsJSONData) {
        mContext = context;
        setUpOrganizatedMLBStandings((fullDivisionTeamStandingsJSONData != null ? fullDivisionTeamStandingsJSONData.getDivisionTeamStandingsJSONData() : null));
    }

    private void setUpOrganizatedMLBStandings(DivisionTeamStandingsJSONData divisionTeamStandingsJSONData) {
        mDivisionTeamStandingsJSONData = divisionTeamStandingsJSONData;
        mOrganizatedMLBStandings = new ArrayList<>();
        mItemViewType = new ArrayList<>();
        if(mDivisionTeamStandingsJSONData != null) {
            String leagueName = "";
            String divisionName = "";
            List<DivisionJSONData> divisions = mDivisionTeamStandingsJSONData.getDivision();
            if(divisions != null) {
                for (int i = 0; i < divisions.size(); i++) {
                    DivisionJSONData division = divisions.get(i);
                    String[] name = division.getName().split("/");
                    if (!mOrganizatedMLBStandings.contains("LEAGUE NAME:"+name[0].trim())) {
                        mOrganizatedMLBStandings.add("LEAGUE NAME:"+name[0].trim());
                        mItemViewType.add(ITEM_VIEW_TYPE_LEAGUE_TITLE);
                    }
                    if (!mOrganizatedMLBStandings.contains(name[0].trim() + ":" + name[1].trim())) {
                        mOrganizatedMLBStandings.add(name[0].trim() + ":" + name[1].trim());
                        mItemViewType.add(ITEM_VIEW_TYPE_DIVISION_TITLE);
                        mOrganizatedMLBStandings.add("");
                        mItemViewType.add(ITEM_VIEW_TYPE_TEAM_RECORD_TITLE);
                    }
                    List<TeamEntryJSONData> teamEntryJSONDataList = division.getTeamEntry();
                    if (teamEntryJSONDataList != null && !teamEntryJSONDataList.isEmpty()) {
                        for (int x = 0; x < teamEntryJSONDataList.size(); x++) {
                            mOrganizatedMLBStandings.add(String.valueOf(i).trim() + "-" + String.valueOf(x).trim());
                            mItemViewType.add(ITEM_VIEW_TYPE_TEAM_RECORD);
                        }
                    }
                }
            }
        }
    }

    public void refreshWithNewData(FullDivisionTeamStandingsJSONData fullDivisionTeamStandingsJSONData) {
        setUpOrganizatedMLBStandings((fullDivisionTeamStandingsJSONData != null ? fullDivisionTeamStandingsJSONData.getDivisionTeamStandingsJSONData() : null));
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        ViewHolder vh = null;
        //= LayoutInflater.from(parent.getContext()).inflate(R.layout.all_team_item,parent,false);
        switch(viewType) {
            case ITEM_VIEW_TYPE_LEAGUE_TITLE:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.standings_league_title_item_fragment,parent,false);
                vh = new StandingsLeagueTitleViewHolder(v);
                break;
            case ITEM_VIEW_TYPE_DIVISION_TITLE:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.standings_division_title_item_fragment,parent,false);
                vh = new StandingsDivisionTitleViewHolder(v);
                break;
            case ITEM_VIEW_TYPE_TEAM_RECORD_TITLE:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.standings_title_item_fragment,parent,false);
                vh = new StandingsTitleForTeamRecordViewHolder(v);
                break;
            case ITEM_VIEW_TYPE_TEAM_RECORD:
                v = LayoutInflater.from(parent.getContext()).inflate(R.layout.standings_team_record_item_fragment,parent,false);
                vh = new StandingsTeamRecordViewHolder(v);
                break;
            default:
                vh = null;
                break;

        }
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String organizatedValue = mOrganizatedMLBStandings.get(position).trim();
        if(holder instanceof StandingsLeagueTitleViewHolder) {
            ((StandingsLeagueTitleViewHolder) holder).mStandingsLeagueTitleTextView.setText(mOrganizatedMLBStandings.get(position).split(":")[1]);
        }else {
            if(holder instanceof StandingsDivisionTitleViewHolder) {
                ((StandingsDivisionTitleViewHolder) holder).mStandingsDivisionTitleTextView.setText(mOrganizatedMLBStandings.get(position).split(":")[1]);
            }else {
                if(holder instanceof StandingsTitleForTeamRecordViewHolder) {

                }else {
                    if(holder instanceof StandingsTeamRecordViewHolder) {
                        String[] divisionAndTeam = mOrganizatedMLBStandings.get(position).split("-");
                        int divisionIndex = Integer.valueOf(divisionAndTeam[0].trim());
                        int teamIndex = Integer.valueOf(divisionAndTeam[1].trim());
                        if(mDivisionTeamStandingsJSONData != null) {
                            TeamEntryJSONData teamEntryJSONData = mDivisionTeamStandingsJSONData.getDivision().get(divisionIndex).getTeamEntry().get(teamIndex);
                            ((StandingsTeamRecordViewHolder) holder).mStandingsTeamNameTextView.setText(teamEntryJSONData.getTeam().getName());
                            ((StandingsTeamRecordViewHolder) holder).mStandingsWinsTextView.setText(teamEntryJSONData.getStats().getWins().getText());
                            ((StandingsTeamRecordViewHolder) holder).mStandingsLostTextView.setText(teamEntryJSONData.getStats().getLosses().getText());
                            String winPct = teamEntryJSONData.getStats().getWinPct().getText().trim();
                            if(winPct.startsWith("0."))
                                winPct = winPct.substring(1);
                            ((StandingsTeamRecordViewHolder) holder).mStandingsPercentageTextView.setText(winPct);
                            String gamesBack = teamEntryJSONData.getStats().getGamesBack().getText().trim();
                            if(gamesBack.equals("0.0"))
                                gamesBack = "-";
                            ((StandingsTeamRecordViewHolder) holder).mStandingsGamesBackTextView.setText(gamesBack);
                            ((StandingsTeamRecordViewHolder) holder).mStandingsRunsForTextView.setText(teamEntryJSONData.getStats().getRunsFor().getText());
                            ((StandingsTeamRecordViewHolder) holder).mStandingsRunsAgainstTextView.setText(teamEntryJSONData.getStats().getRunsAgainst().getText());
                        }
                    }
                }
            }
        }
        /*
        switch(holder.getItemViewType()) {
            case ITEM_VIEW_TYPE_LEAGUE_TITLE:

                break;
            case ITEM_VIEW_TYPE_DIVISION_TITLE:
                break;
            case ITEM_VIEW_TYPE_TEAM_RECORD_TITLE:
                break;
            case ITEM_VIEW_TYPE_TEAM_RECORD:
                break;
        }
        */

    }


    @Override
    public int getItemViewType(int position) {
        return mItemViewType.get(position);
    }

    @Override
    public int getItemCount() {
        return (mOrganizatedMLBStandings == null ? 0 : mOrganizatedMLBStandings.size());
    }


}
