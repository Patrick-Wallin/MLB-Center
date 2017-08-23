package com.patrickwallin.projects.mlbcenter.gsonmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by piwal on 8/22/2017.
 */

public class PlayersStatsJSONData {
    @SerializedName("GamesPlayed")
    @Expose
    private GamesPlayedJSONData gamesPlayed;
    @SerializedName("AtBats")
    @Expose
    private BasicStatsInfoJSONData atBats;
    @SerializedName("Runs")
    @Expose
    private BasicStatsInfoJSONData runs;
    @SerializedName("Hits")
    @Expose
    private BasicStatsInfoJSONData hits;
    @SerializedName("SecondBaseHits")
    @Expose
    private BasicStatsInfoJSONData secondBaseHits;
    @SerializedName("ThirdBaseHits")
    @Expose
    private BasicStatsInfoJSONData thirdBaseHits;
    @SerializedName("Homeruns")
    @Expose
    private BasicStatsInfoJSONData homeruns;
    @SerializedName("EarnedRuns")
    @Expose
    private BasicStatsInfoJSONData earnedRuns;
    @SerializedName("UnearnedRuns")
    @Expose
    private BasicStatsInfoJSONData unearnedRuns;
    @SerializedName("RunsBattedIn")
    @Expose
    private BasicStatsInfoJSONData runsBattedIn;
    @SerializedName("BatterWalks")
    @Expose
    private BasicStatsInfoJSONData batterWalks;
    @SerializedName("BatterSwings")
    @Expose
    private BasicStatsInfoJSONData batterSwings;
    @SerializedName("BatterStrikes")
    @Expose
    private BasicStatsInfoJSONData batterStrikes;
    @SerializedName("BatterStrikesFoul")
    @Expose
    private BasicStatsInfoJSONData batterStrikesFoul;
    @SerializedName("BatterStrikesMiss")
    @Expose
    private BasicStatsInfoJSONData batterStrikesMiss;
    @SerializedName("BatterStrikesLooking")
    @Expose
    private BasicStatsInfoJSONData batterStrikesLooking;
    @SerializedName("BatterTagOuts")
    @Expose
    private BasicStatsInfoJSONData batterTagOuts;
    @SerializedName("BatterForceOuts")
    @Expose
    private BasicStatsInfoJSONData batterForceOuts;
    @SerializedName("BatterPutOuts")
    @Expose
    private BasicStatsInfoJSONData batterPutOuts;
    @SerializedName("BatterGroundBalls")
    @Expose
    private BasicStatsInfoJSONData batterGroundBalls;
    @SerializedName("BatterFlyBalls")
    @Expose
    private BasicStatsInfoJSONData batterFlyBalls;
    @SerializedName("BatterLineDrives")
    @Expose
    private BasicStatsInfoJSONData batterLineDrives;
    @SerializedName("Batter2SeamFastballs")
    @Expose
    private BasicStatsInfoJSONData batter2SeamFastballs;
    @SerializedName("Batter4SeamFastballs")
    @Expose
    private BasicStatsInfoJSONData batter4SeamFastballs;
    @SerializedName("BatterCurveballs")
    @Expose
    private BasicStatsInfoJSONData batterCurveballs;
    @SerializedName("BatterChangeups")
    @Expose
    private BasicStatsInfoJSONData batterChangeups;
    @SerializedName("BatterCutters")
    @Expose
    private BasicStatsInfoJSONData batterCutters;
    @SerializedName("BatterSliders")
    @Expose
    private BasicStatsInfoJSONData batterSliders;
    @SerializedName("BatterSinkers")
    @Expose
    private BasicStatsInfoJSONData batterSinkers;
    @SerializedName("BatterSplitters")
    @Expose
    private BasicStatsInfoJSONData batterSplitters;
    @SerializedName("BatterStrikeouts")
    @Expose
    private BasicStatsInfoJSONData batterStrikeouts;
    @SerializedName("StolenBases")
    @Expose
    private BasicStatsInfoJSONData stolenBases;
    @SerializedName("CaughtBaseSteals")
    @Expose
    private BasicStatsInfoJSONData caughtBaseSteals;
    @SerializedName("BatterStolenBasePct")
    @Expose
    private BasicStatsInfoJSONData batterStolenBasePct;
    @SerializedName("BattingAvg")
    @Expose
    private BasicStatsInfoJSONData battingAvg;
    @SerializedName("BatterOnBasePct")
    @Expose
    private BasicStatsInfoJSONData batterOnBasePct;
    @SerializedName("BatterSluggingPct")
    @Expose
    private BasicStatsInfoJSONData batterSluggingPct;
    @SerializedName("BatterOnBasePlusSluggingPct")
    @Expose
    private BasicStatsInfoJSONData batterOnBasePlusSluggingPct;
    @SerializedName("BatterIntentionalWalks")
    @Expose
    private BasicStatsInfoJSONData batterIntentionalWalks;
    @SerializedName("HitByPitch")
    @Expose
    private BasicStatsInfoJSONData hitByPitch;
    @SerializedName("BatterSacrificeBunts")
    @Expose
    private BasicStatsInfoJSONData batterSacrificeBunts;
    @SerializedName("BatterSacrificeFlies")
    @Expose
    private BasicStatsInfoJSONData batterSacrificeFlies;
    @SerializedName("TotalBases")
    @Expose
    private BasicStatsInfoJSONData totalBases;
    @SerializedName("ExtraBaseHits")
    @Expose
    private BasicStatsInfoJSONData extraBaseHits;
    @SerializedName("BatterDoublePlays")
    @Expose
    private BasicStatsInfoJSONData batterDoublePlays;
    @SerializedName("BatterTriplePlays")
    @Expose
    private BasicStatsInfoJSONData batterTriplePlays;
    @SerializedName("BatterGroundOuts")
    @Expose
    private BasicStatsInfoJSONData batterGroundOuts;
    @SerializedName("BatterFlyOuts")
    @Expose
    private BasicStatsInfoJSONData batterFlyOuts;
    @SerializedName("BatterGroundOutToFlyOutRatio")
    @Expose
    private BasicStatsInfoJSONData batterGroundOutToFlyOutRatio;
    @SerializedName("PitchesFaced")
    @Expose
    private BasicStatsInfoJSONData pitchesFaced;
    @SerializedName("PlateAppearances")
    @Expose
    private BasicStatsInfoJSONData plateAppearances;
    @SerializedName("LeftOnBase")
    @Expose
    private BasicStatsInfoJSONData leftOnBase;
    @SerializedName("Wins")
    @Expose
    private BasicStatsInfoJSONData wins;
    @SerializedName("Losses")
    @Expose
    private BasicStatsInfoJSONData losses;
    @SerializedName("EarnedRunAvg")
    @Expose
    private BasicStatsInfoJSONData earnedRunAvg;
    @SerializedName("Saves")
    @Expose
    private BasicStatsInfoJSONData saves;
    @SerializedName("SaveOpportunities")
    @Expose
    private BasicStatsInfoJSONData saveOpportunities;
    @SerializedName("InningsPitched")
    @Expose
    private BasicStatsInfoJSONData inningsPitched;
    @SerializedName("HitsAllowed")
    @Expose
    private BasicStatsInfoJSONData hitsAllowed;
    @SerializedName("SecondBaseHitsAllowed")
    @Expose
    private BasicStatsInfoJSONData secondBaseHitsAllowed;
    @SerializedName("ThirdBaseHitsAllowed")
    @Expose
    private BasicStatsInfoJSONData thirdBaseHitsAllowed;
    @SerializedName("RunsAllowed")
    @Expose
    private BasicStatsInfoJSONData runsAllowed;
    @SerializedName("EarnedRunsAllowed")
    @Expose
    private BasicStatsInfoJSONData earnedRunsAllowed;
    @SerializedName("HomerunsAllowed")
    @Expose
    private BasicStatsInfoJSONData homerunsAllowed;
    @SerializedName("PitcherWalks")
    @Expose
    private BasicStatsInfoJSONData pitcherWalks;
    @SerializedName("PitcherSwings")
    @Expose
    private BasicStatsInfoJSONData pitcherSwings;
    @SerializedName("PitcherStrikes")
    @Expose
    private BasicStatsInfoJSONData pitcherStrikes;
    @SerializedName("PitcherStrikesFoul")
    @Expose
    private BasicStatsInfoJSONData pitcherStrikesFoul;
    @SerializedName("PitcherStrikesMiss")
    @Expose
    private BasicStatsInfoJSONData pitcherStrikesMiss;
    @SerializedName("PitcherStrikesLooking")
    @Expose
    private BasicStatsInfoJSONData pitcherStrikesLooking;
    @SerializedName("PitcherGroundBalls")
    @Expose
    private BasicStatsInfoJSONData pitcherGroundBalls;
    @SerializedName("PitcherFlyBalls")
    @Expose
    private BasicStatsInfoJSONData pitcherFlyBalls;
    @SerializedName("PitcherLineDrives")
    @Expose
    private BasicStatsInfoJSONData pitcherLineDrives;
    @SerializedName("Pitcher2SeamFastballs")
    @Expose
    private BasicStatsInfoJSONData pitcher2SeamFastballs;
    @SerializedName("Pitcher4SeamFastballs")
    @Expose
    private BasicStatsInfoJSONData pitcher4SeamFastballs;
    @SerializedName("PitcherCurveballs")
    @Expose
    private BasicStatsInfoJSONData pitcherCurveballs;
    @SerializedName("PitcherChangeups")
    @Expose
    private BasicStatsInfoJSONData pitcherChangeups;
    @SerializedName("PitcherCutters")
    @Expose
    private BasicStatsInfoJSONData pitcherCutters;
    @SerializedName("PitcherSliders")
    @Expose
    private BasicStatsInfoJSONData pitcherSliders;
    @SerializedName("PitcherSinkers")
    @Expose
    private BasicStatsInfoJSONData pitcherSinkers;
    @SerializedName("PitcherSplitters")
    @Expose
    private BasicStatsInfoJSONData pitcherSplitters;
    @SerializedName("PitcherSacrificeBunts")
    @Expose
    private BasicStatsInfoJSONData pitcherSacrificeBunts;
    @SerializedName("PitcherSacrificeFlies")
    @Expose
    private BasicStatsInfoJSONData pitcherSacrificeFlies;
    @SerializedName("PitcherStrikeouts")
    @Expose
    private BasicStatsInfoJSONData pitcherStrikeouts;
    @SerializedName("PitchingAvg")
    @Expose
    private BasicStatsInfoJSONData pitchingAvg;
    @SerializedName("WalksAndHitsPerInningPitched")
    @Expose
    private BasicStatsInfoJSONData walksAndHitsPerInningPitched;
    @SerializedName("CompletedGames")
    @Expose
    private BasicStatsInfoJSONData completedGames;
    @SerializedName("Shutouts")
    @Expose
    private BasicStatsInfoJSONData shutouts;
    @SerializedName("BattersHit")
    @Expose
    private BasicStatsInfoJSONData battersHit;
    @SerializedName("PitcherIntentionalWalks")
    @Expose
    private BasicStatsInfoJSONData pitcherIntentionalWalks;
    @SerializedName("GamesFinished")
    @Expose
    private BasicStatsInfoJSONData gamesFinished;
    @SerializedName("Holds")
    @Expose
    private BasicStatsInfoJSONData holds;
    @SerializedName("PitcherDoublePlays")
    @Expose
    private BasicStatsInfoJSONData pitcherDoublePlays;
    @SerializedName("PitcherTriplePlays")
    @Expose
    private BasicStatsInfoJSONData pitcherTriplePlays;
    @SerializedName("PitcherGroundOuts")
    @Expose
    private BasicStatsInfoJSONData pitcherGroundOuts;
    @SerializedName("PitcherFlyOuts")
    @Expose
    private BasicStatsInfoJSONData pitcherFlyOuts;
    @SerializedName("PitcherWildPitches")
    @Expose
    private BasicStatsInfoJSONData pitcherWildPitches;
    @SerializedName("Balks")
    @Expose
    private BasicStatsInfoJSONData balks;
    @SerializedName("PitcherStolenBasesAllowed")
    @Expose
    private BasicStatsInfoJSONData pitcherStolenBasesAllowed;
    @SerializedName("PitcherCaughtStealing")
    @Expose
    private BasicStatsInfoJSONData pitcherCaughtStealing;
    @SerializedName("PickoffAttempts")
    @Expose
    private BasicStatsInfoJSONData pickoffAttempts;
    @SerializedName("Pickoffs")
    @Expose
    private BasicStatsInfoJSONData pickoffs;
    @SerializedName("TotalBattersFaced")
    @Expose
    private BasicStatsInfoJSONData totalBattersFaced;
    @SerializedName("PitchesThrown")
    @Expose
    private BasicStatsInfoJSONData pitchesThrown;
    @SerializedName("WinPct")
    @Expose
    private BasicStatsInfoJSONData winPct;
    @SerializedName("PitcherGroundOutToFlyOutRatio")
    @Expose
    private BasicStatsInfoJSONData pitcherGroundOutToFlyOutRatio;
    @SerializedName("PitcherOnBasePct")
    @Expose
    private BasicStatsInfoJSONData pitcherOnBasePct;
    @SerializedName("PitcherSluggingPct")
    @Expose
    private BasicStatsInfoJSONData pitcherSluggingPct;
    @SerializedName("PitcherOnBasePlusSluggingPct")
    @Expose
    private BasicStatsInfoJSONData pitcherOnBasePlusSluggingPct;
    @SerializedName("StrikeoutsPer9Innings")
    @Expose
    private BasicStatsInfoJSONData strikeoutsPer9Innings;
    @SerializedName("WalksAllowedPer9Innings")
    @Expose
    private BasicStatsInfoJSONData walksAllowedPer9Innings;
    @SerializedName("HitsAllowedPer9Innings")
    @Expose
    private BasicStatsInfoJSONData hitsAllowedPer9Innings;
    @SerializedName("StrikeoutsToWalksRatio")
    @Expose
    private BasicStatsInfoJSONData strikeoutsToWalksRatio;
    @SerializedName("PitchesPerInning")
    @Expose
    private BasicStatsInfoJSONData pitchesPerInning;
    @SerializedName("PitcherAtBats")
    @Expose
    private BasicStatsInfoJSONData pitcherAtBats;
    @SerializedName("InningsPlayed")
    @Expose
    private BasicStatsInfoJSONData inningsPlayed;
    @SerializedName("TotalChances")
    @Expose
    private BasicStatsInfoJSONData totalChances;
    @SerializedName("FielderTagOuts")
    @Expose
    private BasicStatsInfoJSONData fielderTagOuts;
    @SerializedName("FielderForceOuts")
    @Expose
    private BasicStatsInfoJSONData fielderForceOuts;
    @SerializedName("FielderPutOuts")
    @Expose
    private BasicStatsInfoJSONData fielderPutOuts;
    @SerializedName("OutsFaced")
    @Expose
    private BasicStatsInfoJSONData outsFaced;
    @SerializedName("Assists")
    @Expose
    private BasicStatsInfoJSONData assists;
    @SerializedName("Errors")
    @Expose
    private BasicStatsInfoJSONData errors;
    @SerializedName("FielderDoublePlays")
    @Expose
    private BasicStatsInfoJSONData fielderDoublePlays;
    @SerializedName("FielderTriplePlays")
    @Expose
    private BasicStatsInfoJSONData fielderTriplePlays;
    @SerializedName("FielderStolenBasesAllowed")
    @Expose
    private BasicStatsInfoJSONData fielderStolenBasesAllowed;
    @SerializedName("FielderCaughtStealing")
    @Expose
    private BasicStatsInfoJSONData fielderCaughtStealing;
    @SerializedName("FielderStolenBasePct")
    @Expose
    private BasicStatsInfoJSONData fielderStolenBasePct;
    @SerializedName("PassedBalls")
    @Expose
    private BasicStatsInfoJSONData passedBalls;
    @SerializedName("FielderWildPitches")
    @Expose
    private BasicStatsInfoJSONData fielderWildPitches;
    @SerializedName("FieldingPct")
    @Expose
    private BasicStatsInfoJSONData fieldingPct;
    @SerializedName("RangeFactor")
    @Expose
    private BasicStatsInfoJSONData rangeFactor;
    @SerializedName("GamesStarted")
    @Expose
    private BasicStatsInfoJSONData gamesStarted;

