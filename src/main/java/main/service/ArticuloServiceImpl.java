package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IArticuloDAO;
import main.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		
		return iArticuloDAO.findAll();
	}

	@Override
	public List<Articulo> listarArticuloNombre(String nombre) {
		
		return iArticuloDAO.findByNombre(nombre);
	}

	@Override
	public Articulo articuloXID(Integer codigo) {
		
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Integer codigo) {
		
		iArticuloDAO.deleteById(codigo);		
	}
}
