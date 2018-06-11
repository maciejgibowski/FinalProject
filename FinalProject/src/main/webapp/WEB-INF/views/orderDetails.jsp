<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Szczegóły zlecenia</title>
</head>
<body>

	<h2>
	<center>Szczegóły zlecenia</center>
	</h2>
<fieldset>
<legend>SZCZEGÓŁY ZLECENIA</legend>
		 Numer zlecenia: <b><font size="5">${order.id}</font></b> <br> 
		 Data przyjęcia do naprawy: <b><font size="5">${order.dateOfAcceptance}</font></b> <br>
		 Opis uszkodzenia: <b><font size="5">${order.problemDescription}</font></b> <br>
		 </fieldset>
	<br>
	<h2><center>Historia napraw:</center></h2>
	<br>
	<fieldset>
	<c:forEach items="${orders}" var="orders">
         Data naprawy: <b><font size="5">${orders.dateOfRepair}</font></b> <br> 
         <br>
         Opis naprawy: <b><font size="5">${orders.repairDescription}</font></b> <br>
         <br>
	</c:forEach>
</fieldset>
	<br>
	<form:form method="post" modelAttribute="order">
<fieldset>
<legend>SZCZEGÓŁY NAPRAWY</legend>
		<div>
			Data naprawy: <br>
			<input type="text" name="dateOfRepair" placeholder="rrrr-mm-dd"/>
		</div>
		<div>
			Opis naprawy:<br>
			<textarea cols="35" rows="5" name="repairDescription">
			</textarea>
		</div>
		<div>
			Koszt naprawy: <br>
			<input type="text" name="repairCost" placeholder="Koszt naprawy"/>
		</div>
		<div>
			Ilość godzin: <br>
			<input type="text" name="amountOfWorkHours" placeholder="Ilość godzin"/>
		</div>
		<div>Status zamówienia: <br>
<form:select path="statusType" multiple="true" items="${statusType}" itemValue="id" itemLabel="statusType"/>
</div>
</fieldset>
<br>
		<div>
			<input type="submit" value="Dodaj szczegóły naprawy"/>
		</div>
	</form:form>

	<br>
	<a href="<c:url value='/serviceman/servicemanPanel'/>">Wróć do strony głównej</a>
</body>
</html>

