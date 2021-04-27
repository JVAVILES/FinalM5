package cl.modulo.sesion7.entity;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@PrimaryKeyJoinColumn(name="userRun")
public class Administrativo extends Usuario {
	
	private String admCorreo;
	private String admArea;
	
}