    public GamesPlayedJSONData getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(GamesPlayedJSONData gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public BasicStatsInfoJSONData getAtBats() {
        return atBats;
    }

    public void setAtBats(BasicStatsInfoJSONData atBats) {
        this.atBats = atBats;
    }

    public BasicStatsInfoJSONData getRuns() {
        return runs;
    }

    public void setRuns(BasicStatsInfoJSONData runs) {
        this.runs = runs;
    }

    public BasicStatsInfoJSONData getHits() {
        return hits;
    }

    public void setHits(BasicStatsInfoJSONData hits) {
        this.hits = hits;
    }

    public BasicStatsInfoJSONData getSecondBaseHits() {
        return secondBaseHits;
    }

    public void setSecondBaseHits(BasicStatsInfoJSONData secondBaseHits) {
        this.secondBaseHits = secondBaseHits;
    }

    public BasicStatsInfoJSONData getThirdBaseHits() {
        return thirdBaseHits;
    }

    public void setThirdBaseHits(BasicStatsInfoJSONData thirdBaseHits) {
        this.thirdBaseHits = thirdBaseHits;
    }

    public BasicStatsInfoJSONData getHomeruns() {
        return homeruns;
    }

    public void setHomeruns(BasicStatsInfoJSONData homeruns) {
        this.homeruns = homeruns;
    }

    public BasicStatsInfoJSONData getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(BasicStatsInfoJSONData earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public BasicStatsInfoJSONData getUnearnedRuns() {
        return unearnedRuns;
    }

    public void setUnearnedRuns(BasicStatsInfoJSONData unearnedRuns) {
        this.unearnedRuns = unearnedRuns;
    }

    public BasicStatsInfoJSONData getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(BasicStatsInfoJSONData runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public BasicStatsInfoJSONData getBatterWalks() {
        return batterWalks;
    }

    public void setBatterWalks(BasicStatsInfoJSONData batterWalks) {
        this.batterWalks = batterWalks;
    }

    public BasicStatsInfoJSONData getBatterSwings() {
        return batterSwings;
    }

    public void setBatterSwings(BasicStatsInfoJSONData batterSwings) {
        this.batterSwings = batterSwings;
    }

    public BasicStatsInfoJSONData getBatterStrikes() {
        return batterStrikes;
    }

    public void setBatterStrikes(BasicStatsInfoJSONData batterStrikes) {
        this.batterStrikes = batterStrikes;
    }

    public BasicStatsInfoJSONData getBatterStrikesFoul() {
        return batterStrikesFoul;
    }

    public void setBatterStrikesFoul(BasicStatsInfoJSONData batterStrikesFoul) {
        this.batterStrikesFoul = batterStrikesFoul;
    }

    public BasicStatsInfoJSONData getBatterStrikesMiss() {
        return batterStrikesMiss;
    }

    public void setBatterStrikesMiss(BasicStatsInfoJSONData batterStrikesMiss) {
        this.batterStrikesMiss = batterStrikesMiss;
    }

    public BasicStatsInfoJSONData getBatterStrikesLooking() {
        return batterStrikesLooking;
    }

    public void setBatterStrikesLooking(BasicStatsInfoJSONData batterStrikesLooking) {
        this.batterStrikesLooking = batterStrikesLooking;
    }

    public BasicStatsInfoJSONData getBatterTagOuts() {
        return batterTagOuts;
    }

    public void setBatterTagOuts(BasicStatsInfoJSONData batterTagOuts) {
        this.batterTagOuts = batterTagOuts;
    }

    public BasicStatsInfoJSONData getBatterForceOuts() {
        return batterForceOuts;
    }

    public void setBatterForceOuts(BasicStatsInfoJSONData batterForceOuts) {
        this.batterForceOuts = batterForceOuts;
    }

    public BasicStatsInfoJSONData getBatterPutOuts() {
        return batterPutOuts;
    }

    public void setBatterPutOuts(BasicStatsInfoJSONData batterPutOuts) {
        this.batterPutOuts = batterPutOuts;
    }

    public BasicStatsInfoJSONData getBatterGroundBalls() {
        return batterGroundBalls;
    }

    public void setBatterGroundBalls(BasicStatsInfoJSONData batterGroundBalls) {
        this.batterGroundBalls = batterGroundBalls;
    }

    public BasicStatsInfoJSONData getBatterFlyBalls() {
        return batterFlyBalls;
    }

    public void setBatterFlyBalls(BasicStatsInfoJSONData batterFlyBalls) {
        this.batterFlyBalls = batterFlyBalls;
    }

    public BasicStatsInfoJSONData getBatterLineDrives() {
        return batterLineDrives;
    }

    public void setBatterLineDrives(BasicStatsInfoJSONData batterLineDrives) {
        this.batterLineDrives = batterLineDrives;
    }

    public BasicStatsInfoJSONData getBatter2SeamFastballs() {
        return batter2SeamFastballs;
    }

    public void setBatter2SeamFastballs(BasicStatsInfoJSONData batter2SeamFastballs) {
        this.batter2SeamFastballs = batter2SeamFastballs;
    }

    public BasicStatsInfoJSONData getBatter4SeamFastballs() {
        return batter4SeamFastballs;
    }

    public void setBatter4SeamFastballs(BasicStatsInfoJSONData batter4SeamFastballs) {
        this.batter4SeamFastballs = batter4SeamFastballs;
    }

    public BasicStatsInfoJSONData getBatterCurveballs() {
        return batterCurveballs;
    }

    public void setBatterCurveballs(BasicStatsInfoJSONData batterCurveballs) {
        this.batterCurveballs = batterCurveballs;
    }

    public BasicStatsInfoJSONData getBatterChangeups() {
        return batterChangeups;
    }

    public void setBatterChangeups(BasicStatsInfoJSONData batterChangeups) {
        this.batterChangeups = batterChangeups;
    }

    public BasicStatsInfoJSONData getBatterCutters() {
        return batterCutters;
    }

    public void setBatterCutters(BasicStatsInfoJSONData batterCutters) {
        this.batterCutters = batterCutters;
    }

    public BasicStatsInfoJSONData getBatterSliders() {
        return batterSliders;
    }

    public void setBatterSliders(BasicStatsInfoJSONData batterSliders) {
        this.batterSliders = batterSliders;
    }

    public BasicStatsInfoJSONData getBatterSinkers() {
        return batterSinkers;
    }

    public void setBatterSinkers(BasicStatsInfoJSONData batterSinkers) {
        this.batterSinkers = batterSinkers;
    }

    public BasicStatsInfoJSONData getBatterSplitters() {
        return batterSplitters;
    }

    public void setBatterSplitters(BasicStatsInfoJSONData batterSplitters) {
        this.batterSplitters = batterSplitters;
    }

    public BasicStatsInfoJSONData getBatterStrikeouts() {
        return batterStrikeouts;
    }

    public void setBatterStrikeouts(BasicStatsInfoJSONData batterStrikeouts) {
        this.batterStrikeouts = batterStrikeouts;
    }

    public BasicStatsInfoJSONData getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(BasicStatsInfoJSONData stolenBases) {
        this.stolenBases = stolenBases;
    }

    public BasicStatsInfoJSONData getCaughtBaseSteals() {
        return caughtBaseSteals;
    }

    public void setCaughtBaseSteals(BasicStatsInfoJSONData caughtBaseSteals) {
        this.caughtBaseSteals = caughtBaseSteals;
    }

    public BasicStatsInfoJSONData getBatterStolenBasePct() {
        return batterStolenBasePct;
    }

    public void setBatterStolenBasePct(BasicStatsInfoJSONData batterStolenBasePct) {
        this.batterStolenBasePct = batterStolenBasePct;
    }

    public BasicStatsInfoJSONData getBattingAvg() {
        return battingAvg;
    }

    public void setBattingAvg(BasicStatsInfoJSONData battingAvg) {
        this.battingAvg = battingAvg;
    }

    public BasicStatsInfoJSONData getBatterOnBasePct() {
        return batterOnBasePct;
    }

    public void setBatterOnBasePct(BasicStatsInfoJSONData batterOnBasePct) {
        this.batterOnBasePct = batterOnBasePct;
    }

    public BasicStatsInfoJSONData getBatterSluggingPct() {
        return batterSluggingPct;
    }

    public void setBatterSluggingPct(BasicStatsInfoJSONData batterSluggingPct) {
        this.batterSluggingPct = batterSluggingPct;
    }

    public BasicStatsInfoJSONData getBatterOnBasePlusSluggingPct() {
        return batterOnBasePlusSluggingPct;
    }

    public void setBatterOnBasePlusSluggingPct(BasicStatsInfoJSONData batterOnBasePlusSluggingPct) {
        this.batterOnBasePlusSluggingPct = batterOnBasePlusSluggingPct;
    }

    public BasicStatsInfoJSONData getBatterIntentionalWalks() {
        return batterIntentionalWalks;
    }

    public void setBatterIntentionalWalks(BasicStatsInfoJSONData batterIntentionalWalks) {
        this.batterIntentionalWalks = batterIntentionalWalks;
    }

    public BasicStatsInfoJSONData getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(BasicStatsInfoJSONData hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public BasicStatsInfoJSONData getBatterSacrificeBunts() {
        return batterSacrificeBunts;
    }

    public void setBatterSacrificeBunts(BasicStatsInfoJSONData batterSacrificeBunts) {
        this.batterSacrificeBunts = batterSacrificeBunts;
    }

    public BasicStatsInfoJSONData getBatterSacrificeFlies() {
        return batterSacrificeFlies;
    }

    public void setBatterSacrificeFlies(BasicStatsInfoJSONData batterSacrificeFlies) {
        this.batterSacrificeFlies = batterSacrificeFlies;
    }

    public BasicStatsInfoJSONData getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(BasicStatsInfoJSONData totalBases) {
        this.totalBases = totalBases;
    }

    public BasicStatsInfoJSONData getExtraBaseHits() {
        return extraBaseHits;
    }

    public void setExtraBaseHits(BasicStatsInfoJSONData extraBaseHits) {
        this.extraBaseHits = extraBaseHits;
    }

    public BasicStatsInfoJSONData getBatterDoublePlays() {
        return batterDoublePlays;
    }

    public void setBatterDoublePlays(BasicStatsInfoJSONData batterDoublePlays) {
        this.batterDoublePlays = batterDoublePlays;
    }

    public BasicStatsInfoJSONData getBatterTriplePlays() {
        return batterTriplePlays;
    }

    public void setBatterTriplePlays(BasicStatsInfoJSONData batterTriplePlays) {
        this.batterTriplePlays = batterTriplePlays;
    }

    public BasicStatsInfoJSONData getBatterGroundOuts() {
        return batterGroundOuts;
    }

    public void setBatterGroundOuts(BasicStatsInfoJSONData batterGroundOuts) {
        this.batterGroundOuts = batterGroundOuts;
    }

    public BasicStatsInfoJSONData getBatterFlyOuts() {
        return batterFlyOuts;
    }

    public void setBatterFlyOuts(BasicStatsInfoJSONData batterFlyOuts) {
        this.batterFlyOuts = batterFlyOuts;
    }

    public BasicStatsInfoJSONData getBatterGroundOutToFlyOutRatio() {
        return batterGroundOutToFlyOutRatio;
    }

    public void setBatterGroundOutToFlyOutRatio(BasicStatsInfoJSONData batterGroundOutToFlyOutRatio) {
        this.batterGroundOutToFlyOutRatio = batterGroundOutToFlyOutRatio;
    }

    public BasicStatsInfoJSONData getPitchesFaced() {
        return pitchesFaced;
    }

    public void setPitchesFaced(BasicStatsInfoJSONData pitchesFaced) {
        this.pitchesFaced = pitchesFaced;
    }

    public BasicStatsInfoJSONData getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(BasicStatsInfoJSONData plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    public BasicStatsInfoJSONData getLeftOnBase() {
        return leftOnBase;
    }

    public void setLeftOnBase(BasicStatsInfoJSONData leftOnBase) {
        this.leftOnBase = leftOnBase;
    }

    public BasicStatsInfoJSONData getWins() {
        return wins;
    }

    public void setWins(BasicStatsInfoJSONData wins) {
        this.wins = wins;
    }

    public BasicStatsInfoJSONData getLosses() {
        return losses;
    }

    public void setLosses(BasicStatsInfoJSONData losses) {
        this.losses = losses;
    }

    public BasicStatsInfoJSONData getEarnedRunAvg() {
        return earnedRunAvg;
    }

    public void setEarnedRunAvg(BasicStatsInfoJSONData earnedRunAvg) {
        this.earnedRunAvg = earnedRunAvg;
    }

    public BasicStatsInfoJSONData getSaves() {
        return saves;
    }

    public void setSaves(BasicStatsInfoJSONData saves) {
        this.saves = saves;
    }

    public BasicStatsInfoJSONData getSaveOpportunities() {
        return saveOpportunities;
    }

    public void setSaveOpportunities(BasicStatsInfoJSONData saveOpportunities) {
        this.saveOpportunities = saveOpportunities;
    }

    public BasicStatsInfoJSONData getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(BasicStatsInfoJSONData inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public BasicStatsInfoJSONData getHitsAllowed() {
        return hitsAllowed;
    }

    public void setHitsAllowed(BasicStatsInfoJSONData hitsAllowed) {
        this.hitsAllowed = hitsAllowed;
    }

    public BasicStatsInfoJSONData getSecondBaseHitsAllowed() {
        return secondBaseHitsAllowed;
    }

    public void setSecondBaseHitsAllowed(BasicStatsInfoJSONData secondBaseHitsAllowed) {
        this.secondBaseHitsAllowed = secondBaseHitsAllowed;
    }

    public BasicStatsInfoJSONData getThirdBaseHitsAllowed() {
        return thirdBaseHitsAllowed;
    }

    public void setThirdBaseHitsAllowed(BasicStatsInfoJSONData thirdBaseHitsAllowed) {
        this.thirdBaseHitsAllowed = thirdBaseHitsAllowed;
    }

    public BasicStatsInfoJSONData getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(BasicStatsInfoJSONData runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public BasicStatsInfoJSONData getEarnedRunsAllowed() {
        return earnedRunsAllowed;
    }

    public void setEarnedRunsAllowed(BasicStatsInfoJSONData earnedRunsAllowed) {
        this.earnedRunsAllowed = earnedRunsAllowed;
    }

    public BasicStatsInfoJSONData getHomerunsAllowed() {
        return homerunsAllowed;
    }

    public void setHomerunsAllowed(BasicStatsInfoJSONData homerunsAllowed) {
        this.homerunsAllowed = homerunsAllowed;
    }

    public BasicStatsInfoJSONData getPitcherWalks() {
        return pitcherWalks;
    }

    public void setPitcherWalks(BasicStatsInfoJSONData pitcherWalks) {
        this.pitcherWalks = pitcherWalks;
    }

    public BasicStatsInfoJSONData getPitcherSwings() {
        return pitcherSwings;
    }

    public void setPitcherSwings(BasicStatsInfoJSONData pitcherSwings) {
        this.pitcherSwings = pitcherSwings;
    }

    public BasicStatsInfoJSONData getPitcherStrikes() {
        return pitcherStrikes;
    }

    public void setPitcherStrikes(BasicStatsInfoJSONData pitcherStrikes) {
        this.pitcherStrikes = pitcherStrikes;
    }

    public BasicStatsInfoJSONData getPitcherStrikesFoul() {
        return pitcherStrikesFoul;
    }

    public void setPitcherStrikesFoul(BasicStatsInfoJSONData pitcherStrikesFoul) {
        this.pitcherStrikesFoul = pitcherStrikesFoul;
    }

    public BasicStatsInfoJSONData getPitcherStrikesMiss() {
        return pitcherStrikesMiss;
    }

    public void setPitcherStrikesMiss(BasicStatsInfoJSONData pitcherStrikesMiss) {
        this.pitcherStrikesMiss = pitcherStrikesMiss;
    }

    public BasicStatsInfoJSONData getPitcherStrikesLooking() {
        return pitcherStrikesLooking;
    }

    public void setPitcherStrikesLooking(BasicStatsInfoJSONData pitcherStrikesLooking) {
        this.pitcherStrikesLooking = pitcherStrikesLooking;
    }

    public BasicStatsInfoJSONData getPitcherGroundBalls() {
        return pitcherGroundBalls;
    }

    public void setPitcherGroundBalls(BasicStatsInfoJSONData pitcherGroundBalls) {
        this.pitcherGroundBalls = pitcherGroundBalls;
    }

    public BasicStatsInfoJSONData getPitcherFlyBalls() {
        return pitcherFlyBalls;
    }

    public void setPitcherFlyBalls(BasicStatsInfoJSONData pitcherFlyBalls) {
        this.pitcherFlyBalls = pitcherFlyBalls;
    }

    public BasicStatsInfoJSONData getPitcherLineDrives() {
        return pitcherLineDrives;
    }

    public void setPitcherLineDrives(BasicStatsInfoJSONData pitcherLineDrives) {
        this.pitcherLineDrives = pitcherLineDrives;
    }

    public BasicStatsInfoJSONData getPitcher2SeamFastballs() {
        return pitcher2SeamFastballs;
    }

    public void setPitcher2SeamFastballs(BasicStatsInfoJSONData pitcher2SeamFastballs) {
        this.pitcher2SeamFastballs = pitcher2SeamFastballs;
    }

    public BasicStatsInfoJSONData getPitcher4SeamFastballs() {
        return pitcher4SeamFastballs;
    }

    public void setPitcher4SeamFastballs(BasicStatsInfoJSONData pitcher4SeamFastballs) {
        this.pitcher4SeamFastballs = pitcher4SeamFastballs;
    }

    public BasicStatsInfoJSONData getPitcherCurveballs() {
        return pitcherCurveballs;
    }

    public void setPitcherCurveballs(BasicStatsInfoJSONData pitcherCurveballs) {
        this.pitcherCurveballs = pitcherCurveballs;
    }

    public BasicStatsInfoJSONData getPitcherChangeups() {
        return pitcherChangeups;
    }

    public void setPitcherChangeups(BasicStatsInfoJSONData pitcherChangeups) {
        this.pitcherChangeups = pitcherChangeups;
    }

    public BasicStatsInfoJSONData getPitcherCutters() {
        return pitcherCutters;
    }

    public void setPitcherCutters(BasicStatsInfoJSONData pitcherCutters) {
        this.pitcherCutters = pitcherCutters;
    }

    public BasicStatsInfoJSONData getPitcherSliders() {
        return pitcherSliders;
    }

    public void setPitcherSliders(BasicStatsInfoJSONData pitcherSliders) {
        this.pitcherSliders = pitcherSliders;
    }

    public BasicStatsInfoJSONData getPitcherSinkers() {
        return pitcherSinkers;
    }

    public void setPitcherSinkers(BasicStatsInfoJSONData pitcherSinkers) {
        this.pitcherSinkers = pitcherSinkers;
    }

    public BasicStatsInfoJSONData getPitcherSplitters() {
        return pitcherSplitters;
    }

    public void setPitcherSplitters(BasicStatsInfoJSONData pitcherSplitters) {
        this.pitcherSplitters = pitcherSplitters;
    }

    public BasicStatsInfoJSONData getPitcherSacrificeBunts() {
        return pitcherSacrificeBunts;
    }

    public void setPitcherSacrificeBunts(BasicStatsInfoJSONData pitcherSacrificeBunts) {
        this.pitcherSacrificeBunts = pitcherSacrificeBunts;
    }

    public BasicStatsInfoJSONData getPitcherSacrificeFlies() {
        return pitcherSacrificeFlies;
    }

    public void setPitcherSacrificeFlies(BasicStatsInfoJSONData pitcherSacrificeFlies) {
        this.pitcherSacrificeFlies = pitcherSacrificeFlies;
    }

    public BasicStatsInfoJSONData getPitcherStrikeouts() {
        return pitcherStrikeouts;
    }

    public void setPitcherStrikeouts(BasicStatsInfoJSONData pitcherStrikeouts) {
        this.pitcherStrikeouts = pitcherStrikeouts;
    }

    public BasicStatsInfoJSONData getPitchingAvg() {
        return pitchingAvg;
    }

    public void setPitchingAvg(BasicStatsInfoJSONData pitchingAvg) {
        this.pitchingAvg = pitchingAvg;
    }

    public BasicStatsInfoJSONData getWalksAndHitsPerInningPitched() {
        return walksAndHitsPerInningPitched;
    }

    public void setWalksAndHitsPerInningPitched(BasicStatsInfoJSONData walksAndHitsPerInningPitched) {
        this.walksAndHitsPerInningPitched = walksAndHitsPerInningPitched;
    }

    public BasicStatsInfoJSONData getCompletedGames() {
        return completedGames;
    }

    public void setCompletedGames(BasicStatsInfoJSONData completedGames) {
        this.completedGames = completedGames;
    }

    public BasicStatsInfoJSONData getShutouts() {
        return shutouts;
    }

    public void setShutouts(BasicStatsInfoJSONData shutouts) {
        this.shutouts = shutouts;
    }

    public BasicStatsInfoJSONData getBattersHit() {
        return battersHit;
    }

    public void setBattersHit(BasicStatsInfoJSONData battersHit) {
        this.battersHit = battersHit;
    }

    public BasicStatsInfoJSONData getPitcherIntentionalWalks() {
        return pitcherIntentionalWalks;
    }

    public void setPitcherIntentionalWalks(BasicStatsInfoJSONData pitcherIntentionalWalks) {
        this.pitcherIntentionalWalks = pitcherIntentionalWalks;
    }

    public BasicStatsInfoJSONData getGamesFinished() {
        return gamesFinished;
    }

    public void setGamesFinished(BasicStatsInfoJSONData gamesFinished) {
        this.gamesFinished = gamesFinished;
    }

    public BasicStatsInfoJSONData getHolds() {
        return holds;
    }

    public void setHolds(BasicStatsInfoJSONData holds) {
        this.holds = holds;
    }

    public BasicStatsInfoJSONData getPitcherDoublePlays() {
        return pitcherDoublePlays;
    }

    public void setPitcherDoublePlays(BasicStatsInfoJSONData pitcherDoublePlays) {
        this.pitcherDoublePlays = pitcherDoublePlays;
    }

    public BasicStatsInfoJSONData getPitcherTriplePlays() {
        return pitcherTriplePlays;
    }

    public void setPitcherTriplePlays(BasicStatsInfoJSONData pitcherTriplePlays) {
        this.pitcherTriplePlays = pitcherTriplePlays;
    }

    public BasicStatsInfoJSONData getPitcherGroundOuts() {
        return pitcherGroundOuts;
    }

    public void setPitcherGroundOuts(BasicStatsInfoJSONData pitcherGroundOuts) {
        this.pitcherGroundOuts = pitcherGroundOuts;
    }

    public BasicStatsInfoJSONData getPitcherFlyOuts() {
        return pitcherFlyOuts;
    }

    public void setPitcherFlyOuts(BasicStatsInfoJSONData pitcherFlyOuts) {
        this.pitcherFlyOuts = pitcherFlyOuts;
    }

    public BasicStatsInfoJSONData getPitcherWildPitches() {
        return pitcherWildPitches;
    }

    public void setPitcherWildPitches(BasicStatsInfoJSONData pitcherWildPitches) {
        this.pitcherWildPitches = pitcherWildPitches;
    }

    public BasicStatsInfoJSONData getBalks() {
        return balks;
    }

    public void setBalks(BasicStatsInfoJSONData balks) {
        this.balks = balks;
    }

    public BasicStatsInfoJSONData getPitcherStolenBasesAllowed() {
        return pitcherStolenBasesAllowed;
    }

    public void setPitcherStolenBasesAllowed(BasicStatsInfoJSONData pitcherStolenBasesAllowed) {
        this.pitcherStolenBasesAllowed = pitcherStolenBasesAllowed;
    }

    public BasicStatsInfoJSONData getPitcherCaughtStealing() {
        return pitcherCaughtStealing;
    }

    public void setPitcherCaughtStealing(BasicStatsInfoJSONData pitcherCaughtStealing) {
        this.pitcherCaughtStealing = pitcherCaughtStealing;
    }

    public BasicStatsInfoJSONData getPickoffAttempts() {
        return pickoffAttempts;
    }

    public void setPickoffAttempts(BasicStatsInfoJSONData pickoffAttempts) {
        this.pickoffAttempts = pickoffAttempts;
    }

    public BasicStatsInfoJSONData getPickoffs() {
        return pickoffs;
    }

    public void setPickoffs(BasicStatsInfoJSONData pickoffs) {
        this.pickoffs = pickoffs;
    }

    public BasicStatsInfoJSONData getTotalBattersFaced() {
        return totalBattersFaced;
    }

    public void setTotalBattersFaced(BasicStatsInfoJSONData totalBattersFaced) {
        this.totalBattersFaced = totalBattersFaced;
    }

    public BasicStatsInfoJSONData getPitchesThrown() {
        return pitchesThrown;
    }

    public void setPitchesThrown(BasicStatsInfoJSONData pitchesThrown) {
        this.pitchesThrown = pitchesThrown;
    }

    public BasicStatsInfoJSONData getWinPct() {
        return winPct;
    }

    public void setWinPct(BasicStatsInfoJSONData winPct) {
        this.winPct = winPct;
    }

    public BasicStatsInfoJSONData getPitcherGroundOutToFlyOutRatio() {
        return pitcherGroundOutToFlyOutRatio;
    }

    public void setPitcherGroundOutToFlyOutRatio(BasicStatsInfoJSONData pitcherGroundOutToFlyOutRatio) {
        this.pitcherGroundOutToFlyOutRatio = pitcherGroundOutToFlyOutRatio;
    }

    public BasicStatsInfoJSONData getPitcherOnBasePct() {
        return pitcherOnBasePct;
    }

    public void setPitcherOnBasePct(BasicStatsInfoJSONData pitcherOnBasePct) {
        this.pitcherOnBasePct = pitcherOnBasePct;
    }

    public BasicStatsInfoJSONData getPitcherSluggingPct() {
        return pitcherSluggingPct;
    }

    public void setPitcherSluggingPct(BasicStatsInfoJSONData pitcherSluggingPct) {
        this.pitcherSluggingPct = pitcherSluggingPct;
    }

    public BasicStatsInfoJSONData getPitcherOnBasePlusSluggingPct() {
        return pitcherOnBasePlusSluggingPct;
    }

    public void setPitcherOnBasePlusSluggingPct(BasicStatsInfoJSONData pitcherOnBasePlusSluggingPct) {
        this.pitcherOnBasePlusSluggingPct = pitcherOnBasePlusSluggingPct;
    }

    public BasicStatsInfoJSONData getStrikeoutsPer9Innings() {
        return strikeoutsPer9Innings;
    }

    public void setStrikeoutsPer9Innings(BasicStatsInfoJSONData strikeoutsPer9Innings) {
        this.strikeoutsPer9Innings = strikeoutsPer9Innings;
    }

    public BasicStatsInfoJSONData getWalksAllowedPer9Innings() {
        return walksAllowedPer9Innings;
    }

    public void setWalksAllowedPer9Innings(BasicStatsInfoJSONData walksAllowedPer9Innings) {
        this.walksAllowedPer9Innings = walksAllowedPer9Innings;
    }

    public BasicStatsInfoJSONData getHitsAllowedPer9Innings() {
        return hitsAllowedPer9Innings;
    }

    public void setHitsAllowedPer9Innings(BasicStatsInfoJSONData hitsAllowedPer9Innings) {
        this.hitsAllowedPer9Innings = hitsAllowedPer9Innings;
    }

    public BasicStatsInfoJSONData getStrikeoutsToWalksRatio() {
        return strikeoutsToWalksRatio;
    }

    public void setStrikeoutsToWalksRatio(BasicStatsInfoJSONData strikeoutsToWalksRatio) {
        this.strikeoutsToWalksRatio = strikeoutsToWalksRatio;
    }

    public BasicStatsInfoJSONData getPitchesPerInning() {
        return pitchesPerInning;
    }

    public void setPitchesPerInning(BasicStatsInfoJSONData pitchesPerInning) {
        this.pitchesPerInning = pitchesPerInning;
    }

    public BasicStatsInfoJSONData getPitcherAtBats() {
        return pitcherAtBats;
    }

    public void setPitcherAtBats(BasicStatsInfoJSONData pitcherAtBats) {
        this.pitcherAtBats = pitcherAtBats;
    }

    public BasicStatsInfoJSONData getInningsPlayed() {
        return inningsPlayed;
    }

    public void setInningsPlayed(BasicStatsInfoJSONData inningsPlayed) {
        this.inningsPlayed = inningsPlayed;
    }

    public BasicStatsInfoJSONData getTotalChances() {
        return totalChances;
    }

    public void setTotalChances(BasicStatsInfoJSONData totalChances) {
        this.totalChances = totalChances;
    }

    public BasicStatsInfoJSONData getFielderTagOuts() {
        return fielderTagOuts;
    }

    public void setFielderTagOuts(BasicStatsInfoJSONData fielderTagOuts) {
        this.fielderTagOuts = fielderTagOuts;
    }

    public BasicStatsInfoJSONData getFielderForceOuts() {
        return fielderForceOuts;
    }

    public void setFielderForceOuts(BasicStatsInfoJSONData fielderForceOuts) {
        this.fielderForceOuts = fielderForceOuts;
    }

    public BasicStatsInfoJSONData getFielderPutOuts() {
        return fielderPutOuts;
    }

    public void setFielderPutOuts(BasicStatsInfoJSONData fielderPutOuts) {
        this.fielderPutOuts = fielderPutOuts;
    }

    public BasicStatsInfoJSONData getOutsFaced() {
        return outsFaced;
    }

    public void setOutsFaced(BasicStatsInfoJSONData outsFaced) {
        this.outsFaced = outsFaced;
    }

    public BasicStatsInfoJSONData getAssists() {
        return assists;
    }

    public void setAssists(BasicStatsInfoJSONData assists) {
        this.assists = assists;
    }

    public BasicStatsInfoJSONData getErrors() {
        return errors;
    }

    public void setErrors(BasicStatsInfoJSONData errors) {
        this.errors = errors;
    }

    public BasicStatsInfoJSONData getFielderDoublePlays() {
        return fielderDoublePlays;
    }

    public void setFielderDoublePlays(BasicStatsInfoJSONData fielderDoublePlays) {
        this.fielderDoublePlays = fielderDoublePlays;
    }

    public BasicStatsInfoJSONData getFielderTriplePlays() {
        return fielderTriplePlays;
    }

    public void setFielderTriplePlays(BasicStatsInfoJSONData fielderTriplePlays) {
        this.fielderTriplePlays = fielderTriplePlays;
    }

    public BasicStatsInfoJSONData getFielderStolenBasesAllowed() {
        return fielderStolenBasesAllowed;
    }

    public void setFielderStolenBasesAllowed(BasicStatsInfoJSONData fielderStolenBasesAllowed) {
        this.fielderStolenBasesAllowed = fielderStolenBasesAllowed;
    }

    public BasicStatsInfoJSONData getFielderCaughtStealing() {
        return fielderCaughtStealing;
    }

    public void setFielderCaughtStealing(BasicStatsInfoJSONData fielderCaughtStealing) {
        this.fielderCaughtStealing = fielderCaughtStealing;
    }

    public BasicStatsInfoJSONData getFielderStolenBasePct() {
        return fielderStolenBasePct;
    }

    public void setFielderStolenBasePct(BasicStatsInfoJSONData fielderStolenBasePct) {
        this.fielderStolenBasePct = fielderStolenBasePct;
    }

    public BasicStatsInfoJSONData getPassedBalls() {
        return passedBalls;
    }

    public void setPassedBalls(BasicStatsInfoJSONData passedBalls) {
        this.passedBalls = passedBalls;
    }

    public BasicStatsInfoJSONData getFielderWildPitches() {
        return fielderWildPitches;
    }

    public void setFielderWildPitches(BasicStatsInfoJSONData fielderWildPitches) {
        this.fielderWildPitches = fielderWildPitches;
    }

    public BasicStatsInfoJSONData getFieldingPct() {
        return fieldingPct;
    }

    public void setFieldingPct(BasicStatsInfoJSONData fieldingPct) {
        this.fieldingPct = fieldingPct;
    }

    public BasicStatsInfoJSONData getRangeFactor() {
        return rangeFactor;
    }

    public void setRangeFactor(BasicStatsInfoJSONData rangeFactor) {
        this.rangeFactor = rangeFactor;
    }

    public BasicStatsInfoJSONData getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(BasicStatsInfoJSONData gamesStarted) {
        this.gamesStarted = gamesStarted;
    }
}
