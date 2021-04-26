package cl.modulo.sesion7.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.modulo.sesion7.entity.Capacitacion;

@Service
public interface ICapacitacionServ {

	List<Capacitacion> listarCapacitaciones();
	
	public Capacitacion crearCapacitacion(Capacitacion capacitacion);
	
	public Capacitacion busquedaPorId(Integer idCapacitacion);
}
