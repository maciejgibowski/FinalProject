<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Panel menagera</title>
</head>
<body>
	<h2>
		<center>Zalogowałaś/eś się jako menager. To Twój główny panel
			sterowania.</center>
	</h2>

	<form:form method="post">

		<div>
			Wyszukaj pracownika w bazie danych: <input type="text" name="search"
				placeholder="Szukaj pracownika" /> <input type="submit"
				value="Szukaj pracownika" />
		</div>

		<br>
	</form:form>

	<a href="<c:url value='/control/allWorkers'/>">Lista wszystkich
		pracowników<br>
	</a>

	<br>
	<a href="<c:url value='/control/allOrders'/>">Lista wszystkich
		zleceń</a>
	<br>
	<br>
	<a href="<c:url value='/control/allDevices'/>">Lista wszystkich
		urządzeń</a>
	<br>
	<br>
	<a href="<c:url value='/wyloguj/logout'/>">Wyloguj się</a>

</body>
</html>