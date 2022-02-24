package main.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import main.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer> {

	public List<Fabricante> findByNombre(String nombre);	
}
