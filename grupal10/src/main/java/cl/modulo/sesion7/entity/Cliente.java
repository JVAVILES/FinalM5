package cl.modulo.sesion7.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {
	
	@Id
	private Integer rutCliente;
	private String cliTelefono;
	private String cliAfp;
	private Integer cliSistemaSalud;
	private String cliComuna;
	private String cliDireccion;
	private Integer cliEdad;
}
