package cl.modulo.sesion7.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
public class Profesional extends Usuario {
	@PrimaryKeyJoinColumn(name="userRun")
	private Integer userRun;
	private String proTelefono;
	private String proTitulo;
	private String proProyecto;
}

