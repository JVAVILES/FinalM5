package cl.modulo.sesion7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.modulo.sesion7.entity.Profesional;

public interface IProfesionalRepo extends JpaRepository<Profesional, Integer>{
	
	public Profesional findByRutProfesional(Integer rutProfesional);
	
}
