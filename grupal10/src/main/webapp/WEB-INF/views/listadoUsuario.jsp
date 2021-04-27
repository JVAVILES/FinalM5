<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="False"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
  
	<jsp:include page="head.jsp">
		<jsp:param value="Contacto" name="titulo"/>
	</jsp:include>

 	<br>
	<section>
		<h1 class="tituloPrincipal">Listado de Usuarios</h1>
		<div class="contenido">
            <table class="contenido-centrar listado">
                <thead>
                    <tr>
                        <th>Rut</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Fecha de Nacimiento</th>
                        <th>Role</th>
                        
                        <th>Eliminar</th>
                        <th>Editar</th>
                    </tr>
                </thead>
                <tbody>
            	 	<c:forEach items="${listaUsuarios}" var="usu">
						<tr>
							<td><c:out value="${usu.getUserRun()}"></c:out></td>
							<td><c:out value="${usu.getUserNombre()}"></c:out></td>
							<td><c:out value="${usu.getUserApellido()}"></c:out></td>
							<td><c:out value="${usu.getUserFeNaci()}"></c:out></td>
							<td><c:out value="${usu.getTipoUsuario()}"></c:out></td>
							
							<td><a href="EliminarUsuario?IdUsuario=<c:out value="${usu.getUserRun()}"></c:out>">
										<img src="https://cdn.icon-icons.com/icons2/55/PNG/128/editDelete_11203.png"
	                                    width="30px"></a></td>
	                        <td><a href="/editar/<c:out value="${usu.getTipoUsuario()}"></c:out>/userRun?<c:out value="${usu.getUserRun()}"></c:out>">
	                        <img src="https://cdn.icon-icons.com/icons2/402/PNG/128/edit-validated_40458.png"
	                                    width="30px"></a></td>
						</tr>
					</c:forEach>
                </tbody>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="5"></td>
                        <td>
                            <br>
                            <input type="button" onclick="location.href='crearUsuario';" value="Crear usuario">
                        </td>
                    </tr>
                </tfoot>
            </table>
            <br>
            <br>
		</div>
	</section>
	<jsp:include page="footer.jsp"></jsp:include>