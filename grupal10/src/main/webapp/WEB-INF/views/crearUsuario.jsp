<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
	<jsp:include page="head.jsp">
		<jsp:param value="Contacto" name="titulo"/>
	</jsp:include>
	
 	<br>
	<section>
		<h1 class="tituloPrincipal">Crear Usuario</h1>
		<div class="contenido formularios">
			<form action="/usuario/crearUsuario" method="post" id="formUsuario">
				<div class="label-input">
					<label for="runusuario" class="form-label">RUN* :</label> <input
						type="number" id="runusuario" name="userRun">
				</div>
				<div class="label-input">
					<label for="usnombre" class="form-label">Nombre* :</label>
					<input type="text" id="usnombre" name="userNombre">
				</div>
				<div class="label-input">
					<label for="usapellido" class="form-label">Apellido* :</label>
					<input type="text" id="usapellido" name="userApellido">
				</div>
				<div class="label-input">
					<label for="usnacimiento" class="form-label">Fecha de Nacimiento* :</label>
					<input	type="text" id="usnacimiento" name="userFeNaci">
				</div>
				<div class="label-input">
					<label for="fechaNacimiento" class="form-label">Tipo de usuario</label>
					<select id="perfil" name="tipoUsuario">
						<option value="0"></option>
						<option value="1">Cliente</option>
						<option value="2">Profesional</option>
						<option value="3">Administrativo</option>
					</select>
				</div>
				<div id="cliente" class="label-input">
					<h3>Datos de Cliente</h3>
					<label for="clitelefono" class="form-label">Telefono:</label>
					<input type="text" id="clitelefono" name="cliTelefono">
					<label for="cliafp" class="form-label">Afp:</label>
					<input type="text" id="cliafp" name="cliAfp">
					<label for="clisistemasalud" class="form-label">Sistema de salud:</label>
					<select id="clisistemasalud" name="cliSistemaSalud">
						<option value="0"></option>
						<option value="1">Fonasa</option>
						<option value="2">Isapre</option>		 
					</select>
					<label for="clidireccion" class="form-label">Direccion:</label>
					<input type="text" id="clidireccion" name="cliDireccion">
					<label for="clicomuna" class="form-label">Comuna:</label>
					<input type="text" id="clicomuna" name="cliComuna">
					<label for="cliedad" class="form-label">Edad:</label>
					<input type="number" id="cliedad" name="cliEdad">
 				</div>
 				<div id="profesional" class="label-input">
					<h3>Datos de Profesional</h3>
					<label for="protelefono" class="form-label">Telefono :</label>
					<input type="text" id="protelefono" name="proTelefono">
					<label for="protitulo" class="form-label">Titulo :</label>
					<input type="text" id="protitulo" name="proTitulo">
					<label for="proproyecto" class="form-label">Proyecto :</label>
					<input type="text" id="proproyecto" name="proProyecto">
 				</div>
 				<div id="administrativo" class="label-input">
					<h3>Datos de Administrativo</h3>
					<label for="adcorreo" class="form-label">Correo :</label>
					<input type="text" id="adcorreo" name="admCorreo">
					<label for="adarea" class="form-label">Area :</label>
					<input type="text" id="adarea" name="admArea">
 				</div>
				<div class="label-input">
					<label for="nose" class="form-label">(*) Datos obligatorios</label>
					<input class="submit" type="submit" value="Enviar">
				</div>
			</form>
		</div>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>