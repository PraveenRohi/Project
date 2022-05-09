<%@ include file="header.jspf"%>
<%@ include file="navigation.jspf"%>

	<!-- end #header -->
	<div id="menu">

<ul>
<li><a href="/" class="ex">home</a></li>
<li><a href="/postclassified" class="ex">Post classified</a></li>
<li><a href="/viewclassified"class="ex">View classified</a></li>
</ul>
	</div>
	
	<div id="banner"><img src="images/img03.jpg" width="1000" height="361" alt="" /></div>
	<div id="welcome">
		<h2 class="title"><a href="#">Welcome to Cityuser</a></h2>
	
	<div id="three-columns">
		<div id="column1">
			<p><jsp:include page="left.jsp"></jsp:include></p>
		</div>
		<div id="column2">
			<fieldset>
<legend style="font-weight:bold;color:blue;">R u admin?</legend>
<form method="get" action="/admin1">
<table >
<tbody>
<tr>
<td>&nbsp;Admin name<br'/></td>
<td>&nbsp;<input type="text" name="username"/></td></tr>
<tr>
<td>&nbsp;Password:</td>
<td>&nbsp;<input type="password" name="userpass"/></td></tr>

<tr><td><input type="submit" value="login" name="button1"></td></tr>
</tbody>
</table>
</form>
</fieldset>	</div>
		<div id="column3">
			<h2>Top City</h2> 
			<p><jsp:include page="right.jsp"></jsp:include></p>
		</div>
	</div>
	
	<div id="page">
		<div id="content">
			
			
				<div id="content">
					<img src ="images/admin.jpg" onclick="admin.jsp"/><br/>
					<marquee>THIS IS ADMIN PAGE</marquee>
				
			</div>
		</div>
		<!-- end #content -->
		<div id="sidebar">
			<ul>
				<li>
					<h2><marquee>Free advertisement..</marquee></h2>
					<ul>
						
						<li><a href="cityuser">Cityuser</a></li>
						<li><a href="#">Google</a></li>
						
					</ul>
				</li>
			</ul>
		</div>
	</div>
	<!-- end #page --> 
</div>
<div id="footer">
	<p>Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a href="#">cityuser</a>.</p>
</div>
<!-- end #footer -->












