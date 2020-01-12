<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome 
</br>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="li" items="${requestScope.list}">
Name: ${li.name}</br>
Username: ${li.username}</br>
Age: ${li.age}</br>
gender: ${li.gender}</br>



</c:forEach>
</body>
</html>