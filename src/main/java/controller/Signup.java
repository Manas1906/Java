package controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.UserDao;
import dto.UserInfo;



		@WebServlet("/signup")
		public class Signup extends GenericServlet{

			
			@Override
			public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
				
////				res.getWriter().print("<h1> Iam Signup</h1>");
////				String s=req.getParameter("Name");
////				res.getWriter().println(s);
//				String a=req.getParameter("mobile");
////				res.getWriter().println(a);
//				String b=req.getParameter("email");
////				res.getWriter().println(b);
//				String v=req.getParameter("password");
////				res.getWriter().println(v);
//
//		     Date d=Date.valueOf(req.getParameter("dob"));
////		     res.getWriter().println(d);
//		     
//		     String n=req.getParameter("gender");
////				res.getWriter().println(n);
//				String g=req.getParameter("adress");
////				res.getWriter().println(g);
//				String m=req.getParameter("country");
////				res.getWriter().println(m);
//				String[] l=req.getParameterValues("skills");
////				res.getWriter().println(l);
//			
				Date date=Date.valueOf(req.getParameter("dob"));
				UserInfo info=new UserInfo();
			
				info.setGender(req.getParameter("gender"));
				info.setMobile(Long.parseLong(req.getParameter("mob")));
				info.setDob(date);
				info.setName(req.getParameter("name"));
				info.setAdress(req.getParameter("address"));
				info.setSkills(req.getParameterValues("skills"));
				info.setCountry(req.getParameter("country"));
			    info.setEmail(req.getParameter("email"));
			    info.setPassword(req.getParameter("pwd"));
	
			    

			    info.setAge(Period.between(date.toLocalDate(),LocalDate.now()).getYears());
			    
			    UserDao dao=new UserDao();
			    dao.save(info);
				
			    res.getWriter().print("<h1>Account Created Successfully</h1>");
			    
			    
			    req.getRequestDispatcher("login.html").include(req, res);
			    
//				res.getWriter().println("<h1>"
//						+ "<br>Name: "+s
//						+ "<br>Phone: "+a
//						+ "<br>Email: "+b
//						+ "<br>Password: "+v
//						+ "<br>Date: "+d
//						+ "<br>Gender: "+n
//						+ "<br>Address: "+g
//						+ "<br>Country: "+m
//						+ "<br>Skills: "+Arrays.toString(l)
//						+ "</h1>");
			}

		}
