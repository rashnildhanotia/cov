<%-- 
    Document   : record
    Created on : May 5, 2020, 6:18:49 PM
    Author     : owner
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="LightSeaGreen">
        
       <%
            String Name=(String)session.getAttribute("name");
            if(Name!=null && !Name.trim().equals("") )
            {
                response.sendRedirect("Register.html");
            }
        %>    
        <h1>Hello <%=Name%></h1>
         <h2>You have been registered with your order successfully.</h2>
         
         <a href="Ok.jsp">OK</a>
    </body>
</html>
