package com.patrickwallin.projects.mlbcenter.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
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
import com.patrickwallin.projects.mlbcenter.adapter.PlayersStatisticsAdapter;
import com.patrickwallin.projects.mlbcenter.adapter.ScoresAdapter;
import com.patrickwallin.projects.mlbcenter.gsonmodel.CumulativePlayersStatsData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.ScoresData;
import com.patrickwallin.projects.mlbcenter.utilities.DividerItemDecoration;

import java.util.Calendar;
import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Credentials;

/**
 * Created by piwal on 8/21/2017.
 */

public class PlayersStatisticsFragment extends Fragment {
    @BindView(R.id.players_statistics_recycler_view)
    RecyclerView mPlayersStatisticsRecyclerView;

    private Context mContext;
    private HashMap<String,CumulativePlayersStatsData> mCumulativePlayersStatsDataList;
    //private CumulativePlayersStatsData mCumulativePlayersStatsData;
    private PlayersStatisticsAdapter mPlayersStatisticsAdapter;

    public static PlayersStatisticsFragment newInstance() {
        PlayersStatisticsFragment playersStatisticsFragment = new PlayersStatisticsFragment();
        return playersStatisticsFragment;
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
        View view = inflater.inflate(R.layout.players_statistics_fragment,container,false);

        ButterKnife.bind(this,view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        mPlayersStatisticsRecyclerView.setLayoutManager(linearLayoutManager);
        mPlayersStatisticsRecyclerView.setHasFixedSize(true);

        Drawable dividerDrawable = ContextCompat.getDrawable(mContext, R.drawable.divider_line);

        RecyclerView.ItemDecoration dividerItemDecoration = new DividerItemDecoration(dividerDrawable);
        mPlayersStatisticsRecyclerView.addItemDecoration(dividerItemDecoration);

        setUpData();
        setUpAdapter();
        gatherData();

        return view;
    }

    private void setUpData() {
        mCumulativePlayersStatsDataList = new HashMap<>();
    }

    private void setUpAdapter() {
        mPlayersStatisticsAdapter = new PlayersStatisticsAdapter(mContext,mCumulativePlayersStatsDataList);
        mPlayersStatisticsRecyclerView.setAdapter(mPlayersStatisticsAdapter);
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

        gatherBattingAverage(year);
        gatherHomeruns(year);
    }

    private void gatherBattingAverage(final String year) {
        AndroidNetworking.get(getString(R.string.mysportsfeeds_url))
                .addPathParameter(getString(R.string.version_number), getString(R.string.mysportsfeeds_version))
                .addPathParameter(getString(R.string.season_name), year + "-" + getString(R.string.regular))
                .addPathParameter(getString(R.string.feeds),getString(R.string.feeds_cumulative_player_stats_batting_average))
                .addHeaders("Authorization", Credentials.basic(getString(R.string.username),getString(R.string.password)))
                .setPriority(Priority.LOW)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        try {
                            mCumulativePlayersStatsDataList.put(getString(R.string.AVG),gson.fromJson(response, CumulativePlayersStatsData.class));
                            //gatherHomeruns(year);
                            mPlayersStatisticsAdapter.refreshWithData(mCumulativePlayersStatsDataList);
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

    private void gatherHomeruns(String year) {
        AndroidNetworking.get(getString(R.string.mysportsfeeds_url))
                .addPathParameter(getString(R.string.version_number), getString(R.string.mysportsfeeds_version))
                .addPathParameter(getString(R.string.season_name), year + "-" + getString(R.string.regular))
                .addPathParameter(getString(R.string.feeds),getString(R.string.feeds_cumulative_player_stats_homeruns))
                .addHeaders("Authorization", Credentials.basic(getString(R.string.username),getString(R.string.password)))
                .setPriority(Priority.LOW)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        try {
                            mCumulativePlayersStatsDataList.put(getString(R.string.HR),gson.fromJson(response, CumulativePlayersStatsData.class));
                            mPlayersStatisticsAdapter.refreshWithData(mCumulativePlayersStatsDataList);
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
