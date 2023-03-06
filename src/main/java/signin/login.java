package signin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dto.UserInfo;

@WebServlet("/login")
public class login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		String emph=req.getParameter("emph");
		String password=req.getParameter("pwd");
		
		
		UserDao dao=new UserDao();
		PrintWriter out=resp.getWriter();
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		
		List<UserInfo> list=dao.fetchAll();
		
		try {
			long mobile=Long.parseLong(emph);
			UserInfo info=dao.fetch(mobile);
			if(info==null)
			{
				resp.getWriter().print("<h1>Invalid Mobile No</h1>");
			}
			else
			{
				if(info.getPassword().equals(password))
				{
					resp.getWriter().print("<h1>Login Success<h1>");
//					out.print("<h1>Login Success</h1>");
//					out.print("<table border='1px'>");
//					out.print("<tr>");
//					out.print("<th>Id</th>");
//					out.print("<th>Name</th>");
//					out.print("<th>Email</th>");
//					out.print("<th>Password</th>");
//					out.print("<th>Mobile</th>");
//					out.print("<th>Adress</th>");
//					out.print("<th>age</th>");
//					out.print("<th>Country</th>");
//					out.print("<th>Skills</th>");
//					out.print("</th>Dob</th>");;
//					
//					
//					for(UserInfo info1:list)
//					{
//						out.print("<tr>");
//						out.print("<th>"+info1.getId()+"</th>");
//						out.print("<th>"+info1.getName()+"</th>");
//						out.print("<th>"+info1.getEmail()+"</th>");
//						out.print("<th>"+info1.getPassword()+"</th>");
//						out.print("<th>"+info1.getMobile()+"</th>");
//						out.print("<th>"+info1.getAdress()+"</th>");
//						out.print("<th>"+info1.getAge()+"</th>");
//						out.print("<th>"+info1.getCountry()+"</th>");
//						out.print("<th>"+info1.getSkills()+"</th>");
//						out.print("<th>"+info1.getDob()+"</th>");
//						
//						
//						out.print("</tr>");
						
//					}
//					out.print("</table>");
					req.setAttribute("list", list);
					req.getRequestDispatcher("home.jsp").include(req, resp);
				}
				else
				{
					out.print("<h1>Invalid Password</h1>");
					req.getRequestDispatcher("login.html").include(req, resp);
				}
			}
			
		} 
		catch (NumberFormatException e) 
		{
			String email = emph;
			
				}
			}
	}

