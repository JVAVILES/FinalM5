package cl.modulo.sesion7.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import ch.qos.logback.classic.Logger;
import cl.modulo.sesion7.entity.Contacto;

@Controller
@RequestMapping("/contacto")
public class ContactoCont {

		@GetMapping("/")
		public String crearContacto() {
			return "contacto";
		} 
		
		private static final Logger logger =  (Logger) LoggerFactory.getLogger(Contacto.class);
		
		@PostMapping("/contactoLog")
		public RedirectView contactoLog(@ModelAttribute("formContacto") Contacto contacto){
			logger.info(contacto.toString());
			return new RedirectView("/contacto/");
		}
}
