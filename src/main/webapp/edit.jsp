<%@page import="dto.UserInfo"%>
<%@page import="dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int id=Integer.parseInt(request.getParameter("id"));
UserDao dao=new UserDao();
UserInfo info=dao.fetch(id);
%>

<h1>Enter Your Details</h1>
	<form action="update" method="post">
		<table>
			<tr>
			<th>Id: </th>
			<td><input type="text" value="<%=info.getId() %>" readonly="readonly" name="id"></td>
				<th>Name</th>
				<td><input type="text" value="<%=info.getName() %>" name="name"></td>
			</tr>
			<th>Mobile</th>
			<td><input type="tel" value="<%=info.getMobile() %>" name="mob" pattern="[0-9]{10}"></td>
			</tr>

			<th>Email</th>
			<td><input type="email" value="<%=info.getEmail() %>" name="email" required="required"></td>
			</tr>

			<th>Password</th>
			<td><input type="password" value="<%=info.getPassword() %>" name="pwd"></td>
			</tr>

			<th>date of birth</th>
			<td><input type="date" value="<%=info.getDob() %>" name="dob"></td>
			</tr>

			<th>Gender:</th>
            <%if(info.getGender().equals("Mail")){ %>
            <td><input type="radio" name="gender" checked="checked" value="Mail">Male
         	<input type="radio" name="gender" value="Female">Female</td>
            <%}else{ %>
            <td><input type="radio" name="gender"  value="Mail">Male
	        <input type="radio" name="gender" checked="checked" value="Female">Female</td>
            <%} %>	
			
			</tr>

			<th>Address:</th>
			<td><textarea rows="5" cols="30" value="<%=info.getAdress() %>" name=address></textarea></td>
			</tr>

			<th>Country:</th>
			<%if(info.getCountry().equals("Country")) %>
				<option>India</option>
				<option>Australia</option>
				<option>US</option>
				<option>Uganda</option>
				<option>Russia</option>
				<option>Switzerland</option>
			</select>
			</tr>

			<th>Skills</th>
			<td><input type="checkbox" value="<%=info.getSkills() %>" name="skills">Leadership <input
				type="checkbox" name="skills">Team Player <input
				type="checkbox" name="skills">Quick Learner
			</tr>
			<tr>
				<td>
					<button>Submit</button>
				</td>
				<td>
					<button>Cancel</button>
				</td>
		</table>
	</form>
</body>
</html>