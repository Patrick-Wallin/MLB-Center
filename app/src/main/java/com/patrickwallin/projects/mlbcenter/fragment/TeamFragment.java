package com.patrickwallin.projects.mlbcenter.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.patrickwallin.projects.mlbcenter.R;

/**
 * Created by piwal on 8/16/2017.
 */

public class TeamFragment extends Fragment {
    private String mTeamAbbreviation;

    public TeamFragment() {}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.team_fragment,container,false);
        //return super.onCreateView(inflater, container, savedInstanceState);
    }
}
