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
 * Servlet implementation class CartValid
 */
@WebServlet("/Cart1")
public class CartValid extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int productId=Integer.parseInt(request.getParameter("productId"));
		String productName=request.getParameter("productName");
		int price=Integer.parseInt(request.getParameter("price"));
		//pw.println(productId);
		

		String type=getInsertDataCart(productId,productName,price);
			   if(type.equals("done"))
		   {
			   pw.println("done!");
			   
			  RequestDispatcher rs=request.getRequestDispatcher("/Validproduct");
			   rs.forward(request, response);
			   }
			   else{
				   pw.println("input type is no compatitable");
			   }
		
		
		
	}
	
public String getInsertDataCart(int productId,String productName,int price){
		
		DAOClass dao=new DAOClass();
		return dao.getInsertDataCart( productId,productName,price);
		
	}

}
