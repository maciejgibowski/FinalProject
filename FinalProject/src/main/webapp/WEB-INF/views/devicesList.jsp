<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista wszystkich urządzeń</title>
</head>
<body>
	<h2>
	<center>Lista wszystkich urządzeń</center>
	</h2>
	<fieldset>
	<c:forEach items="${devices}" var="device">
          Numer ID urządzenia: <b><font size="5">${device.id}</font></b> <br>
          Marka urządzenia: <b><font size="5">${device.brand}</font></b> <br>
          Model urządzenia: <b><font size="5">${device.model}</font></b> <br>
          Numer seryjny: <b><font size="5">${device.serialNumber}</font></b> <br>
          Rodzaj urządzenia: <b><font size="5">${device.deviceType} </font></b><br>
<br><br>
	</c:forEach>
	</fieldset>
<br>
	<a href="<c:url value='/control/controlPanel'/>">Wróć do strony głównej</a>

</body>
</html>