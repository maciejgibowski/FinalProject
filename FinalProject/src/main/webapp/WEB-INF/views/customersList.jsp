<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista klientów</title>
</head>
<body>
<h2>
		<center>LISTA WSZYSTKICH KLIENTÓW</center>
	</h2>
	<fieldset>
	<c:forEach items="${customers}" var="customer">
        Imię i nazwisko: <b><font size="5">${customer.firstName} ${customer.lastName}</font></b> <br>
        Numer telefonu: <b><font size="5">${customer.phoneNumber}</font></b> <br>
        Email: <b><font size="5">${customer.email}</font></b> <br>

		<a href="<c:url value='/customer/customerEditForm/${customer.id}'/>">Edytuj
			klienta</a>
		<a href="<c:url value='/customer/delete/${customer.id}'/>">Usuń
			klienta</a>
		<br>
		<a href="<c:url value='/device/deviceAddForm/${customer.id}'/>">Dodaj
			urządzenie temu klientowi</a><br>
		<br>
	</c:forEach>
	</fieldset>
	<br>
	<br>
	<a href="<c:url value='/home/userSearch'/>">Wróć do strony
		głównej</a>

</body>
</html>