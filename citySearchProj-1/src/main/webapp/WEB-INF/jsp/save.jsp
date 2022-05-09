<%@ page import="java.sql.*" %>
<%
try{	
	String Name = request.getParameter("username");
	//System.out.println(Name);
	//String password = request.getParameter("Password");
	String Category = request.getParameter("Category");
	String Email = request.getParameter("usermail");
	String Contact = request.getParameter("Contact");
	String Address = request.getParameter("Address");
	String City = request.getParameter("City");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cityuser","root","Pradeepa@321");
	PreparedStatement ps=con.prepareStatement("insert into citydetails values(?,?,?,?,?,?,?)");
		ps.setInt(1,3);
		ps.setString(7, Name);
		ps.setString(3, Category);
		ps.setString(6, Email);
		ps.setString(2, Address);
		ps.setString(4, City);
		ps.setString(5, Contact);
		
		int status = ps.executeUpdate();
		
		if(status>0){
			%>
			<jsp:forward page="adminsuccess"></jsp:forward>
			<% 
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
%>	