package main.service;

import java.util.List;
import main.dto.Articulo;

public interface IArticuloService {
	
	public List<Articulo> listarArticulos();
	
	public List<Articulo> listarArticuloNombre(String nombre);	
	
	public Articulo articuloXID(Integer codigo);

	public Articulo guardarArticulo(Articulo articulo);		

	public Articulo actualizarArticulo(Articulo articulo);

	public void eliminarArticulo(Integer codigo);
}
