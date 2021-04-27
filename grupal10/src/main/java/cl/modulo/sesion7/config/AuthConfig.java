package cl.modulo.sesion7.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AuthConfig implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String rut) throws UsernameNotFoundException {
		
		@Autowired
		
		
		return null;
	}

}
