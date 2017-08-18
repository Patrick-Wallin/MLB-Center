package com.patrickwallin.projects.mlbcenter.fragment;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.patrickwallin.projects.mlbcenter.R;
import com.patrickwallin.projects.mlbcenter.adapter.AllTeamAdapter;
import com.patrickwallin.projects.mlbcenter.model.TeamData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by piwal on 8/17/2017.
 */

public class AllTeamFragment extends Fragment {
    @BindView(R.id.all_team_recycler_view)
    RecyclerView mAllTeamRecyclerView;

    private String mTeamAbbreviation;
    private Context mContext;
    private List<TeamData> mTeamDataList;
    private AllTeamAdapter mAllTeamAdapter;

    public AllTeamFragment() {}

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    public static AllTeamFragment newInstance(String teamAbbreviation) {
        AllTeamFragment allTeamFragment = new AllTeamFragment();
        Bundle args = new Bundle();
        args.putString("teamAbbreviation", teamAbbreviation);
        allTeamFragment.setArguments(args);
        return allTeamFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTeamAbbreviation = getArguments().getString(mTeamAbbreviation,"");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.all_team_fragment,container,false);
        ButterKnife.bind(this,view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        mAllTeamRecyclerView.setLayoutManager(linearLayoutManager);

        setUpData();
        setUpAdapter();

        //TextView teamNameTextView = (TextView) view.findViewById(R.id.team_name_text_view);
        //teamNameTextView.setText(mTeamAbbreviation);
        return view;
    }

    private void setUpData() {
        mTeamDataList = new ArrayList<>();
    }

    private void setUpAdapter() {
        mAllTeamAdapter = new AllTeamAdapter(mContext,mTeamDataList);
        mAllTeamRecyclerView.setAdapter(mAllTeamAdapter);
    }
}
