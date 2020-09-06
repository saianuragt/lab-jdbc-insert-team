
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	
	City city;
	
	 public City getCityByName(String name) throws SQLException, Exception {
//		 Connection con = ConnectionManager.getConnection();
//		 String sql="select * from CITY1 where name = '+name+'";
//		 Statement st = con.createStatement();
//		 ResultSet rs = st.executeQuery(sql);
//		 System.out.println("a");
//		 while(rs.next()) {
//			 	System.out.println("b");
//				Long id = rs.getLong(1);
//				String c_name = rs.getString(2);
//				city = new City(id,c_name);
//				System.out.println("City id : "+id);
//				System.out.println("City name : "+c_name);
//		 }
//		 System.out.println("c");
//		 return city;
		 
		 Connection con = ConnectionManager.getConnection();
		 String sql="select * from CITY1 where name = ?";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setString(1, name);
		 ResultSet rs = ps.executeQuery();
		 //System.out.println("a");
		 while(rs.next()) {
			 	//System.out.println("b");
				Long id = rs.getLong(1);
				String c_name = rs.getString(2);
				city = new City(id,c_name);
				//System.out.println("City id : "+id);
				//System.out.println("City name : "+c_name);
		 }
		 //System.out.println("c");
		 return city;
			
	 }
	 public void createCity(City city) throws SQLException, Exception {
		 long id = city.getCityId();
		 String name=city.getCityName();
		 
		 Connection con = ConnectionManager.getConnection();
		 String sql="insert into CITY1 (ID,NAME)VALUES(?,?)";
		 PreparedStatement ps = con.prepareStatement(sql);
		 ps.setLong(1, id);
		 ps.setString(2, name);
		 boolean result;
		 result = ps.executeUpdate()>0;
		 if(result==true)
				System.out.println("City Details Added Successfully");
		 else 
				System.out.println("Adding City Details Failed. Please try again.");
			
		 con.close();
	 }
	
}