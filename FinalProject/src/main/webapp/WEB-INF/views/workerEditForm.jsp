<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formularz edycji pracownika</title>
</head>
<body>
	<h2>
		<center>FORMULARZ EDYCJI PRACOWNIKA</center>
	</h2>
	<br>

	<form method="post">
		<fieldset>
			<legend>DANE PERSONALNE</legend>
			<div>
				Imię: <br> <input type="text" name="firstName"
					placeholder="Imię"><br>
			</div>
			<div>
				Nazwisko: <br> <input type="text" name="lastName"
					placeholder="Nazwisko"><br>
			</div>
			<div>
				Numer telefonu: <br> <input type="text" name="phoneNumber"
					placeholder="Numer telefonu"><br>
			</div>
			<div>
				Email: <br> <input type="text" name="email" placeholder="Email"><br>
			</div>
			<div>
				Koszt roboczogodziny: <br> <input type="text"
					name="workHourCost" placeholder="Koszt roboczogodziny"><br>
			</div>

		</fieldset>
		<br>
		<div>
			<input type="submit" value="Edytuj pracownika" />
		</div>
	</form>
	<br>
	<br>
</body>
</html>