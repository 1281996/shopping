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
 * Servlet implementation class Valid
 */
@WebServlet("/form")
public class Valid extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String value1=request.getParameter("t3");
		//String value2=request.getParameter("t4");
		
//		
//		 if(value2.equals("register")){
//				//pw.println("hello");
//					RequestDispatcher rs=request.getRequestDispatcher("registration.html");
//				   rs.include(request, response);
//					   
//					   
//					   
//					   
//				}
		 
		 if(value1.equals("submit")){
				
			String userName1=request.getParameter("t1");			
			String passWord1=request.getParameter("t2");
				//pw.println(passWord1);
				String status=validUser(userName1,passWord1);
				//pw.println("hello user");
			
			if(status.equals("valid")){
					//pw.println(status.equals("valid"));
				//	RequestDispatcher rs=request.getRequestDispatcher("home.html");
//					   rs.include(request, response);
					pw.println("hello user");
					
				}
			else{
				pw.println("enter valid credentails");
				 RequestDispatcher rs1=request.getRequestDispatcher("login.html");
				   rs1.include(request, response);
			}
				
				
			}
		 
		
		
		
	}

	public String validUser(String userName1,String passWord1){
		DAOClass dao=new DAOClass();
		//System.out.println("mallika prasad");
		return dao.validUser(userName1,passWord1);
	}

}
