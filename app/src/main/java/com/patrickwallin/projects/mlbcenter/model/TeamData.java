package com.patrickwallin.projects.mlbcenter.model;

import org.parceler.Parcel;

/**
 * Created by piwal on 8/16/2017.
 */

@Parcel
public class TeamData {
    String mImageFileName;
    String mTeamName;
    String mTeamRecord;
    String mTeamLatestScore;

    public TeamData() {}

    public TeamData(String imageFileName, String teamName, String teamRecord, String teamLatestScore) {
        mImageFileName = imageFileName;
        mTeamName = teamName;
        mTeamRecord = teamRecord;
        mTeamLatestScore = teamLatestScore;
    }

    public String getImageFileName() { return mImageFileName; }
    public void setImageFileName(String imageFileName) { mImageFileName = imageFileName; }

    public String getTeamName() { return mTeamName; }
    public void setTeamName(String teamName) { mTeamName = teamName; }

    public String getTeamRecord() { return mTeamRecord; }
    public void setTeamRecord(String teamRecord) { mTeamRecord = teamRecord; }

    public String getTeamLatestScore() { return mTeamLatestScore; }
    public void setTeamLatestScore(String teamLatestScore) { mTeamLatestScore = teamLatestScore; }
}
