package it.univpm.Foot.model;
/**
 * Classe che definisce Scorers
 * 
 */
public class Scorers {
	/**
	 * Variabile che descrive il nome del marcatore
	 */
	private String name;
	/**
	 * Variabile che descrive il ruolo del marcatore
	 */
	private String position;
	/**
	 * Variabile che descrive il numero dei Goal seganti dal marcatore
	 */
	private Long numberOfGoals;
	/**
	 * Variabile che descrive il nome della squadra del marcatore
	 */
	private String teamName;
	
	/**
	 * Costruttore di default
	 */
	public Scorers() {
		super();
	}
	/**
	 * Costruttore utile all'inizializzazione dell'oggeto
	 * 
	 * @param name Assegna il nome al marcatore
	 * @param position Assegna il ruolo al marcatore
	 * @param numberOfGoals Assegna il numero dei Goal segnati dal marcatore
	 * @param teamName Assegna il nome della squadra del marcatore
	 */
	public Scorers(String name, String position, Long numberOfGoals, String teamName) {
		super();
		this.name = name;
		this.position = position;
		this.numberOfGoals = numberOfGoals;
		this.teamName = teamName;
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
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the numberOfGoals
	 */
	public Long getNumberOfGoals() {
		return numberOfGoals;
	}
	/**
	 * @param numberOfGoals the numberOfGoals to set
	 */
	public void setNumberOfGoals(Long numberOfGoals) {
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
	
}
