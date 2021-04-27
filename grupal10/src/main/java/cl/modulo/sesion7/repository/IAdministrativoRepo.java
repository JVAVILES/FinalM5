package cl.modulo.sesion7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.modulo.sesion7.entity.Administrativo;

public interface IAdministrativoRepo extends JpaRepository<Administrativo, Integer> {
	
	public Administrativo findByUserRun(Integer userRun);
	
}
