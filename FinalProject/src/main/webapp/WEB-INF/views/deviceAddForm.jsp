<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/
		html; charset=UTF-8">
<title>Lista urządzeń klienta</title>
</head>
<body>
	<h2>
		<center>LISTA DOTYCHCZASOWYCH URZĄDZEŃ KLIENTA:</center>
	</h2>
	<br>
	<fieldset>
			<legend>DANE TECHNICZNE URZĄDZENIA</legend>
	<c:forEach items="${devices}" var="device">
         Numer ID urządzenia: <b><font size="5">${device.id}</font></b> <br>
         Marka urządzenia: <b><font size="5">${device.brand}</font></b> <br>
         Model urządzenia: <b><font size="5">${device.model}</font></b> <br>
         Numer seryjny: <b><font size="5">${device.serialNumber}</font></b> <br>
         Rodzaj urządzenia: <b><font size="5">${device.deviceType}</font></b> <br>
         <br>
		<a href="<c:url value='/order/orderAddForm/${device.id}'/>">Zlecenie
			naprawy</a>
		<br>
	</c:forEach>
	</fieldset>
	<br>
	<h3>
		<center>Jeśli urządzenia nie ma na liście, dodaj je:</center>
	</h3>
	<form:form method="post" modelAttribute="device">
		<fieldset>
			<legend>Dane techniczne urządzenia</legend>
			<div>
				Marka urządzenia: <br><input type="text" name="brand"
					placeholder="Marka urządzenia"><br>
			</div>
			<div>
				Model urządzenia: <br><input type="text" name="model"
					placeholder="Model urządzenia"><br>
			</div>
			<div>
				Serial Number: <br><input type="text" name="serialNumber"
					placeholder="Numer seryjny"><br>
				<div>
					DeviceType: <br><form:select path="deviceType" multiple="true"
						items="${deviceType}" itemValue="id" itemLabel="deviceType" />
				</div>
		</fieldset>
		<div>
		<br>
		<input type="submit" value="Dodaj urządzenie" />
	</div>
	</form:form>
	
</body>
</html>