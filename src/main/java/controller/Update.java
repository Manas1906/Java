package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.UserInfo;

@WebServlet("/update")
public class Update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

				String name=req.getParameter("Name");
				String mobile=req.getParameter("Mobile");
				String email=req.getParameter("Email");
				String password=req.getParameter("pwd");
				Date date=Date.valueOf(req.getParameter("dob"));     
		     	String gender=req.getParameter("Gender");
				String address=req.getParameter("Address");
				String country=req.getParameter("Country");
				String[] skills=req.getParameterValues("Skills");
			
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
			    info.setId(Integer.parseInt(req.getParameter("id")));
				
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
				
				UserDao dao=new UserDao();
				dao.update(info);
				
				req.setAttribute("list", dao.fetchAll());
				resp.getWriter().print("<h1>data updated successfully</h1>");
				req.getRequestDispatcher("home.jsp").include(req, resp);
			}
}
