package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IFabricanteDAO;
import main.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		
		return iFabricanteDAO.findAll();
	}

	@Override
	public List<Fabricante> listarFabricanteNombre(String nombre) {
		
		return iFabricanteDAO.findByNombre(nombre);
	}

	@Override
	public Fabricante fabricanteXID(Integer codigo) {
		
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Integer codigo) {
		
		iFabricanteDAO.deleteById(codigo);		
	}
}
