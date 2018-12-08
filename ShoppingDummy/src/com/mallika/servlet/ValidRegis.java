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
 * Servlet implementation class ValidRegis
 */
@WebServlet("/ValidReg")
public class ValidRegis extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jsp");
		PrintWriter pw=response.getWriter();
		
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String phoneNum=request.getParameter("phone");
		
		
		String password=request.getParameter("password");

		
		
		

	String type=getInsertData(firstName,password,lastName,email,phoneNum);
		   if(type.equals("done"))
	   {
		   pw.println("done!");
		   
		  RequestDispatcher rs=request.getRequestDispatcher("login.jsp");
		   rs.forward(request, response);
		   }
		   else{
			   pw.println("id is duplicate");
		   }
		
	}
	
public String getInsertData(String firstName,String password,String lastName,String email,String phoneNum){
		
		DAOClass dao=new DAOClass();
		return dao.getInsertData( firstName,password,lastName,email,phoneNum);
		
	}
	}

