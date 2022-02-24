package main.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String nombre;
	private int precio;
	
	@ManyToOne
	@JoinColumn(name = "fabricante")
	private Fabricante fabricante;	
	
	//Constructores
	public Articulo() {		
	}

	public Articulo(Integer codigo, String nombre, int precio, Fabricante fabricante) {		
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	//Getters and Setters
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante
				+ "]";
	}
}
