<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserServlet" method="post"/>
	Name<input name="name" id="name" placeholder="fullname"/></br>
	Username<input name="usr" id="usr"/></br>
	Password<input name="pwd" id="pwd" /></br>
	Gender<input type="radio" name="gender" id="gender" value="ml" />Male
	<input type="radio" name="gender" id="gender" value="fl"/>Female</br>
	Age<input name="age" name="age" id="age" /></br>
	<input type="submit" value="submit"/></br>
</form>


</body>
</html>