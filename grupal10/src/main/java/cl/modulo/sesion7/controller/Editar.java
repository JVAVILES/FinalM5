package cl.modulo.sesion7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.modulo.sesion7.entity.Administrativo;
import cl.modulo.sesion7.entity.Cliente;
import cl.modulo.sesion7.entity.Profesional;
import cl.modulo.sesion7.entity.Usuario;
import cl.modulo.sesion7.services.InterfaceGenerico;

@Controller
@RequestMapping("/editar")
public class Editar {

	@Autowired
	InterfaceGenerico<Usuario> iGU;
	InterfaceGenerico<Cliente> iGC;
	InterfaceGenerico<Profesional> iGP;
	InterfaceGenerico<Administrativo> iGA;
	
	@GetMapping("/")
	public String editar( @RequestParam("tipoUsuario") String tipo, @RequestParam("userRun") Integer userRun, ModelMap mM){
		String web = "";
		System.out.println("hola");
		if(tipo.equals("1")) {
			mM.put("datosUsuario", iGC.readId(userRun));
			web = "editarCliente";
		}else if(tipo.equals("2")) {
			System.out.println(iGP.readId(userRun).toString());
			mM.put("datosUsuario", iGP.readId(userRun));
			web = "editarProfesional";
		}else {
			mM.put("datosUsuario", iGA.readId(userRun));
			web = "editarAdministrativo";
		}
		return web;
	}
}
