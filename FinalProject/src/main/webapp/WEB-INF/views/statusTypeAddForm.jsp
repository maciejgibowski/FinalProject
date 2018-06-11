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

	Status urządzenia
	<br>
	<br>
	<br>
	Jeśli nie ma statusu urządzenia na liście, dodaj je:

	<form:form method="post" modelAttribute="statusType">

		<div>
			Rodzaj statusu<input type="text" name="statusType" />
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