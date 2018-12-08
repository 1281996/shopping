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
 * Servlet implementation class ValidLoginform
 */
@WebServlet("/ValidLogin")
public class ValidLoginform extends HttpServlet {
	
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/jsp");
		PrintWriter pw=response.getWriter();
		String value1=request.getParameter("submit");
		
		 if(value1.equals("submit")){
				
				String userName1=request.getParameter("userName");			
				String passWord1=request.getParameter("password");
					
					String status=validUser(userName1,passWord1);
					pw.println(status);
				
				if(status.equals("valid")){
						//pw.println(status.equals("valid"));
					pw.println("hello user "+userName1);
						RequestDispatcher rs=request.getRequestDispatcher("Homepage.jsp");
						   rs.include(request, response);
					
						
					}
				else{
					pw.println("enter valid credentails");
					 RequestDispatcher rs1=request.getRequestDispatcher("login.jsp");
					   rs1.include(request, response);
				}
					
					
				}
		
		
	}
	
	public String validUser(String userName1,String passWord1){
		System.out.println(userName1);
		System.out.println(userName1);
		DAOClass dao=new DAOClass();
		//System.out.println("mallika prasad");
		return dao.validUser(userName1,passWord1);
	}

}
