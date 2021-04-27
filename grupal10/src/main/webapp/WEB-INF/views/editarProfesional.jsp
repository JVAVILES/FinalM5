<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="False"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<jsp:include page="head.jsp">
	<jsp:param value="Contacto" name="titulo"/>
</jsp:include>
 	<br>
	<section>
		<h1 class="tituloPrincipal">Modificar Usuario</h1>
		<div class="contenido formularios">
			<form action="FromActualizarUsuario" method="post" id="formActualizarUsuario">
				<div class="label-input">
					<label for="runusuario" class="form-label">RUN:</label> <input
						type="number" id="runusuario" name="userRun" value='<c:out value="${datosUsuario.getUserRun()}"></c:out>' readonly style="background-color:lightgrey;">
				</div>
				<div class="label-input">
					<label for="usnombre" class="form-label">Nombre :</label>
					<input type="text" id="usnombre" name="userNombre" value='<c:out value="${datosUsuario.getUserNombre()}"></c:out>'>
				</div>
				<div class="label-input">
					<label for="usapellido" class="form-label">Apellido :</label>
					<input type="text" id="usapellido" name="userApellido" 
							value='<c:out value="${datosUsuario.getUserApellido()}"></c:out>'>
				</div>
				<div class="label-input">
					<label for="usnacimiento" class="form-label">Fecha de Nacimiento :</label> 
					<input type="text" id="usnacimiento" name="userFeNaci" 
							value='<c:out value="${datosUsuario.getUserFeNaci()}"></c:out>'>
				</div>
				<div class="label-input">
					<label for="tipoDeUsuario" class="form-label">Tipo de usuario</label>
					<input type="text" id="perfil" name="tipoUsuario" 
							value='<c:out value="${datosUsuario.getTipoUsuario()}"></c:out>'>
				</div>
 				<div id="profesional" class="label-input">
					<h3>Datos de Profesional</h3>
					<label for="protelefono" class="form-label">Telefono :</label>
					<input type="text" id="protelefono" name="userTelefono" 
							value='<c:out value="${datosUsuario.getUserTelefono()}"></c:out>'>
					<label for="protitulo" class="form-label">Titulo :</label>
					<input type="text" id="protitulo" name="userTitulo" 
							value='<c:out value="${datosUsuario.getUserTitulo()}"></c:out>'>
					<label for="proproyecto" class="form-label">Proyecto :</label>
					<input type="text" id="proproyecto" name="userProyecto" 
							value='<c:out value="${datosUsuario.getUserProyecto()}"></c:out>'>
 				</div>
				<div class="label-input">
					<label for="nose" class="form-label">(*) Datos obligatorios</label>
					<input class="submit" type="submit" value="Modificar">
					<br>
					<input type="button" onclick="location.href='/usuario/';" value="Volver">
				</div>
			</form>
		</div>
	</section>
<jsp:include page="footer.jsp"></jsp:include>