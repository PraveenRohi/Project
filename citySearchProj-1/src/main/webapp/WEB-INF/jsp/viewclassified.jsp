<%@ include file="header.jspf"%>
<%@ include file="navigation.jspf"%>
<%@ include file="coockie.jsp"  %>
<%@ page import="java.sql.*" %>
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="#">city search</a></h1>
		</div>
	</div>
	<!-- end #header -->
	
	<div id="banner"><img src="images/img03.jpg" width="1000" height="361" alt="" /></div>
	<div id="welcome">	

		<h2 class="title"><a href="#">Welcome to City user</a></h2>
		
	
	<div id="three-columns">
		<div id="column1">
			<p><jsp:include page="left.jsp"></jsp:include></p>
		</div>
		<div id="column2">

	</div>
		<div id="column3">
			<h2>Top City</h2> 
			<p><jsp:include page="right.jsp"></jsp:include></p>
		</div>
	</div>
	
	<div id="page">

<%
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cityuser","root","Pradeepa@321");
Statement smt=con.createStatement();
String query="select * from cityclassified";

out.println("<table style='background-color:33ccff'; border='1' cellpadding='1' width='100%' cellspacing='1'>");
out.print("<tr><th>id</th><th>buysell</th><th>name</th><th>description</th></tr>");
ResultSet ps=smt.executeQuery(query);
while(ps.next()){

out.print("<tr><td>"+ps.getInt(1)+"</td><td>"+ps.getString(2)+"</td><td>"+ps.getString(3)+"</td><td> "+ps.getString(4)+"</td></tr>");

}out.print("</table>");
con.close();
}catch(Exception e){e.printStackTrace();}
%>
		</div>
		<!-- end #content -->
		
	
	<!-- end #page --> 

<div id="footer">
	<p>Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a href="#">city user</a>.</p>
</div></div>
<!-- end #footer -->



















