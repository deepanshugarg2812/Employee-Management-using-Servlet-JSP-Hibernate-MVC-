<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page import="java.util.*"%>
<%@ page import="com.dao.Employee" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Add</title>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	</head>
	<body>
		
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
			<h2 class="text-center">Enter Employees Details</h2>
			
			<form method="post" action="addEmployee">
			  <div class="form-group">
			    <input type="text" class="form-control" name="name" placeholder="Enter name">
			  </div>
			  
			  <div class="form-group">
			    <input type="text" class="form-control" name="doj" placeholder="Enter Date of joining">
			  </div>
			  
			  <div class="form-group">
			    <input type="text" class="form-control" name="salary" placeholder="Enter salary">
			  </div>
			  
			  <div class="form-group">
			    <input type="text" class="form-control" name="address1" placeholder="Enter address lane1">
			  </div>
			  
			  <div class="form-group">
			    <input type="text" class="form-control" name="address2" placeholder="Enter address lane2">
			  </div>
			  
			  <div class="form-group">
			    <input type="text" class="form-control" name="city" placeholder="Enter city">
			  </div>
			  
			  <div class="form-group">
			    <input type="text" class="form-control" name="state" placeholder="Enter state">
			  </div>
			  
			  <div class="form-group">
			    <input type="text" class="form-control" name="country" placeholder="Enter country">
			  </div>
			  
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
		
	</body>
</html>