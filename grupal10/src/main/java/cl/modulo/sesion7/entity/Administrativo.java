package cl.modulo.sesion7.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@DiscriminatorValue("3")  
public class Administrativo extends Usuario {
	
	@Id
	private String admCorreo;
	private String admArea;
	
}
