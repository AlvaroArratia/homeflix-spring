<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ver peliculas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>
	<div class="container">
		<h1 class="mt-4">Buscar peliculas</h1>
		<form class="row mt-5" action="">
			<div class="col">
				<label for="select-category" class="form-label">Categoria</label> <select
					class="col form-select" aria-label="Default select example"
					id="select-category">
					<option selected>Selecciona categoría</option>
					<c:forEach items="${categories}" var="category" varStatus="loop">
						<option value="${category.getId()}">${category.getName()}</option>
					</c:forEach>
				</select>
			</div>
			<div class="col">
				<label for="search-title" class="form-label">Títutlo</label> <input
					type="text" class="form-control" id="search-title"
					placeholder="Ingrese título...">
			</div>
			<div class="col d-flex align-items-end">
				<button type="button" class="btn btn-primary">Buscar</button>
			</div>
		</form>
		<table class="table table-striped table-hover mt-4 mb-5">
			<thead>
				<tr>
					<th scope="col">Categoria</th>
					<th scope="col">Id Pelicula</th>
					<th scope="col">Título</th>
					<th scope="col">Duración</th>
					<th scope="col">Rating</th>
					<th scope="col">Precio</th>
					<th scope="col">Duración arriendo</th>
					<th scope="col">Acción</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${films}" var="film" varStatus="loop">
					<tr>
						<td class="align-middle">
							<c:forEach items="${film.getCategories()}" var="category" varStatus="loop">
								${category.getName()}
							</c:forEach>
						</td>
						<td class="align-middle">${film.getId()}</td>
						<td class="align-middle">${film.getTitle()}</td>
						<td class="align-middle">${film.getLength()}</td>
						<td class="align-middle">${film.getRating()}</td>
						<td class="align-middle">${film.getRentalRate()}</td>
						<td class="align-middle">${film.getRentalDuration()}</td>
						<td class="align-middle">
							<button type="button" class="btn btn-outline-primary btn-sm">Ver</button>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

</html>