package cl.modulo.sesion7.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@DiscriminatorValue("2")  
public class Profesional extends Usuario {

	private String proTelefono;
	private String proTitulo;
	private String proProyecto;
}

