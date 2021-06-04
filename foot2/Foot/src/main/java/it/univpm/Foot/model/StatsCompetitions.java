package it.univpm.Foot.model;

public class StatsCompetitions {

	public StatsCompetitions() {
		// TODO Auto-generated constructor stub
	}
	
	private Long numCompetions = null;
	private Long averageDuration = null;
	private Long minNumberTeams = null;
	private Long maxNumberTeams = null;
	private Long averageNumberTeams = null;
	private Long numberAverageOfAvailableSeasons = null;
	
	public Long getNumCompetions() {
		return numCompetions;
	}
	public void setNumCompetions(Long numCompetions) {
		this.numCompetions = numCompetions;
	}
	public Long getAverageDuration() {
		return averageDuration;
	}
	public void setAverageDuration(Long avarageDuration) {
		this.averageDuration = avarageDuration;
	}
	public Long getMinNumberTeams() {
		return minNumberTeams;
	}
	public void setMinNumberTeams(Long minNumberTeams) {
		this.minNumberTeams = minNumberTeams;
	}
	public Long getMaxNumberTeams() {
		return maxNumberTeams;
	}
	public void setMaxNumberTeams(Long maxNumberTeams) {
		this.maxNumberTeams = maxNumberTeams;
	}
	public Long getAverageNumberTeams() {
		return averageNumberTeams;
	}
	public void setAverageNumberTeams(Long averageNumberTeams) {
		this.averageNumberTeams = averageNumberTeams;
	}
	public Long getNumberAverageOfAvailableSeasons() {
		return numberAverageOfAvailableSeasons;
	}
	public void setNumberAverageOfAvailableSeasons(Long numberAverageOfAvailableSeasons) {
		this.numberAverageOfAvailableSeasons = numberAverageOfAvailableSeasons;
	}
}
