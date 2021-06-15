package it.univpm.Foot.model;

/**
 * Classe che definisce AverageNameAndNumOfGoalsScorers
 * 
 */
public class AverageNameAndNumOfGoalsScorers {

	/**
	 * Variabile che descrive il nome del marcatore
	 */
	private String name;
	/**
	 * Variabile che descrive il nome della squadra del marcatore
	 */
	private String teamName;
	/**
	 * Variabile che descrive il numero dei Goal segnati dal marcatore
	 */
	private long numberOfGoals;
	/**
	 * Variabile che descrive il numero dei marcatori
	 */
	private long numberScorers;
	/**
	 * Variabile che descrive la media dei Goal segnati
	 */
	private long averageOfGoals;
	
	
	/**
	 * Costruttore di default
	 */
	
	public AverageNameAndNumOfGoalsScorers() {
	}

	/**
	 * Costruttore utile all'inizializzazione dell'oggetto
	 * 
	 * @param name Assegna il nome al marcatore
	 * @param numberOfGoals Assegna il numero dei Goal del marcatore
	 * @param teamName Assegna il nome alla squadra
	 * @param numberScorers Assegna il numero dei marcatori
	 * @param averageOfGoals Assegna la media dei Goal segnati
	 */
	public AverageNameAndNumOfGoalsScorers(String name, long numberOfGoals, String teamName, long numberScorers, long averageOfGoals) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.numberOfGoals = numberOfGoals;
		this.numberScorers = numberScorers;
		this.averageOfGoals = averageOfGoals;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the numberOfGoals 
	 */
	public long getNumberOfGoals() {
		return numberOfGoals;
	}
	/**
	 * @param numberOfGoals the numberOfGoals to set
	 */
	public void setNumberOfGoals(long numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}

	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * @return the numberScorers
	 */
	public long getNumberScorers() {
		return numberScorers;
	}

	/**
	 * @param numberScorers the numberScorers to set
	 */
	public void setNumberScorers(long numberScorers) {
		this.numberScorers = numberScorers;
	}

	/**
	 * @return the averageOfGoals
	 */
	public long getAverageOfGoals() {
		return averageOfGoals;
	}

	/**
	 * @param averageOfGoals the averageOfGoals to set
	 */
	public void setAverageOfGoals(long averageOfGoals) {
		this.averageOfGoals = averageOfGoals;
	}	
	
}
