<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
	    <title>My Project</title>
	</head>
	
	<form action="<c:url value='/login'/>" method="post">
		Username <input type="text" name="username">
		<br/>
		<button type="submit">Login</button>
	</form>

</html>