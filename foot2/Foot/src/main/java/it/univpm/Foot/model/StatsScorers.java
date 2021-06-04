package it.univpm.Foot.model;

import java.util.Vector;

public class StatsScorers {

	private String teamMinScorers;
	private String teamMaxScorers;
	private long averageGoalsForScorer;
	private Vector<AverageNameAndNumOfGoalsScorers> averageForScorerVector;
	private Vector<AverageNameAndNumOfGoalsScorers> averageForTeamScorerVector;
	
	public StatsScorers() {
		// TODO Auto-generated constructor stub
	}
	

	public StatsScorers(String teamMinScorers, String teamMaxScorers,
			long averageGoalsForScorer,
			Vector<AverageNameAndNumOfGoalsScorers> averageForScorerVector,
			Vector<AverageNameAndNumOfGoalsScorers> averageForTeamScorerVector) {
		super();
		this.teamMinScorers = teamMinScorers;
		this.teamMaxScorers = teamMaxScorers;
		this.averageGoalsForScorer = averageGoalsForScorer;
		this.averageForScorerVector = averageForScorerVector;
		this.averageForTeamScorerVector = averageForTeamScorerVector;
	}


	public String getTeamMinScorers() {
		return teamMinScorers;
	}

	public void setTeamMinScorers(String teamMinScorers) {
		this.teamMinScorers = teamMinScorers;
	}

	public String getTeamMaxScorers() {
		return teamMaxScorers;
	}

	public void setTeamMaxScorers(String teamMaxScorers) {
		this.teamMaxScorers = teamMaxScorers;
	}

	public Vector<AverageNameAndNumOfGoalsScorers> getAverageForScorerVector() {
		return averageForScorerVector;
	}

	public void setAverageForScorerVector(Vector<AverageNameAndNumOfGoalsScorers> averageForScorerVector) {
		this.averageForScorerVector = averageForScorerVector;
	}

	public Vector<AverageNameAndNumOfGoalsScorers> getAverageForTeamScorerVector() {
		return averageForTeamScorerVector;
	}

	public void setAverageForTeamScorerVector(Vector<AverageNameAndNumOfGoalsScorers> averageForTeamScorerVector) {
		this.averageForTeamScorerVector = averageForTeamScorerVector;
	}


	public long getAverageGoalsForScorer() {
		return averageGoalsForScorer;
	}


	public void setAverageGoalsForScorer(long averageGoalsForScorer) {
		this.averageGoalsForScorer = averageGoalsForScorer;
	}
}
