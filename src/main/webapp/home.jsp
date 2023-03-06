<%@page import="dto.UserInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Phone</th>
<th>Password</th>
<th>Country</th>
<th>Gender</th>
<th>Skills</th>
<th>Address</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<% List<UserInfo> list=(List<UserInfo>)request.getAttribute("list");
for(UserInfo user:list){%>
<tr>
<th><%=user.getId() %></th>
<th><%=user.getName() %></th>
<th><%=user.getMobile() %></th>
<th><%=user.getPassword() %></th>
<th><%=user.getCountry() %></th>
<th><%=user.getGender() %></th>
<th><%=user.getSkills() %></th>
<th><%=user.getAdress() %></th>
<th><a href="edit.jsp?id=<%=user.getId()%>"><button>Edit</button></a></th>
<th><a href="delete?id=<%=user.getId()%>"><button>Delete</button></a></th>
</tr>
<% } %>
</table>
</body>
</html>