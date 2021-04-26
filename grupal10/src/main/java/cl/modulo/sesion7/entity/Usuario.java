package cl.modulo.sesion7.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@SequenceGenerator(name="usu_sc", initialValue = 1, allocationSize = 1, sequenceName = "usu_sc")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipoUsuario",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="usuario")  
public class Usuario {
		
		@Id
		@EmbeddedId
		private IdUsuarioUserRunPK id;
		private String userNombre;
		private String userApellido;
		private String userFeNaci;
		private String tipoUsuario;
		
		@OneToOne
		@JoinColumn(name = "rut_profesional", insertable = true, updatable = true)
		private Profesional profesional;
		
		@OneToOne
		@JoinColumn(name = "run_administrativo", insertable = true, updatable = true)
		private Administrativo adm;
		
		@MapsId("idUsuario")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="usu_sc")
		private Integer idUsuario;
		
		
}
