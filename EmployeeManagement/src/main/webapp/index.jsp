<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page import="java.util.*"%>
<%@ page import="com.dao.Employee" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home</title>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	</head>
	<body>
	
		<!-- When page loads for the first time redirect the user to the all employees servlet  -->
		<%!
			List<Employee> list = null;
		%>
		<%
			/* Send the request to the all employees servlet and print the result */
			if(request.getAttribute("list")==null){
				request.getRequestDispatcher("all").forward(request,response);
				list = (List) request.getAttribute("list");
			}
			else{
				list = (List) request.getAttribute("list");
			}
			int count = 2;
		%>
		
		
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		  <a class="navbar-brand" href="#">Employee Management</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarNav">
		    <ul class="navbar-nav ml-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="search.jsp">Search <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="add.jsp">Add <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="delete.jsp">Delete <span class="sr-only">(current)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
		
		<div class="container">
			<h2 class="text-center">All Employees List</h2>
		</div>
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">Employee ID</th>
		      <th scope="col">Name</th>
		      <th scope="col">Date of joining</th>
		      <th scope="col">Salary</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${list }" var="i">
		  		<tr>
		  			<th><c:out value="${i.getId()}" /></th>
			  		<th><c:out value="${i.getName()}" /></th>
			  		<th><c:out value="${i.getDoj()}" /></th>
			  		<th><c:out value="${i.getSalary()}" /></th>
		  		</tr>
		  	</c:forEach>
		  </tbody>
		</table>
	</body>
</html>