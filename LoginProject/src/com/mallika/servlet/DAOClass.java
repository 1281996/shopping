package com.mallika.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class DAOClass {

	public String validUser(String userName1, String passWord1) {
Connection connection=ConnectionFactory.getConnection();
		
		
		
		
		
		try{
			PreparedStatement ps=connection.prepareStatement("select * from user3 where username=? and passWord=?");
			//System.out.println(userName1);
			ps.setString(1, userName1);
			ps.setString(2, passWord1);
		     ResultSet rs=ps.executeQuery();
		    while(rs.next()){
			if(rs.getString("username").equals(userName1)&&rs.getString("passWord").equals(passWord1))
			{
				//System.out.println(userName1);
				return "valid";
			}
		    }
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		return "not valid";
			
			
	}

	public String getSendData(String username, String lastName, String passWord) {
		Connection connection=ConnectionFactory.getConnection();
		//System.out.println(username);
		//System.out.println(passWord);
		
		String insertTableSQL = "INSERT INTO user3"
				+ "(username,passWord,lastName) VALUES"
				+ "(?,?,?)";

		try{
		PreparedStatement ps=connection.prepareStatement(insertTableSQL );
		
		ps.setString(1, username);
		ps.setString(2, passWord);
		ps.setString(3, lastName);
		ps.executeUpdate();

		return "s";
	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return "so";
		
	}
	}


