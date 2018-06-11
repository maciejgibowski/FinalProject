<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista zleceń</title>
</head>
<body>


	<h2>
		<center>LISTA WSZYSTKICH ZLECEŃ</center>
	</h2>
	<fieldset>
	<c:forEach items="${orders}" var="order">
          Numer ID zamówienia: <b><font size="5">${order.id}</font></b> <br>
          Data przyjęcia zamówienia: <b><font size="5">${order.dateOfAcceptance}</font></b> <br>
          Data planowanej naprawy: <b><font size="5">${order.plannedDateOfRepair}</font></b><br>
          Data naprawy: <b><font size="5">${order.dateOfRepair}</font></b><br>
          Przypisany pracownik: <b><font size="5">${order.assignedEmployee}</font></b><br>
          Opis problemu: <b><font size="5">${order.problemDescription}</font></b><br>
          Opis naprawy: <b><font size="5">${order.repairDescription}</font></b><br>
          Status naprawy: <b><font size="5">${order.statusType}</font></b><br>
          Koszt naprawy: <b><font size="5">${order.repairCost} </font></b><br>
          Marża: <b><font size="5">${order.markup} </font></b><br>
          Koszt użytych części: <b><font size="5">${order.componentsCost}</font></b><br>
          Ilość roboczogodzin: <b><font size="5">${order.amountOfWorkHours}</font></b><br>
		<br>
	</c:forEach>
	</fieldset>
	<br>
	<a href="<c:url value='/control/controlPanel'/>">Wróć do strony głównej</a>

</body>
</html>