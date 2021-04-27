package cl.modulo.sesion7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.modulo.sesion7.entity.Profesional;
import cl.modulo.sesion7.entity.Usuario;

public interface IProfesionalRepo extends JpaRepository<Profesional, Integer>{
	
	public Profesional findByUserRun(Integer userRun);
	
}
