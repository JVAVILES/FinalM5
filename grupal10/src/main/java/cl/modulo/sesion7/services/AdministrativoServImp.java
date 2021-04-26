package cl.modulo.sesion7.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.modulo.sesion7.entity.Administrativo;
import cl.modulo.sesion7.repository.IAdministrativoRepo;

@Service
public class AdministrativoServImp implements InterfaceGenerico<Administrativo, Integer>{
	
	@Autowired
	IAdministrativoRepo iAR;

	@Override
	public List<Administrativo> listar(){
		return iAR.findAll();
	}

	@Override
	public Administrativo crear(Administrativo adm) {
		return iAR.save(adm);
	}

	@Override
	public Administrativo readId(Integer runAdm) {
		return iAR.findByRunAdm(runAdm);
	}

	@Override
	public Administrativo modificar(Administrativo usu) {
		return null;
	}

	
}

/*
public class CapacitacionServImp implements ICapacitacionServ{
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

*/