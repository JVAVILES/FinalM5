package cl.modulo.sesion7.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cl.modulo.sesion7.entity.Administrativo;
import cl.modulo.sesion7.entity.Capacitacion;
import cl.modulo.sesion7.entity.Profesional;
import cl.modulo.sesion7.entity.Usuario;
import cl.modulo.sesion7.services.AdministrativoServImp;
import cl.modulo.sesion7.services.InterfaceGenerico;
import cl.modulo.sesion7.services.ProfesionalImp;
import cl.modulo.sesion7.services.UsuarioServImp;

@Controller
@RequestMapping("/usuario")
public class UsuarioCont {

	@Autowired
	UsuarioServImp uSI;
    AdministrativoServImp aSI;
	ProfesionalImp pI;
	

	@GetMapping("/")
	public String listar(ModelMap modelmap) {
		List<Usuario> lista = uSI.listar();
		modelmap.put("listaUsuarios", lista);
		return "listadoUsuario";
	} 
	
	@GetMapping("/crearUsuario")
	public String crearCapacitacion() {
		return "crearUsuario";
	}  

	@PostMapping("/crearUsuario")
	public RedirectView crearUsuarioPost(@ModelAttribute("FormCrearUsuario") Usuario usu, Profesional pro, Administrativo adm){
		String tipoUser = usu.getTipoUsuario().toString();
		if(tipoUser.equals("1")) {
			usu.setTipoUsuario("Cliente");
		}else if(tipoUser.equals("2")) {
			usu.setTipoUsuario("Profesional");
			System.out.println(pro.toString());
			pI.crear(pro);
		}else {
			usu.setTipoUsuario("Administrativo");
			aSI.crear(adm);
		}
		return new RedirectView("/usuario/");
	}
	
	@GetMapping("/actualizarUsuario")
	public String actualizarUsuario() {
		return "vistaActualizarUsuario";
	} 
		
		/*@RequestMapping("/hello")
    public ModelAndView handleRequest() {
		HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World Example Using Spring MVC 5!!! part 2");
        helloWorld.setDateTime(LocalDateTime.now().toString());
        return new ModelAndView("helloworld", "helloWorld", helloWorld);
    }*/
	
		
		/*String p = usu.getTipoUsuario();
		
		 * if(p==("3")) {
			Administrativo adm = new Administrativo();
			adm.get
	
		return new RedirectView("listarUsuario");
	}*/
	
}
/*
 * @PostMapping("/redirectedPostToPost")
public ModelAndView redirectedPostToPost() {
    return new ModelAndView("redirection");
}
		@GetMapping("/")
		public String listarCapacitacion(ModelMap modelmap) {
			List<Capacitacion> lista = iCS.listarCapacitaciones();
			modelmap.put("listaCapacitaciones", lista);
			return "listarCapacitaciones";
		} 
		
		@PostMapping("/crearCapacitacion")
		public RedirectView crearCapacitacionPost(@ModelAttribute("FormCrearCapacitacion") Capacitacion cap){
			iCS.crearCapacitacion(cap);
			return new RedirectView("/capacitacion/");
		}
		
}

 */
