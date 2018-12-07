package com.mallika.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOClass {

	public String validUser(String userName1, String passWord1) {
Connection connection=ConnectionFactory.getConnection();
		
		
		
		
		
		try{
			PreparedStatement ps=connection.prepareStatement("select * from usertable2 where firstname=? and passWord=?");
			System.out.println(userName1);
			
			ps.setString(1, userName1);
			ps.setString(2, passWord1);
		     ResultSet rs=ps.executeQuery();
		    while(rs.next()){
			if(rs.getString("firstname").equals(userName1)&&rs.getString("passWord").equals(passWord1))
			{
				System.out.println(userName1);
				System.out.println(passWord1);
				System.out.println(rs.getString("firstname"));
				System.out.println(rs.getString("passWord"));
				return "valid";
			}
		    }
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		return "not valid";
	}

	public String getInsertData(String firstName, String password,
			String lastName, String email, String phoneNum) {
		Connection connection=ConnectionFactory.getConnection();
		//System.out.println(username);
		//System.out.println(passWord);
		int userId=0;
		Statement stmt = null;
		
		
		String insertTableSQL = "INSERT INTO usertable2"
				+ "(firstname,passWord,lastName,email,phonenumber,userid) VALUES"
				+ "(?,?,?,?,?,seq1.nextval)";

		try{
			
			//stmt = connection.createStatement();
			//userId = stmt.executeUpdate("SELECT SEQ1.NEXTVAL FROM usertable2");
			
		PreparedStatement ps=connection.prepareStatement(insertTableSQL );
		
		ps.setString(1, firstName);
		ps.setString(2, password);
		ps.setString(3, lastName);
		ps.setString(4, email);
		ps.setString(5, phoneNum);
		//ps.setInt(6, userId);
		
		ps.executeUpdate();

		return "done";
	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return "not done";
	}

}
