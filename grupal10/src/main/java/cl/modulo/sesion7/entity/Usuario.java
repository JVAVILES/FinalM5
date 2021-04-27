package cl.modulo.sesion7.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Usuario {
		
		@Id
		private Integer userRun;
		private String userNombre;
		private String userApellido;
		private String userFeNaci;
		private String tipoUsuario;
		
}
