<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
<title>Add a pet!</title>
<link rel="stylesheet" type="text/css" href="/Pets/css/style.css">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

	<h1>Create a Dog</h1>
	<form action="animals/dog" method="get">
		<div>
			<label for="name">Name:</label> <input type="text" id="name"
				name="name">
		</div>
		<div>
			<label for="breed">Breed:</label> <input type="text" id="breed"
				name="breed">
		</div>
		<div>
			<label for="weight">Weight:</label> <input id="weight" name="weight"></input>
		</div>
		<div class="button">
			<button type="submit">Create Dog</button>
		</div>
	</form>

	<h1>Create a Cat</h1>
	<form action="animals/cat" method="get">
		<div>
			<label for="name">Name:</label> <input type="text" id="name"
				name="name">
		</div>
		<div>
			<label for="breed">Breed:</label> <input type="text" id="breed"
				name="breed">
		</div>
		<div>
			<label for="weight">Weight:</label> <input id="weight" name="weight"></input>
		</div>
		<div class="button">
			<button type="submit">Create Cat</button>
		</div>
	</form>


</body>
</html>