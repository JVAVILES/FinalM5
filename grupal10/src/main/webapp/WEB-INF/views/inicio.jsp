<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:include page="head.jsp">
		<jsp:param value="Contacto" name="titulo"/>
	</jsp:include>
	
 	<br> 
	<section>
		<h1 class="tituloPrincipal">Inicio</h1>

		<div class="contenido">

			<h2>Cuál es el objetivo del sistema de información?</h2>
			<p>Permite administrar los principales procesos que se llevan a
				cabo en ella día a día. Recientemente, un grupo de profesionales
				fundó una compañía de asesorías laborales, detectando inmediatamente
				la necesidad de contar con una solución tecnológica que le permita
				administrar toda la información que se desprende de sus procesos,
				tener un control del recurso humano.</p>

			<h3>Quienes deberían usarlo?</h3>
			<p>La plana administrativa de la empresa y los distintos Perfiles
				de usuario.</p>

			<h4>Qué procesos considera la plataforma actualmente?</h4>

			<ol type="1">
				<li>Registrar los diferentes tipos de chequeos que se pueden
					hacer en la empresa, referenciarlos a la visita respectiva e
					indicar el estado de avance (Cumple, No Cumple, Observaciones).</li>
				<li>Registra los datos importantes de clientes (Usuarios),
					almacenándolos en la plataforma.</li>
				<li>Registro de pagos de clientes, por números correlativos
					únicos.</li>
				<li>Registro de las asesorías realizadas, los datos importantes
					y la identificación clara del profesional a cargo del trabajo.
					registro de las actividades de mejora que resultan de las asesorías
					efectuadas, con un identificado único, descripción y plazos de
					resolución.</li>
			</ol>
		</div>
	</section>
		<jsp:include page="footer.jsp"></jsp:include>