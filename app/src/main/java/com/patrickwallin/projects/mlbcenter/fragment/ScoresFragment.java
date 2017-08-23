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
import com.patrickwallin.projects.mlbcenter.adapter.DivisionStandingsAdapter;
import com.patrickwallin.projects.mlbcenter.adapter.ScoresAdapter;
import com.patrickwallin.projects.mlbcenter.gsonmodel.FullDivisionTeamStandingsJSONData;
import com.patrickwallin.projects.mlbcenter.gsonmodel.ScoresData;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Credentials;

/**
 * Created by piwal on 8/21/2017.
 */

public class ScoresFragment extends Fragment {
    @BindView(R.id.scores_recycler_view)
    RecyclerView mScoresRecyclerView;
    @BindView(R.id.scores_date_text_view)
    TextView mScoresDateTextView;

    private Context mContext;
    private ScoresData mScoreData;
    private ScoresAdapter mScoresAdapter;

    public static ScoresFragment newInstance() {
        ScoresFragment scoresFragment = new ScoresFragment();
        //Bundle args = new Bundle();
        //args.putString("teamAbbreviation", teamAbbreviation);
        //allTeamFragment.setArguments(args);
        return scoresFragment;
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
        View view = inflater.inflate(R.layout.scores_fragment,container,false);

        ButterKnife.bind(this,view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
        mScoresRecyclerView.setLayoutManager(linearLayoutManager);
        mScoresRecyclerView.setHasFixedSize(true);

        setUpData();
        setUpAdapter();
        gatherData();

        return view;
    }

    private void setUpData() {
        mScoreData = new ScoresData();
    }

    private void setUpAdapter() {
        mScoresAdapter = new ScoresAdapter(mContext,mScoreData);
        mScoresRecyclerView.setAdapter(mScoresAdapter);
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
                .addPathParameter(getString(R.string.feeds),getString(R.string.feeds_scoreboard))
                .addQueryParameter(getString(R.string.for_date), date)
                .addHeaders("Authorization", Credentials.basic(getString(R.string.username),getString(R.string.password)))
                .setPriority(Priority.LOW)
                .build()
                .getAsString(new StringRequestListener() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        try {
                            mScoreData = gson.fromJson(response, ScoresData.class);
                            mScoresAdapter.refreshWithNewData(mScoreData);
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
