
package model;

public class Team{
	long id;
	String name;
	String coach;
	String captain;
	long cityId;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public Team(long id, String name, String coach, String captain, long cityId) {
		this.id = id;
		this.name = name;
		this.coach = coach;
		this.captain = captain;
		this.cityId = cityId;
	}
	
	
}