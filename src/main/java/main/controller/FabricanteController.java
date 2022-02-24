package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Fabricante;
import main.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes() {
		return fabricanteServiceImpl.listarFabricantes();
	}

	@GetMapping("/fabricantes/nombre/{nombre}")
	public List<Fabricante> listarFabricanteNombre(@PathVariable(name = "nombre") String nombre) {
		return fabricanteServiceImpl.listarFabricanteNombre(nombre);
	}

	@PostMapping("/fabricantes")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {

		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}

	@GetMapping("/fabricantes/{codigo}")
	public Fabricante fabricanteXID(@PathVariable(name = "codigo") Integer codigo) {

		Fabricante fabricante_xid = new Fabricante();

		fabricante_xid = fabricanteServiceImpl.fabricanteXID(codigo);

		System.out.println("Fabricante x ID: " + fabricante_xid);

		return fabricante_xid;
	}

	@PutMapping("/fabricantes/{codigo}")
	public Fabricante actualizarFabricante(@PathVariable(name = "codigo") Integer codigo, @RequestBody Fabricante fabricante) {

		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();

		fabricante_seleccionado = fabricanteServiceImpl.fabricanteXID(codigo);

		fabricante_seleccionado.setNombre(fabricante.getNombre());				

		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);

		System.out.println("El fabricante actualizado es: " + fabricante_actualizado);

		return fabricante_actualizado;
	}

	@DeleteMapping("/fabricantes/{codigo}")
	public void eleiminarFabricante(@PathVariable(name = "codigo") Integer codigo) {
		fabricanteServiceImpl.eliminarFabricante(codigo);
	}
}
