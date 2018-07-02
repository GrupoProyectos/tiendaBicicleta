<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charsert="UTF-8">
<title>Cat�logo</title>
<link rel="stylesheet" href="Recursos/css/bootstrap.min.css">
<link rel="stylesheet" href="Recursos/css/estilos.css">
</head>

<body class="fondocatalogo">
	<div class="container-fluid fixed-top">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark container ">
		<nav class="navbar navbar-light bg-dark "> <a
			class="navbar-brand" href="#"> <img src="#" width="30"
			height="30" class="d-inline-block align-top" alt=""> LucaBic
		</a> </nav>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto text-center ">
				<li class="nav-item active"><a
					class="nav-link text-light font-weight-bold"
					href="./Bicicleta.html">HOME <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item">
					<form method="post" action="SelectBici">
						<input type="hidden" name="peticion" value="getCatalogo">
						<input
							class="nav-link dropdown-toggle text-light font-weight-bold border border-dark bg-dark"
							type="submit" value="CATALOGO">
					</form>
				</li>

				<li class="nav-item"><a
					class="nav-link text-light font-weight-bold" href="#">CONTACTO</a>
				</li>
				<li class="nav-item"><a
					class="nav-link text-light font-weight-bold" href="#">FAQ</a></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle text-light" href="#"
					id="navbarDropdown" role="button" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> AREA TECNICA </a>
					<div class="dropdown-menu bg-dark" aria-labelledby="navbarDropdown">
						<a class="dropdown-item text-light font-weight-bold" href="#">Iniciar
							Sesi�n</a>
						<div class="dropdown-divider text-light font-weight-bold"></div>
						<a class="dropdown-item text-light font-weight-bold" href="#">Registrarse</a>
					</div></li>
			</ul>
		</div>
		</nav>
	</div>


	<div id="Indicators" class="card container-fluid  pt-4 w-50"
		style="width: 18rem;">
		<div class="card-body">

			<h4 class="card-title">Marca: ${bicicleta.marca}</h4>
			<h5 class="card-subtitle">Modelo: ${bicicleta.modelo}</h5>
			<h6 class="card-text">Categoria: ${bicicleta.categoria}</h6>
			<h6 class="card-text">Talla: ${bicicleta.talla}</h6>
			<h6 class="card-text">Precio: ${bicicleta.precio}</h6>
		</div>
	</div>





	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
		integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
		crossorigin="anonymous"></script>
</body>

</html>
