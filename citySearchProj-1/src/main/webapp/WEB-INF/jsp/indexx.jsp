	<%@ page import="java.sql.*" %>
<%
String n=request.getParameter("val");

try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cityuser","root","Pradeepa@321");

PreparedStatement ps=con.prepareStatement("select * from cityuser where name=?");
ps.setString(1,n);
ResultSet rs=ps.executeQuery();
boolean status=rs.next();

if(status)
out.println("Invalid user! userName already exists");
else
out.println("Valid user");

con.close();
}catch(Exception e){e.printStackTrace();}

%>