package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFirstClass extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
    { 
    	 PrintWriter out=resp.getWriter();
    	 out.println("Welcome");
    	 out.println(new Date());
    	 Random r=new Random();
    	 out.println("Random number  :"+r.nextInt(1000));
    	 
    	
    }
}
