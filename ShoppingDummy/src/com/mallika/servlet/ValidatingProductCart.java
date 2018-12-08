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
 * Servlet implementation class ValidatingProductCart
 */
@WebServlet("/Validproduct")
public class ValidatingProductCart extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int productId=Integer.parseInt(request.getParameter("productId"));
		String productName=request.getParameter("productName");
		int price=Integer.parseInt(request.getParameter("price"));
		pw.println(price);
		pw.println(productId);
		pw.println(productName);
		String type=validCartData(productId,productName,price);
		   if(type.equals("done"))
	   {
		   pw.println(" product done done!");
		   
		  RequestDispatcher rs=request.getRequestDispatcher("Delivery.jsp");
		   rs.forward(request, response);
		   }
		   else{
			   pw.println("NOW PRODUCT IS NOT AVAILABLE");
		   }
		
	}
public String validCartData(int productId,String productName,int price){
		
		DAOClass dao=new DAOClass();
		return dao.validCartData( productId,productName,price);
		
	}

}
