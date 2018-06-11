<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodaj zlecenie naprawy</title>
</head>
<body>
	<h2>
		<center>Dotychczasowa historia napraw/y urządzenia:</center>
	</h2>
	<c:forEach items="${ordersList}" var="order">
          Data przyjęcia: <b><font size="5">${order.dateOfAcceptance} </font></b><br>
          Opis problemu: <b><font size="5">${order.problemDescription} </font></b><br>
          Koszt naprawy: <b><font size="5">${order.repairCost} </font></b><br>
	</c:forEach>
	<br>
	<h3>
		<center>Dodaj nowe zlecenie naprawy:</center>

	</h3>

	<form:form method="post" modelAttribute="order">
		<fieldset>
			<div>
				Data przyjęcia: <br>
				<input type="text" name="dateOfAcceptance" placeholder="rrrr-mm-dd" />
			</div>
			<div>
				Planowana data naprawy: <br>
				<input type="text" name="plannedDateOfRepair"
					placeholder="rrrr-mm-dd" />
			</div>

			<!--  <div>Przypisany pracownik<input type="text" name="assignedEmployee"/></div>  -->
			<div>
				Opis problemu: <br>
				<form:textarea cols="25" rows="4" path="problemDescription"
					placeholder="Opis problemu" />
			</div>
			<div>
				Status zamówienia: <br>
				<form:select path="statusType" multiple="true" items="${statusType}"
					itemValue="id" itemLabel="statusType" />
			</div>

		</fieldset>
		<div>
			<input type="submit" value="Dodaj zlecenie" />
		</div>
	</form:form>

</body>
</html>