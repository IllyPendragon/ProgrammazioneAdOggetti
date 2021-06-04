package it.univpm.Foot.model;

public class Scorers {
	
	private String name;
	private String position;
	private Long numberOfGoals;
	private String teamName;
	
	
	public Scorers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scorers(String name, String position, Long numberOfGoals, String teamName) {
		super();
		this.name = name;
		this.position = position;
		this.numberOfGoals = numberOfGoals;
		this.teamName = teamName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Long getNumberOfGoals() {
		return numberOfGoals;
	}
	public void setNumberOfGoals(Long numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	
}
