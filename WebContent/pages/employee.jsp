<%@page import="com.imcs.raghu.bonus.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="js/emp.js"></script>
</head>
<body>
	<%
		Employee e = (Employee) request.getAttribute("employee");
	%>
	<div class="container">
		<div class="panel panel-primary padding-top-20">
			<div class="panel-heading">Employee</div>
			<div class="panel-body">
				<div class="row" style="padding-top: 10px">
					<label class="col-md-4 control-label">Employee Id : </label> <label
						class="col-md-8 control-label"><%=e.getEmpNo()%></label>
				</div>
				<div class="row" style="padding-top: 10px">
					<label class="col-md-4 control-label">Department No : </label> <label
						class="col-md-8 control-label"><%=e.getDeptNo()%></label>
				</div>
				<div class="row" style="padding-top: 10px">
					<label class="col-md-4 control-label">Date of Birth : </label> <label
						class="col-md-8 control-label"><%=e.getDob()%></label>
				</div>
				<div class="row" style="padding-top: 10px">
					<label class="col-md-4 control-label">Date of Joining : </label> <label
						class="col-md-8 control-label"><%=e.getDoj()%></label>
				</div>
				<div class="row" style="padding-top: 10px">
					<label class="col-md-4 control-label">Salary : </label> <label
						class="col-md-8 control-label"><%=e.getSalary()%></label>
				</div>
				
			</div>
		</div>
	</div>
</body>
</html>