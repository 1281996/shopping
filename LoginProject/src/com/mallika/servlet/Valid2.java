package com.mallika.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class Valid2
 */
@WebServlet("/form2")
public class Valid2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		String firstName=request.getParameter("n1");
		String lastName=request.getParameter("n2");	
		String passWord=request.getParameter("p1");
//		String userNamel=request.getParameter("t1");
//		String passWordl=request.getParameter("t2");
//	String value=request.getParameter("h1");
//		System.out.println(value);
		
		
		

	String type=getSendData(firstName,lastName,passWord);
		   if(type.equals("s"))
	   {
		   pw.println("done!");
		   
		  RequestDispatcher rs=request.getRequestDispatcher("login.html");
		   rs.forward(request, response);
		   }
		
	}
	
public String getSendData(String firstName,String lastName,String passWord){
		
		DAOClass dao=new DAOClass();
		return dao.getSendData( firstName,lastName,passWord);
		
	}

}
