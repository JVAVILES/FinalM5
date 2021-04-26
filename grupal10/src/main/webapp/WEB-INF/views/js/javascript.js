/**
 * CONTACTO
 */
$(document).ready(function () {
	$("#formContacto").validate({
		rules: {
			nombre: {
				required: true,
				maxlength: 50,
				minlength:1
			},
			mail: {
				required: true,
				email: true
			},
			telefono: {
				required: true,
				minlength: 12
			},
			mensaje: {
				required: true,
				minlength: 1
			},
			genero: {
				required: true,
			},
		},
		messages: {
			nombre: {
				required: "Obligatorio",
				maxlength:"Se requieren menos de {0} caracteres!",
				minlength:"Se requieren al menos {0} caracteres!"
			},
			mail: {
				required: "Obligatorio",
				email: "Se requiere email valido"
			},
			telefono: {
				required: "Obligatorio",
				minlength: "Se requieren al menos {0} caracteres!"
			},
			mensaje: {
				required: "Obligatorio",
				minlength: "Se requieren al menos {0} caracteres!"
			},
			genero: {
				required: "Obligatorio",
			},
		}
	});
});

/**
 *  CREAR CAPACITACION
 */
$(document).ready(function () {
 	$("#formCapacitacion").validate({
		rules: {
			fecha: {
				required: true,
				minlength: 10
			},
			hora: {
				required: true,
			},
			lugar: {
				required: true,
				minlength: 1
			},
			duracion: {
				required: true,
				minlength: 1
			},
			rutCliente: {
				required: true,
				max: 999999999,
				min: 1
			},
		},
		messages: {
			fecha: {
				required: "Obligatorio",
				minlength: "Se requieren formato DD/MM/YYYY"
			},
			hora: {
				required: "Obligatorio",
			},
			lugar: {
				required: "Obligatorio",
				minlength: "Se requieren al menos {0} caracteres!"
			},
			duracion: {
				required: "Obligatorio",
				minlength: "Se requieren al menos {0} caracteres!"
			},
			rutCliente: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				min: "Ingrese un valor mayor o igual que {0}"
			},
		}
	});
});
	
 /**
 * CREAR USUARIO
 */
$(document).ready(function () {
 	$("#formUsuario").validate({
		rules: {
			runusuario: {
				required: true,
				max: 999999999,
				min: 1
			},
			usnombre: {
				required: true,
				minlength: 1
			},
			usapellido: {
				required: true,
				minlength: 1
			},
			usnacimiento: {
				required: true,
				minlength: 10
			},
		},
		messages: {
			 runusuario: {
				required: "Obligatorio",
				max: "Ingrese un valor menor o igual que {0}",
				min: "Ingrese un valor mayor o igual que {0}"
			},
			usnombre: {
				required: "Obligatorio",
				minlength: "Se requieren al menos {0} caracteres!"
			},
			usapellido: {
				required: "Obligatorio",
				minlength: "Se requieren al menos {0} caracteres!"
			},
			usnacimiento: {
				required: "Obligatorio",
				minlength: "Se requieren formato DD/MM/YYYY!"
			},
		}
	});
	
	$("#cliente").hide();
	$("#profesional").hide();
	$("#administrativo").hide();
	$("#perfil").change(function(){
		
		if($("#perfil").val()==1){
			$("#cliente").show();
			$("#profesional").hide();
			$("#administrativo").hide();
		}else if($("#perfil").val()==2){
			$("#cliente").hide();
			$("#profesional").show();
			$("#administrativo").hide();
		}else if($("#perfil").val()==3){
			$("#cliente").hide();
			$("#profesional").hide();
			$("#administrativo").show();
		}else if($("#perfil").val()==0) {
			$("#cliente").hide();
			$("#profesional").hide();
			$("#administrativo").hide();
		}  
	});
	if($("#perfil").val()==1){
		$("#cliente").show();
		$("#profesional").hide();
		$("#administrativo").hide();
	}else if($("#perfil").val()==2){
		$("#cliente").hide();
		$("#profesional").show();
		$("#administrativo").hide();
	}else  if($("#perfil").val()==3){
		$("#cliente").hide();
		$("#profesional").hide();
		$("#administrativo").show();
	}
});
 /**
 * LOGIN
 */
$(document).ready(function () {
 	$("#formLogin").validate({
		rules: {
			usuario: {
				required: true,
			},
			clave: {
				required: true,
			},
		},
		messages: {
			usuario: {
				required: "Obligatorio",
			},
			clave: {
				required: "Obligatorio",
			},
		}
	});
});
	