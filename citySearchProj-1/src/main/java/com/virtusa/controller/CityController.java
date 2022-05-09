package com.virtusa.controller;


import java.io.IOException;

//import org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CityController {
	@GetMapping("admin")
	   public String home1() {
		   return "admin";
	   }
   @GetMapping("/admin1")
     
	   public String adprocess(HttpServletRequest req,HttpServletResponse res) throws IOException {
	   
			 String name=req.getParameter("username");
			 String pass=req.getParameter("userpass");
			 System.out.println(name);
			 if(name.equals("Praveen") && pass.equals("Pradeepa@321")) {
				System.out.println("Success");
			 	//res.sendRedirect("Admin");
			 }else
				 System.out.println("Fails");
			return "adminprocess";
				
   }  
   @GetMapping("/")
   public String home() {
	   return "index";
   }
   @GetMapping("/register")
   public String register() {
	   return "register";
   }
   @GetMapping("/registerprocess")
   public String registerprocess(HttpServletRequest request,HttpServletResponse response) throws Exception{
	  
	   String Name=request.getParameter("username");
	   System.out.println(Name);
	   String Pass=request.getParameter("userpass");
	   String Email=request.getParameter("useremail");
	   String Address=request.getParameter("useraddress");
	   String Country=request.getParameter("usercountry");
	   String Contact=request.getParameter("usercontact");
       //PrintWriter out=response.getWriter();
	  
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cityuser","root","Pradeepa@321");

	   String query="insert into cityuser values(?,?,?,?,?,?,?)";
	   PreparedStatement ps=con.prepareStatement(query);
	   ps.setInt(1,4);//
	   ps.setString(6,Name);
	   ps.setString(7,Pass);
	   ps.setString(5,Email);
	   ps.setString(2,Address);
	   ps.setString(4,Country);
	   ps.setString(3,Contact);

	   int status=ps.executeUpdate();
	   if(status>0){
	   System.out.println("Record Inserted Successfull!!!!");
	   }
  
	   return "index";
   }
   @GetMapping("/adminprocess")
   public String adminprocess() {
	   return "adminprocess";
   }
   @GetMapping("/save")
   public String save(HttpServletRequest request,HttpServletResponse response) throws Exception {
	   String Name = request.getParameter("username");
		System.out.println(Name);
		//String Password = request.getParameter("password");
		String Category = request.getParameter("category");
		String Email = request.getParameter("usermail");
		String Contact = request.getParameter("contact");
		String Address = request.getParameter("address");
		String City = request.getParameter("city");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cityuser","root","Pradeepa@321");
		PreparedStatement ps=con.prepareStatement("insert into citydetails values(?,?,?,?,?,?,?)");
			ps.setInt(1,4);
			ps.setString(7, Name);
			ps.setString(3, Category);
			ps.setString(6, Email);
			ps.setString(2, Address);
			ps.setString(4, City);
			ps.setString(5, Contact);
			
			int status = ps.executeUpdate();
			
			if(status>0){
				System.out.println("Record Inserted");
				}
	   return "adminsuccess";
   }
   
   @GetMapping("/adminsuccess")
   public String adminsuccess() {
	   return "adminsuccess";
   }
   @GetMapping("/login1")
   public String login1() {
	   return "loginform";
   }
   @GetMapping("/login")
   public String loginprocess(HttpServletRequest request,HttpServletResponse response) throws Exception {
	   
	
	   String Email=request.getParameter("useremail");
	   String Password=request.getParameter("userpass");
	   System.out.println(Email+" "+ Password);
	   boolean status=false;
	   
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cityuser","root","Pradeepa@321");

	   String query="select * from cityuser where Email=? and Password=?";
	   PreparedStatement ps=con.prepareStatement(query);
	   ps.setString(1,Email);
	   ps.setString(2,Password);

	   ResultSet rs=ps.executeQuery();
	   status=rs.next();
	   if(status){
		   System.out.println("record found..");
	   }
	   	   return "loginprocess";
   }
   @GetMapping("/loginprocess")
   public String post1() {
	   return "loginprocess";
   }
   @GetMapping("/postclassified")
   public String post() {
	   return "classified";
   }
   @GetMapping("/classifiedprocess")
   public String process() {
	   return "classifiedprocess";
   }
   @GetMapping("/viewclassified")
   public String view() {
	   return "viewclassified";
   }
}
