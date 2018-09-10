package com.niit.productapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/prod.srv")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

      public void processRequest(HttpServletRequest req , HttpServletResponse res){
    	  try{
    	  res.setContentType("text/html");
    	   PrintWriter pw= res.getWriter();
    	    pw.println("<h2><font color='green'> Product Controller</font></h2>");
    	    
    	  
    	    String prodid= req.getParameter("pid");
    	    String pname= req.getParameter("pname");
    	    String pprice= req.getParameter("pprice");
    	     pw.println("Prod  ID: "+prodid+"<br>"+
    	                "Pname:  "+pname+"<br>"+
    	    		     "Price : "+pprice);
    	  
    	    
    	  }catch(IOException e){e.printStackTrace();}
    	  
      }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 processRequest(request , response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request , response);
	}

}
