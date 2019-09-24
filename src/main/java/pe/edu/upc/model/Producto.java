package pe.edu.upc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;
	@ManyToMany()
	@JoinTable(name = "producto_caracteristica",
			joinColumns = {@JoinColumn(name = "producto_id")}, 
			inverseJoinColumns = {@JoinColumn(name = "caracteristica_id")})
	private List<Caracteristica> caracteristicas; 
	
	@ManyToMany(mappedBy = "productos")
	private List<Carrito> carritos;
	
	
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
	public List<Carrito> getCarritos() {
		return carritos;
	}
	public void setCarritos(List<Carrito> carritos) {
		this.carritos = carritos;
	}

}
