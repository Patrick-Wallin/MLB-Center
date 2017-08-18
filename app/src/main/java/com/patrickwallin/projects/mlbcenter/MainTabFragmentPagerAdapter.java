package com.patrickwallin.projects.mlbcenter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.patrickwallin.projects.mlbcenter.fragment.AllTeamFragment;
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
    //private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    private final List<Boolean> mFragmentAllTeamList = new ArrayList<>();

    private final List<String> mFragmentMenuKey = new ArrayList<>();
    private final List<String> mFragmentMenuTitle = new ArrayList<>();

    private AllTeamFragment mAllTeamFragment;
    private TeamFragment mTeamFragment;

    private Context mContext;

    public MainTabFragmentPagerAdapter(FragmentManager fm, int numberOfTabs, Context context) {
        super(fm);
        mNumberOfTabs = numberOfTabs;
        mContext = context;
        for(int i = 0; i < mNumberOfTabs; i++) {
            mFragmentMenuKey.add("");
            mFragmentMenuTitle.add("");
            //mFragmentAllTeamList.add(false);
            //mFragmentTitleList.add("");
        }
    }

    @Override
    public Fragment getItem(int position) {
        Log.i(LOG_TAG,"position: " + String.valueOf(position));
        Log.i(LOG_TAG,mFragmentMenuTitle.get(position));
        return StandingsFragment.newInstance();
        /*
        if(mFragmentAllTeamList.get(position) == true) {
            return AllTeamFragment.newInstance(mFragmentTitleList.get(position));
        }else {
            mTeamFragment = new TeamFragment();
            mAllTeamFragment = null;
            return mTeamFragment;
        }
        */
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
