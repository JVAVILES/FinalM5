<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

	<jsp:include page="head.jsp">
		<jsp:param value="Contacto" name="titulo"/>
	</jsp:include>
 	<br>
	<section>
		<h1 class="tituloPrincipal">Crear capacitacion</h1>
		<div class="contenido formularios">
			<form action="/capacitacion/crearCapacitacion" method="post" id="formCapacitacion">
				<!-- IDCAPACITACION INTERNO -->
				<div class="label-input">
					<label for="fecha" class="form-label">Fecha [dd/mm/yyyy]:</label> <input
						type="text" id="capFecha" name="capFecha">
				</div>
				<div class="label-input">
					<label for="hora" class="form-label">Hora :</label>
					<input type="time" id="capHora" name="capHora">
				</div>
				<div class="label-input">
					<label for="lugar" class="form-label">Lugar* :</label> <input type="text" id="
						capLugar" name="capLugar">
				</div>
				<div class="label-input">
					<label for="duracion" class="form-label">Duración* :</label> <input
						type="number" id="capDuracion" name="capDuracion">
				</div>
				<div class="label-input">
					<label for="cantidadAsistentes" class="form-label">Cantidad Asstentes* :</label> <input
						type="number" id="cantidadAsistentes" name="capCantidadAsistentes">
				</div>
				<div class="label-input">
					<label for="rutCliente" class="form-label">Rut Cliente*:</label> <input
						type="number" id="capClienteRutcliente" name="CapClienteRutcliente">
				</div>
				<div class="label-input">
					<label for="nose" class="form-label">(*) Datos obligatorios</label>
					<input class="submit" type="submit" value="Enviar">
				</div>
			</form>
		</div>
	</section>
<jsp:include page="footer.jsp"></jsp:include>