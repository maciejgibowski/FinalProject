<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pracownik obsługi</title>
</head>
<body>
	<h2>
		<center>Zalogowałaś/eś się jako pracownik obsługi. To Twój
			panel sterowania.</center>
	</h2>
	<form method="post">
		<br>
		<div>
			Wyszukaj klienta w bazie:<input type="text" name="search" /> <input
				type="submit" value="Wyszukaj klienta" placeholder="Wyszukaj klienta"/>
		</div>
	</form>
	
<br>
<a href="<c:url value='/control/allCustomers'/>">Lista wszystkich klientów<br></a>
<br>
<a href="<c:url value='/control/allWorkers'/>">Lista wszystkich pracowników<br></a>
	<br>
	<a href="<c:url value='/wyloguj/logout'/>">Wyloguj się</a>

		<br> <br>
</body>
</html>