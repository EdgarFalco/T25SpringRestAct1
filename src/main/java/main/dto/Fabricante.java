package main.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fabricante")
public class Fabricante {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Articulo> articulo;
	
	//Constructores
	public Fabricante() {		
	}
	
	public Fabricante(int codigo, String nombre) {		
		this.codigo = codigo;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	
	

}
