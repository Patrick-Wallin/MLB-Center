package com.patrickwallin.projects.mlbcenter.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patrickwallin.projects.mlbcenter.R;

/**
 * Created by piwal on 8/18/2017.
 */

public class StandingsFragment extends Fragment {
    private  Context mContext;

    public static StandingsFragment newInstance() {
        StandingsFragment standingsFragment = new StandingsFragment();
        //Bundle args = new Bundle();
        //args.putString("teamAbbreviation", teamAbbreviation);
        //allTeamFragment.setArguments(args);
        return standingsFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.standings_fragment,container,false);
        Log.i("tab","view");
        return view;
    }
}
