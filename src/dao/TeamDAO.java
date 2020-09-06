
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	public void createTeam(Team team) throws Exception {
		 Connection con = ConnectionManager.getConnection();
		 String sql="insert into TEAM1 (ID,NAME,COACH,HOME_CITY,CAPTAIN)VALUES(?,?,?,?,?)";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setLong(1, team.getId());
		 ps.setString(2, team.getName());
		 ps.setString(3, team.getCoach());
		 ps.setLong(4, team.getCityId());
		 ps.setString(5, team.getCaptain());
			
		 boolean result;
		 result = ps.executeUpdate()>0;
		 if(result==true)
				System.out.println("team Details Added Successfully");
		 else 
				System.out.println("Adding team Details Failed. Please try again.");
			
		 con.close();
	}
	
}