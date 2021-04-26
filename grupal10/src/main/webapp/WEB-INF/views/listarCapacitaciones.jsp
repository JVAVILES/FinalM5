<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="False"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>

	<jsp:include page="head.jsp">
		<jsp:param value="Listar Capacitaciones" name="titulo"/>
	</jsp:include>
 	<br>
	
	<section>
		<h1 class="tituloPrincipal">Listado de Capacitaciones</h1>
		<div class="contenido">
            <table class="contenido-centrar">
                <thead>
                    <tr>
                        <th>Id_capacitacion</th>
                        <th>Fecha</th>
                        <th>Hora</th>
                        <th>Lugar</th>
                        <th>Duracion</th>
                        <th>N° Asistentes</th>
                        <th>Rut Cliente</th>
                    </tr>
                </thead>
                <tbody>
	           	<c:forEach items="${listaCapacitaciones}" var="cap">
				<tr>
					<td><c:out value="${cap.getIdCapacitacion()}"></c:out></td>
					<td><c:out value="${cap.getCapFecha()}"></c:out></td>
					<td><c:out value="${cap.getCapHora()}"></c:out></td>
					<td><c:out value="${cap.getCapLugar()}"></c:out></td>
					<td><c:out value="${cap.getCapDuracion()}"></c:out></td>
					<td><c:out value="${cap.getCapCantidadAsistentes()}"></c:out></td>
					<td><c:out value="${cap.getCapClienteRutcliente()}"></c:out></td>
				</tr>
				</c:forEach>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="5"></td>
                        <td><br>
                            <input type="button" onclick="location.href='crearCapacitacion';"
                                value="Crear capacitacion">
                        </td>
                    </tr>
                </tfoot>
            </table>
		</div>
	</section>
<jsp:include page="footer.jsp"></jsp:include>