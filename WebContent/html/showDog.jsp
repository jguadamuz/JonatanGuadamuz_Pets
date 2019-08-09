<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dog</title>
<link rel="stylesheet" type="text/css" href="/Pets/css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
	<br>
	<p>
		You created a
		<c:out value="${dog.getBreed()}" />
		!
	</p>
	<br>
	<p>
		<c:out value="${dog.showAffection()}" />
	</p>

</body>
</html>