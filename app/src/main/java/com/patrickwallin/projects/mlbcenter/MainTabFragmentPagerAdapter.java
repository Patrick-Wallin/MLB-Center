package com.patrickwallin.projects.mlbcenter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.patrickwallin.projects.mlbcenter.fragment.AllTeamFragment;
import com.patrickwallin.projects.mlbcenter.fragment.PlayersFragment;
import com.patrickwallin.projects.mlbcenter.fragment.PlayersStatisticsFragment;
import com.patrickwallin.projects.mlbcenter.fragment.ScoresFragment;
import com.patrickwallin.projects.mlbcenter.fragment.StandingsFragment;
import com.patrickwallin.projects.mlbcenter.fragment.TeamFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piwal on 8/15/2017.
 */

public class MainTabFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private static final String LOG_TAG = MainTabFragmentPagerAdapter.class.getName();

    private int mNumberOfTabs;

    private final List<String> mFragmentMenuKey = new ArrayList<>();
    private final List<String> mFragmentMenuTitle = new ArrayList<>();

    private Context mContext;

    public MainTabFragmentPagerAdapter(FragmentManager fm, int numberOfTabs, Context context) {
        super(fm);
        mNumberOfTabs = numberOfTabs;
        mContext = context;
        for(int i = 0; i < mNumberOfTabs; i++) {
            mFragmentMenuKey.add("");
            mFragmentMenuTitle.add("");
        }
    }

    @Override
    public Fragment getItem(int position) {
        if(mFragmentMenuKey.get(position).equalsIgnoreCase("scores"))
            return ScoresFragment.newInstance();
        else {
            if(mFragmentMenuKey.get(position).equalsIgnoreCase("statistics"))
                return PlayersStatisticsFragment.newInstance();
            else {
                if(mFragmentMenuKey.get(position).equalsIgnoreCase("players")) {
                    return PlayersFragment.newInstance();
                }else {
                    return StandingsFragment.newInstance();
                }

            }

        }

        //Log.i(LOG_TAG,"position: " + String.valueOf(position));
        //Log.i(LOG_TAG,mFragmentMenuTitle.get(position));
        //return StandingsFragment.newInstance();
    }

    @Override
    public int getCount() {
        return mNumberOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentMenuTitle.get(position);
    }

    /*
    public void setInfoBasedOnTabPosition(int position, boolean allTeam, String title) {
        mFragmentAllTeamList.set(position,allTeam);
        mFragmentTitleList.set(position,title);
    }
    */

    public void setInfoBasedOnTabPosition(int position, String key, String title) {
        mFragmentMenuKey.set(position,key);
        mFragmentMenuTitle.set(position,title);
    }

    /*
    public void addFrag(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    */
}
