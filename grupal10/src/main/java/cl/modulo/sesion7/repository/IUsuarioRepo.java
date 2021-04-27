package cl.modulo.sesion7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cl.modulo.sesion7.entity.Usuario;

@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	public Usuario findByUserRun(Integer userRun);
	public Usuario save(Integer userRun);
	
	
}
