
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#">Full Stack Java</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarNav">

			<ul class="navbar-nav">
				<li class="nav-item">
					<a class="nav-link" aria-current="page" href="/inicio">Inicio</a>
				</li>
					
				<li class="nav-item">
					<a class="nav-link" href="/contacto/">Contacto</a>
				</li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown"
					aria-expanded="false"> Crear/Agregar </a>
					
					<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<li><a class="dropdown-item" href="/capacitacion/crearCapacitacion">Crear Capacitaciones</a></li>
						<li><a class="dropdown-item" href="/usuario/crearUsuario">Crear Usuario</a></li>
					</ul>
				</li>
				
				
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown"
					aria-expanded="false">Listados</a>
					
					<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<li><a class="dropdown-item" href="/capacitacion/">Listar Capacitaciones</a></li>
						<li><a class="dropdown-item" href="/usuario/">Listado de Usuarios</a></li>
						
					</ul>
				</li>
				
				<li class="nav-item">
					<a class="nav-link" href="Logout">Logout</a>
				</li>
 
			</ul>

		</div>
	</div>
</nav>
