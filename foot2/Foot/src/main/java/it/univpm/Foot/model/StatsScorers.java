package it.univpm.Foot.model;

import java.util.Vector;
/**
 * Classe che definisce StatsScorers
 * 
 */
public class StatsScorers {

	/**
	 * Variabile che descrive la squadra con il numero minore di marcatori
	 */
	private String teamMinScorers;
	/**
	 * Variabile che descrive la squadra con il numero maggiore di marcatori
	 */
	private String teamMaxScorers;
	/**
	 * Variabile che descrive il numero medio di Goal per marcatori
	 */
	private long averageGoalsForScorer;
	/**
	 * Vettore che descrive il nome e il  numero medio di Goal per marcatori
	 */
	private Vector<AverageNameAndNumOfGoalsScorers> averageForScorerVector;
	/**
	 * Vettore che descrive la media di Goal per marcatori
	 */
	private Vector<AverageNameAndNumOfGoalsScorers> averageForTeamScorerVector;
	
	/**
	 * Costruttore di default
	 */
	public StatsScorers() {
		// TODO Auto-generated constructor stub
	}
   
    /**
     * Costruttore utile all'inizializzazione dell'oggetto
     * 
     * @param teamMinScorers Assegna la squadra con il numero minore di marcatori
     * @param teamMaxScorers Assegna la squadra con il numero maggiore di marcatori
     * @param averageGoalsForScorer Assegna il numero medio di Goal per marcatori 
     * @param averageForScorerVector Assegna il Vettore che descrive il nome e il  numero medio di Goal per marcatori
     * @param averageForTeamScorerVector Assegna il Vettore che descrive la media di Goal per marcatori
     */
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


	/**
	 * @return the teamMinScorers
	 */
	public String getTeamMinScorers() {
		return teamMinScorers;
	}


	/**
	 * @param teamMinScorers the teamMinScorers to set
	 */
	public void setTeamMinScorers(String teamMinScorers) {
		this.teamMinScorers = teamMinScorers;
	}


	/**
	 * @return the teamMaxScorers
	 */
	public String getTeamMaxScorers() {
		return teamMaxScorers;
	}


	/**
	 * @param teamMaxScorers the teamMaxScorers to set
	 */
	public void setTeamMaxScorers(String teamMaxScorers) {
		this.teamMaxScorers = teamMaxScorers;
	}


	/**
	 * @return the averageGoalsForScorer
	 */
	public long getAverageGoalsForScorer() {
		return averageGoalsForScorer;
	}


	/**
	 * @param averageGoalsForScorer the averageGoalsForScorer to set
	 */
	public void setAverageGoalsForScorer(long averageGoalsForScorer) {
		this.averageGoalsForScorer = averageGoalsForScorer;
	}


	/**
	 * @return the averageForScorerVector
	 */
	public Vector<AverageNameAndNumOfGoalsScorers> getAverageForScorerVector() {
		return averageForScorerVector;
	}


	/**
	 * @param averageForScorerVector the averageForScorerVector to set
	 */
	public void setAverageForScorerVector(Vector<AverageNameAndNumOfGoalsScorers> averageForScorerVector) {
		this.averageForScorerVector = averageForScorerVector;
	}


	/**
	 * @return the averageForTeamScorerVector
	 */
	public Vector<AverageNameAndNumOfGoalsScorers> getAverageForTeamScorerVector() {
		return averageForTeamScorerVector;
	}


	/**
	 * @param averageForTeamScorerVector the averageForTeamScorerVector to set
	 */
	public void setAverageForTeamScorerVector(Vector<AverageNameAndNumOfGoalsScorers> averageForTeamScorerVector) {
		this.averageForTeamScorerVector = averageForTeamScorerVector;
	}



}
