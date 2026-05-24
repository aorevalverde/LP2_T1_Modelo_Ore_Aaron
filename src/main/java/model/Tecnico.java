package model;

import java.awt.DefaultFocusTraversalPolicy;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_tecnico")
@Getter
@Setter
public class Tecnico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tecnico")
	private Integer idTecnico;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "especialidad")
	private String especialidad;

	public String getEspecialidadDescripcion() {
		switch (especialidad) {
		case "S": return "Sofware";
		case "H": return "Hardware";
		case "B": return "Redes";
		case "R": return "Base de Datos";
		default:
			return "Desconocido";
		}
	}
}
