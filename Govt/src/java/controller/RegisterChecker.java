/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RegisterAuthenticator;

/**
 *
 * @author owner
 */
public class RegisterChecker extends HttpServlet 
{
 public void doGet(HttpServletRequest request,HttpServletResponse response )throws ServletException, IOException
    {
        response.sendRedirect("Register.html");
    }
    
   
    
    public void doPost(HttpServletRequest request,HttpServletResponse response )throws ServletException, IOException
    {
      String Name=request.getParameter("name");
      String Samagraid=request.getParameter("samagraid");
      String Mobileno=request.getParameter("mobileno");
      String Address=request.getParameter("address");
      String Wardno=request.getParameter("wardno");
      String Zoneno=request.getParameter("zoneno");
      String Familymembers=request.getParameter("familymembers");
      String Veggies=request.getParameter("veggies");
      String Fruits=request.getParameter("fruits");
      String Milk=request.getParameter("milk");
      
    
      
      RegisterAuthenticator authenticator=new RegisterAuthenticator();
      boolean register=authenticator.isRegister(Name, Samagraid, Mobileno, Address, Wardno, Zoneno, Familymembers, Veggies, Fruits, Milk);
      
      if(register)
      {
          HttpSession session=request.getSession(true);
          session.setAttribute("name", Name);
          response.sendRedirect("record.jsp");
      }
      else
      {
          response.sendRedirect("Register.html");
      }
    }
    
}
   

