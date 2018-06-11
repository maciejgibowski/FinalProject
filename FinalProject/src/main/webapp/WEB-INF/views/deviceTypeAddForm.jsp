<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/
		html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	Lista urządzeń Klienta:

	<br>
	<br>
	<br>
	<!--  <c:forEach items="${devices}" var="device">
          ${device.id} ${device.brand} ${device.model}  ${device.serialNumber}  ${device.deviceType} 
          <a href="<c:url value='/order/orderAddForm/${device.id}'/>">Zlecenie naprawy</a><br>
        </c:forEach> -->
	<br>
	<br>
	<br>
	Jeśli nie ma rodzaju urządzenia na liście, dodaj je:

	<form:form method="post" modelAttribute="deviceType">

		<div>
			Typ urządzenia<input type="text" name="deviceType" />
		</div>
	
		<div>
			<input type="submit" />
		</div>
	</form:form>

	<br>
	<br>
	<br>


	<a href="<c:url value='/home/userSearch'/>">Home</a>

	<br>
	<br>
	<br>

</body>
</html>