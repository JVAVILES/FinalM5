package cl.modulo.sesion7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.modulo.sesion7.entity.Capacitacion;

@Repository
public interface ICapacitacionRepo extends JpaRepository<Capacitacion, Integer>{

public Capacitacion findByIdCapacitacion(Integer idCapacitacion);//se hizo este método para buscar algo especifico
	
}
