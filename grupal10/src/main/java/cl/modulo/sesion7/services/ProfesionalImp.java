package cl.modulo.sesion7.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.modulo.sesion7.entity.Profesional;
import cl.modulo.sesion7.repository.IProfesionalRepo;

@Service
public class ProfesionalImp implements InterfaceGenerico<Profesional, Integer>{

	@Autowired
	IProfesionalRepo iPR;

	@Override
	public List<Profesional> listar() {
		return iPR.findAll();
	}

	@Override
	public Profesional crear(Profesional dato) {
		return iPR.save(dato);
	}

	@Override
	public Profesional readId(Integer rutProfesional) {
		return iPR.findByRutProfesional(rutProfesional);
	}

	@Override
	public Profesional modificar(Profesional dato) {
		return null;
	}

	
}