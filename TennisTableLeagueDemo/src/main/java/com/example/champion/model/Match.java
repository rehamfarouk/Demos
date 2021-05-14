package com.example.champion.model;

import java.io.Serializable;

public class Match implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int matchId;
	private String MatchName;
	private Team team1;
	private Team team2;

	public Match() {

	}

	public Match(int matchId, String matchName, Team team1, Team team2) {
		this.matchId = matchId;
		MatchName = matchName;
		this.team1 = team1;
		this.team2 = team2;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getMatchName() {
		return MatchName;
	}

	public void setMatchName(String matchName) {
		MatchName = matchName;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", MatchName=" + MatchName + ", team1=" + team1 + ", team2=" + team2 + "]";
	}

}
