package it.univpm.Foot.model;

public class Competizioni {

	/**
	 * Variabile che descrive il nome della competizione
	 */
	private String nome;
	/**
	 * Variabile che descrive il codice della competizione
	 */
	private String codice;
	/**
	 * Variabile che descrive la data iniziale della stagione
	 */
	private String dataIniziale;
	/**
	 * Variabile che descrive la data finale della stagione
	 */
	private String dataFinale;

	/**
	 * Variabile che descrive il vincitore della stagione
	 */
	private String vincitore;
	
	private String nationality;
	
	private String countryCode;
	
	private Long currentMatchday;
	
	// attributo calcolato
	private Long teamsNumber;
	
	
	private Long numberOfAvailableSeasons;
		
	//Costruttori
	public Competizioni() {}
	
	public Competizioni(String nome, String codice, String dataIniziale, String dataFinale, String vincitore, String nationality, String countryCode, Long currentMatchday, Long teamsNumber, Long numberOfAvailableSeasons) {
		this.nome= nome;
		this.codice=codice;
		this.dataIniziale = dataIniziale;
		this.dataFinale = dataFinale;
		this.vincitore = vincitore;
		this.nationality = nationality;
		this.countryCode = countryCode;
		this.currentMatchday = currentMatchday;
		this.teamsNumber = teamsNumber;
		this.numberOfAvailableSeasons = numberOfAvailableSeasons;
	};

	/**
	 * @return the name
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param name the name to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the dataIniziale
	 */
	public String getDataIniziale() {
		return dataIniziale;
	}

	/**
	 * @param dataIniziale the dataIniziale to set
	 */
	public void setDataIniziale(String dataIniziale) {
		this.dataIniziale = dataIniziale;
	}

	/**
	 * @return the dataFinale
	 */
	public String getDataFinale() {
		return dataFinale;
	}

	/**
	 * @param dataFinale the dataFinale to set
	 */
	public void setDataFinale(String dataFinale) {
		this.dataFinale = dataFinale;
	}

	/**
	 * @return the vincitore
	 */
	public String getVincitore() {
		return vincitore;
	}

	/**
	 * @param vincitore the vincitore to set
	 */
	public void setVincitore(String vincitore) {
		this.vincitore = vincitore;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Long getCurrentMatchday() {
		return currentMatchday;
	}

	public void setCurrentMatchday(Long currentMatchday) {
		this.currentMatchday = currentMatchday;
	}

	public Long getTeamsNumber() {
		return teamsNumber;
	}

	public void setTeamsNumber(Long teamsNumber) {
		this.teamsNumber = teamsNumber;
	}

	public Long getNumberOfAvailableSeasons() {
		return numberOfAvailableSeasons;
	}

	public void setNumberOfAvailableSeasons(Long numberOfAvailableSeasons) {
		this.numberOfAvailableSeasons = numberOfAvailableSeasons;
	}
	
	

}
