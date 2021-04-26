package cl.modulo.sesion7.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

//@Entity

@Data
@Entity
public class Capacitacion {

	@Id
	@SequenceGenerator(name="cap_generator", sequenceName="cap_sc", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="cap_generator")
	private Integer idCapacitacion;//@Column(name="FECHA");
	private String capFecha;
	private String capHora;
	private String capLugar;
	private Integer capDuracion;
	private Integer capCantidadAsistentes;
	private Integer clienteRutCliente;
	
}
