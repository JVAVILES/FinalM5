package cl.modulo.sesion7.services;

import java.util.List;

public interface  InterfaceGenerico<T,ID>{
	List<T> listar();
	public T crear(T dato);
	public T readId (Integer dato );
	public T modificar(T dato );
}
