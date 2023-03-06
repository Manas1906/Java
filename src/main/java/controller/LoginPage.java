//package controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Date;
//import java.util.Arrays;
//
//import javax.servlet.GenericServlet;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.catalina.connector.Response;
//
//import dao.UserDao;
//import dto.UserInfo;
//
//@WebServlet("/login")
//public class LoginPage extends HttpServlet{
//
//	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//	
////		super.doPost(req, resp);
//	
////		
////		String name = req.getParameter("name");
////		long mobile =Long.parseLong(req.getParameter("mob"));
////		String email = req.getParameter("email");
////		String password = req.getParameter("password");
////		Date dob =Date.valueOf(req.getParameter("dob"));
////		String gender = req.getParameter("gen");
////		String adress = req.getParameter("adress");
////		String country = req.getParameter("country");
////		String[] skills = req.getParameterValues("skills");
//
//
////		res.getWriter().print("<h1>"
////				+ "<br>Name: "+name
////				+ "<br>Mobile :"+mobile
////				+ "<br>Email: "+email.
////				+ "<br>Password: "+password
////				+ "<br>Date: "+dob
////				+ "<br>Gender: "+gender
////				+ "<br>Adress: "+adress
////				+ "<br>Country: "+country
////				+ "<br>Skills: "+Arrays.toString(skills) 
////				+ "</h1>");
//		
////		UserInfo userinfo = new UserInfo();
////		userinfo.setName(name);
////		userinfo.setMobile(mobile);
////		userinfo.setEmail(email);
////		userinfo.setPassword(password);
////		userinfo.setDob(dob);
////		userinfo.setGender(gender);
////		userinfo.setAdress(adress);
////		userinfo.setCountry(country);
////		userinfo.setSkills(skills);
//		String emph=req.getParameter("emph");
//		String password=req.getParameter("pwd");
//		
//		
//		UserDao dao=new UserDao();
//		PrintWriter out=res.getWriter();
//		
//		try {
//			long mobile=Long.parseLong(emph);
//			UserInfo info=dao.fetch(mobile);
//			if(info==null)
//			{
//				res.getWriter().print("<h1>Invalid Mobile No</h1>");
//				req.getRequestDispatcher("login.html").include(req, res);
//			}
//			else
//			{
//				if(info.getPassword().equals(password))
//				{
//					res.getWriter().print("<h1>Login Success<h1>");
//				}
//				else
//				{
//					res.getWriter().print("<h1>Invalid Password</h1>");
//				}
//			}
//			
//		} 
//		catch (NumberFormatException e) 
//		{
//			String email = emph;
//			UserInfo info=dao.fetch(email);
//			if(info==null)
//			{
//				res.getWriter().print("<h1>Invalid Email</h1>");
//				req.getRequestDispatcher("login.html").include(req, res);
//			}
//			else
//			{
//				if(info.getPassword().equals(password))
//				{
//					res.getWriter().print("<h1>Login Success<h1>");
//				}
//				else
//				{
//					res.getWriter().print("<h1>Invalid Password</h1>");
//					req.getRequestDispatcher("login.html").include(req, res);
//				}
//			}
//			
//		} 
//	}
//}
