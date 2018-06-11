<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Panel serwisanta</title>
</head>
<body>
	<h2>
		<center>Zalogowałaś/eś się jako serwisant. To Twój panel
			sterowania.</center>
	</h2>
	<br>
	<br>
	<form:form method="post" modelAttribute="order">

		<div>
			Znajdź urządzenie po numerze zlecenia<input type="text"
				name="orderNumber" />
				<input type="submit" value="Szukaj" />
		</div>
	</form:form>
	<br>
	<br>
	<br>
	<a href="<c:url value='/authorization/login'/>">Wyloguj się</a>

</body>
</html>