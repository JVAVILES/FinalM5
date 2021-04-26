<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
	<jsp:include page="head.jsp">
		<jsp:param value="Contacto" name="titulo"/>
	</jsp:include>
	
 	<br>
	<section>
		<h1 class="tituloPrincipal">Contacto</h1>
		<div class="contenido formularios">
			<form action="/contacto/contactoLog" method="post" id="formContacto">
				<div class="label-input">
					<label for="nombre" class="form-label">Nombre* :</label> <input
						type="text" id="nombre" name="nombre">
				</div>
				<div class="label-input">
					<label for="mail" class="form-label">Correo Electronico* :</label>
					<input type="text" id="mail" name="mail">
				</div>

				<div class="label-input">
					<label for="telefono" class="form-label">Telefono*
						[+569XXXXXXXX] :</label> <input type="text" id="
						telefono"
						name="telefono">
				</div>
				<div class="label-input">
					<label for="mensaje" class="form-label">Mensaje* :</label> <input
						type="text" id="mensaje" name="mensaje">
				</div>
				<div class="label-input">
					<label for="genero" class="form-label">Genero* :</label> <select
						id="genero" name="genero">
						<option value=""></option>
						<option value="1">Hombre</option>
						<option value="2">Mujer</option>
					</select>
				</div>
				<div class="label-input">
					<label for="nose" class="form-label">(*) Datos obligatorios</label>
					<input class="submit" type="submit" value="Enviar">
				</div>
			</form>
		</div>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
