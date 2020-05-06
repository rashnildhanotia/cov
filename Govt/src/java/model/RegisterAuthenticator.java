/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author owner
 */
public class RegisterAuthenticator
{
    public boolean isRegister(String Name, String Samagraid, String Mobileno, String Address, String Wardno, String Zoneno, String Familymembers, String Veggies, String Fruits, String Milk) 
    {
          PreparedStatement pst;
           Connection con;
        
           int row;
          
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        
        
        con=DriverManager.getConnection("jdbc:mysql://localhost/familyinfo","root","root");
       
        
        
       
        
       pst=con.prepareStatement("insert into info(name,samagraid,mobileno,address,wardno,zoneno,familymembers,veggies,fruits,milk)values(?,?,?,?,?,?,?,?,?,?)");
       
       pst.setString(1, Name);
       pst.setString(2, Samagraid);
       pst.setString(3, Mobileno);
       pst.setString(4, Address);
       pst.setString(5, Wardno);
       pst.setString(6, Zoneno);
       pst.setString(7, Familymembers);
       pst.setString(8, Veggies);
       pst.setString(9, Fruits);
       pst.setString(10, Milk);
       
        row=pst.executeUpdate();
       
     
    }   
    
         catch (ClassNotFoundException e) 
           {
            System.out.println(e);
           }
           catch(SQLException e)
        {
            System.out.println(e);
        }
    
        if(Name!=null && !Name.trim().equals("") && Samagraid!=null && Mobileno!=null && Address!=null && Wardno!=null && Zoneno!=null && Veggies!=null && Fruits!=null && Milk!=null)
        {
            return true;
        }
        return false;
    }
}
