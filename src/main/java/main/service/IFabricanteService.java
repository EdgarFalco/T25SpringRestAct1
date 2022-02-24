package main.service;

import java.util.List;
import main.dto.Fabricante;

public interface IFabricanteService {
	
	public List<Fabricante> listarFabricantes();
	
	public List<Fabricante> listarFabricanteNombre(String nombre);	
	
	public Fabricante fabricanteXID(Integer codigo);

	public Fabricante guardarFabricante(Fabricante fabricante);		

	public Fabricante actualizarFabricante(Fabricante fabricante);

	public void eliminarFabricante(Integer codigo);
}
