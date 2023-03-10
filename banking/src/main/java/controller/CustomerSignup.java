package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
//import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customersignup")
public class CustomerSignup extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String mobile=req.getParameter("mobile");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	String gender=req.getParameter("gender");
	String dob=req.getParameter("dob");
	
	Date date=Date.valueOf(dob);
	Period.between(date.toLocalDate(), LocalDate.now());
	int age=Period.between(date.toLocalDate(), LocalDate.now()).getYears();
	if(age<18)
	{
		resp.getWriter().print("<h1>You have to be 18+ to create a bank account</h1>");
		req.getRequestDispatcher("Signup.html").include(req, resp);
	}
	else {
		
	}
	
//	resp.getWriter().print("<h1>"+name+"</h1>"
//			+"<h1>"+mobile+"</h1>"
//			+"<h1>"+email+"</h1>"
//			+"<h1>"+gender+"</h1>"
//			+"<h1>"+dob+"</h1>"
//			+"<h1>"+password+"</h1>"
//			);
	}
}
