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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "carritos")
public class Carrito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre", length = 50,nullable = false)
	private String nombre;
	
	@ManyToMany(mappedBy = "carritos")
	@JoinTable(name = "carrito_producto", joinColumns = {
			@JoinColumn(name ="carrido_id")},
	inverseJoinColumns = {@JoinColumn(name="producto_id")})
	private List<Producto> productos;
	@ManyToOne
	@JoinColumn(name = "comprador_id")
	private Comprador comprador;
	
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
}
