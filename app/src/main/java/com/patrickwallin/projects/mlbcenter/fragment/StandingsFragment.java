package com.patrickwallin.projects.mlbcenter.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.patrickwallin.projects.mlbcenter.R;
import com.patrickwallin.projects.mlbcenter.adapter.DivisionStandingsAdapter;
import com.patrickwallin.projects.mlbcenter.gsonmodel.DivisionTeamStandingsJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.FullDivisionTeamStandingsJSONData;

import org.json.JSONException;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Credentials;

/**
 * Created by piwal on 8/18/2017.
 */

public class StandingsFragment extends Fragment {
    @BindView(R.id.standings_recycler_view)
    RecyclerView mStandingsRecyclerView;

    private Context mContext;
    private FullDivisionTeamStandingsJSONData mFullDivisionTeamStandingsJSONData;
    private DivisionStandingsAdapter mDivisionStandingsAdapter;

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

        ButterKnife.bind(this,view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        mStandingsRecyclerView.setLayoutManager(linearLayoutManager);

        setUpData();
        setUpAdapter();
        gatherData();

        return view;
    }

    private void setUpData() {
        mFullDivisionTeamStandingsJSONData = new FullDivisionTeamStandingsJSONData();
    }

    private void setUpAdapter() {
        mDivisionStandingsAdapter = new DivisionStandingsAdapter(mContext,mFullDivisionTeamStandingsJSONData);
        mStandingsRecyclerView.setAdapter(mDivisionStandingsAdapter);
    }

    private void gatherData() {
        String loginInfo = getString(R.string.username) + ":" + getString(R.string.password);
        byte[] encodingByte = Base64.encode (loginInfo.getBytes(), Base64.DEFAULT);
        final String encoding = new String(encodingByte);

        int year = Calendar.getInstance().get(Calendar.YEAR);

        AndroidNetworking.get(getString(R.string.mysportsfeeds_url))
                .addPathParameter(getString(R.string.version_number), getString(R.string.mysportsfeeds_version))
                .addPathParameter(getString(R.string.season_name), String.valueOf(year) + "-" + getString(R.string.regular))
                .addPathParameter(getString(R.string.feeds),getString(R.string.feeds_division_team_standings))
                //.setOkHttpClient(okHttpClient)
                .addHeaders("Authorization", Credentials.basic(getString(R.string.username),getString(R.string.password)))
                .setPriority(Priority.LOW)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        try {
                            mFullDivisionTeamStandingsJSONData = gson.fromJson(response, FullDivisionTeamStandingsJSONData.class);
                            mDivisionStandingsAdapter.refreshWithNewData(mFullDivisionTeamStandingsJSONData);
                        }catch(JsonSyntaxException e) {
                            Log.i("JSONSYNTAXException",e.getMessage());
                        }catch(JsonParseException e) {
                            Log.i("JsonParseException",e.getMessage());
                        }
                        //Log.i("tag-response",response.toString());
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.i("tag-error",anError.toString());
                    }
                });

    }


}
