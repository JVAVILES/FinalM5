package cl.modulo.sesion7.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.modulo.sesion7.entity.Usuario;
import cl.modulo.sesion7.repository.IUsuarioRepo;

@Service
public class UsuarioServImp implements InterfaceGenerico<Usuario>{

	@Autowired
	IUsuarioRepo cr ;

	@Override
	public List<Usuario> listar() {
		return cr.findAll();
	}

	@Override
	public Usuario crear(Usuario dato) {
		return cr.save(dato);
	}

	@Override
	public Usuario readId(Integer idUsuario) {
		return cr.findByUserRun(idUsuario);
	}

	@Override
	public Usuario modificar(Usuario dato) {
		// TODO Auto-generated method stub
		return null;
	}


}
