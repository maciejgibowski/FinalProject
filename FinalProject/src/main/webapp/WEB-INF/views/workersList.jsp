<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista pracowników</title>
</head>
<body>

	<h2>
		<center>LISTA PRACOWNIKÓW</center>
	</h2>
<fieldset>
	<c:forEach items="${workers}" var="worker">
        Imię i nazwisko: <b><font size="5">${worker.firstName} ${worker.lastName}</font></b> <br>
        Numer telefonu: <b><font size="5">${worker.phoneNumber} </font></b><br>
        Email: <b><font size="5">${worker.email} </font></b><br>
        Koszt roboczogodziny: <b><font size="5">${worker.workHourCost} </font></b><br>

		<a href="<c:url value='/worker/workerEditForm/${worker.id}'/>">Edytuj
			pracownika</a>
		<a href="<c:url value='/worker/delete/${worker.id}'/>">Usuń
			pracownika</a>
		<br>
		<br>
	</c:forEach>
</fieldset>
	<br>
	<a href="<c:url value='/control/controlPanel'/>">Wróć do strony
		głównej</a>
</body>
</html>


