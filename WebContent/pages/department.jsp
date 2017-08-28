<%@page import="java.util.List"%>
<%@page import="com.imcs.raghu.bonus.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="js/emp.js"></script>
</head>
<body>

	<div class="container">
	<table class="table">
		<tr>
		 <th>Employee No</th><th>Department No</th><th>Date of Birth</th><th>Date of Joining</th><th>Salary</th>
		</tr>
		<c:forEach items="${requestScope.employees}" var="emp" >
            <tr>      
               
                <td>${emp.empNo}</td>
                <td>${emp.deptNo}</td>
                <td>${emp.dob}</td>
                <td>${emp.doj}</td>  
                <td>${emp.salary}</td>
            </tr>
       </c:forEach>
		
	
	</table>
	
	</div>
</body>
</html>