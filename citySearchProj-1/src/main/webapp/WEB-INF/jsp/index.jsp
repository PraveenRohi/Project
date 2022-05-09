<%@ include file="header.jspf"%>
<%@ include file="navigation.jspf"%>
	
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="#">city search</a></h1>
		</div>
	</div>
	<div id="banner"><img src="images/img03.jpg" width="1000" height="361" alt="" /></div>
	<div id="welcome">
	
	<h2 class="title"><a href="#">Welcome to City Search</a></h2>
	
	
	<div id="three-columns">
		<div id="column1">
			<p><jsp:include page="left.jsp"></jsp:include></p>
		</div>
		<div id="column2">

      <h2>City Search offers..</h2>
      <ul>
    <li><a href="/viewclassified">Classified </a></li>
    <li><a href="/postclassified">Post Classified </a></li>
    <li><a href="/viewclassified">Free Advertisement </a></li>
    <li><a href="/details?city=delhi">Local Information</a></li>
      </ul>	
	</div>
		<div id="column3">
			<h2>Top City</h2> 
			<p><jsp:include page="right.jsp"></jsp:include></p>
		</div>
	</div>
	
	
	<div id="page">
		<div id="content">
			
			
				<div id="content">
	
					<img src ="images/foto.jpg" onclick="index" style="opacity:0.7;filter:alpha(opacity=20);"/><br/>
					<marquee>WORLDS IN YOUR HAND:CITYUSER</marquee>
				
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

<div id="footer">
	<p>Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a href="#">cityuser</a>.</p>
</div>
<!-- end #footer -->

