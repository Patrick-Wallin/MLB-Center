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
import android.widget.TextView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.patrickwallin.projects.mlbcenter.R;
import com.patrickwallin.projects.mlbcenter.adapter.PlayersAdapter;
import com.patrickwallin.projects.mlbcenter.gsonmodel.RosterPlayersData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.ScoresData;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Credentials;

/**
 * Created by piwal on 8/23/2017.
 */

public class PlayersFragment extends Fragment {
    @BindView(R.id.players_recycler_view)
    RecyclerView mPlayersRecyclerView;

    private Context mContext;
    private RosterPlayersData mRosterPlayersData;
    private PlayersAdapter mPlayersAdapter;

    public static PlayersFragment newInstance() {
        PlayersFragment playersFragment = new PlayersFragment();
        //Bundle args = new Bundle();
        //args.putString("teamAbbreviation", teamAbbreviation);
        //allTeamFragment.setArguments(args);
        return playersFragment;
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
        View view = inflater.inflate(R.layout.players_fragment,container,false);

        ButterKnife.bind(this,view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        mPlayersRecyclerView.setLayoutManager(linearLayoutManager);
        mPlayersRecyclerView.setHasFixedSize(true);

        setUpData();
        setUpAdapter();
        gatherData();

        return view;

    }

    private void setUpData() {
        mRosterPlayersData = new RosterPlayersData();
    }

    private void setUpAdapter() {
        mPlayersAdapter = new PlayersAdapter(mContext,mRosterPlayersData);
        mPlayersRecyclerView.setAdapter(mPlayersAdapter);
    }

    private void gatherData() {
        String loginInfo = getString(R.string.username) + ":" + getString(R.string.password);
        byte[] encodingByte = Base64.encode (loginInfo.getBytes(), Base64.DEFAULT);
        final String encoding = new String(encodingByte);

        String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
        String month = String.valueOf(Calendar.getInstance().get(Calendar.MONTH));
        String day = String.valueOf(Calendar.getInstance().get(Calendar.DATE));
        if(month.length() == 1)
            month = "0" + month;
        if(day.length() == 1) {
            day = "0" + day;
        }
        String date = String.valueOf(year) + String.valueOf(month) + String.valueOf(day);

        AndroidNetworking.get(getString(R.string.mysportsfeeds_url))
                .addPathParameter(getString(R.string.version_number), getString(R.string.mysportsfeeds_version))
                .addPathParameter(getString(R.string.season_name), year + "-" + getString(R.string.regular))
                .addPathParameter(getString(R.string.feeds),getString(R.string.feeds_roster_players))
                .addQueryParameter(getString(R.string.for_date), date)
                .addHeaders("Authorization", Credentials.basic(getString(R.string.username),getString(R.string.password)))
                .setPriority(Priority.LOW)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        try {
                            mRosterPlayersData = gson.fromJson(response, RosterPlayersData.class);
                            mPlayersAdapter.refreshWithData(mRosterPlayersData);
                        }catch(JsonSyntaxException e) {
                            Log.i("JSONSYNTAXException",e.getMessage());
                        }catch(JsonParseException e) {
                            Log.i("JsonParseException",e.getMessage());
                        }
                        //Log.i("tag-response",response.toString());
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.i("tag-error",anError.getMessage());
                    }
                });

    }

}
