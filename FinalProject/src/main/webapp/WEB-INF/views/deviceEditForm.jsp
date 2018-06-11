<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/
		html; charset=UTF-8">
<title>Formularz edycji urządzenia</title>
</head>
<body>
	<h2>
		<center>Edytuj urządzenie:</center>
	</h2>
	<form:form method="post" modelAttribute="device">
		<fieldset>
			<legend>DANE TECHNICZNE URZĄDZENIA:</legend>
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
	</form:form>
	<br>
	<div>
		<input type="submit" value="Edytuj urządzenie" />
	</div>

</body>
</html>