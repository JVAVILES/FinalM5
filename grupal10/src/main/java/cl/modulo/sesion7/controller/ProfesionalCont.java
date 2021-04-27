package cl.modulo.sesion7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import cl.modulo.sesion7.entity.Capacitacion;
import cl.modulo.sesion7.entity.Profesional;
import cl.modulo.sesion7.entity.Usuario;
import cl.modulo.sesion7.repository.IProfesionalRepo;
import cl.modulo.sesion7.services.ProfesionalImp;
import cl.modulo.sesion7.services.UsuarioServImp;

@Controller
@RequestMapping("/Profesional")
public class ProfesionalCont {
	
	ProfesionalImp pI;
	UsuarioServImp uSI;
	
	@PostMapping("/crear")
	public RedirectView crearUsuarioPost(@ModelAttribute("formUsuario") Profesional pro){
		String tipoUser = pro.getTipoUsuario();
		if(tipoUser=="1") {
			pro.setTipoUsuario("Cliente");
		}
		if(tipoUser=="2") {
			pro.setTipoUsuario("Profesional");
		}
		if(tipoUser=="3") {
			pro.setTipoUsuario("Administrativo");
		}
		pI.crear(pro);
		return new RedirectView("/usuario/");
	}
	
	@GetMapping("/editar")
	public String editar(@RequestParam("userRun") Integer userRun, ModelMap mM){
		mM.put("datosUsuario", pI.readId(userRun));
		return "editarProfesional";
	}
	@PostMapping("/editar")
		public RedirectView crearPost(@ModelAttribute("formActualizarUsuario") Profesional pro){
		uSI.crear(pro);
		pI.crear(pro);
		return new RedirectView("/Profesional/");
		}
}
