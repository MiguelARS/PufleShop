package pe.edu.upc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "opciones")
public class Opcion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id; 
	
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	
	@Column(name = "caracteristica", length = 50, nullable = false)
	public Caracteristica caracteristica;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Caracteristica getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	} 

}
