package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main {

	public static void main(String[] args) throws SQLException, Exception {
	
		TeamDAO teamdao = new TeamDAO();
		CityDAO citydao = new CityDAO();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1. Add City");
		System.out.println("2. Add Team");
		System.out.println("3. View City");
		int choice = Integer.parseInt(br.readLine()); 
		
		switch(choice) {
		case 1:
			System.out.println("Enter City Id:");
			long id = Long.parseLong(br.readLine());
			System.out.println("Enter City Name:");
			String cityName = br.readLine();
			
			City city = new City(id,cityName);
			citydao.createCity(city);
			break;
		case 2:
			System.out.println("Enter Team Id:");
			long id1 = Long.parseLong(br.readLine());
			System.out.println("Enter Team Name:");
			String teamName = br.readLine();
			System.out.println("Enter Coach Name:");
			String coach = br.readLine();
			System.out.println("Enter City Id:");
			long cityid = Long.parseLong(br.readLine());
			System.out.println("Enter Captain Name:");
			String captain = br.readLine();
			
			Team team = new Team(id1,teamName,coach,captain,cityid);
			teamdao.createTeam(team);
			break;
		case 3: 
			System.out.println("Enter City Name:");
			String c_name = br.readLine();
			city = citydao.getCityByName(c_name);
			System.out.println("City id : "+city.getCityId());
			System.out.println("City name : "+city.getCityName());
			break;
		}
		
	
	}

}
