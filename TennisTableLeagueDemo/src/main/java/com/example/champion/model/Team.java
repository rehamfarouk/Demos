package com.example.champion.model;

import java.io.Serializable;

public class Team implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int teamId;
	private String teamName;
	private boolean isWinner;

	public Team() {

	}

	public Team(int teamId, String teamName, boolean isWinner) {
		this.teamId = teamId;
		this.teamName = teamName;
		this.isWinner = isWinner;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public boolean isWinner() {
		return isWinner;
	}

	public void setWinner(boolean isWinner) {
		this.isWinner = isWinner;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", isWinner=" + isWinner + "]";
	}

}
