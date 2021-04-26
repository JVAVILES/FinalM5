package cl.modulo.sesion7.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.modulo.sesion7.entity.Capacitacion;
import cl.modulo.sesion7.repository.ICapacitacionRepo;

@Service
public class CapacitacionServImp implements ICapacitacionServ{

	@Autowired
	ICapacitacionRepo iCapR;
	
	@Override
	public List<Capacitacion> listarCapacitaciones() {
		return iCapR.findAll();
	}
	
	@Override
	public Capacitacion crearCapacitacion(Capacitacion capacitacion) {
		return iCapR.save(capacitacion);
	}
	@Override
	public Capacitacion busquedaPorId(Integer idCapacitacion) {
		return iCapR.findById(idCapacitacion).get();
	}

}
