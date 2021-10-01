package backend.spring.modelsDAO.estudiantecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import backend.spring.estudianteservice.IEstudianteService;
import backend.spring.modelentity.Estudiante;

@RestController
@RequestMapping("/api")
public class EstudianteRestController {
	@Autowired
	private IEstudianteService estudianteservice;
	@GetMapping("/estudiantes")
	public List<Estudiante> listarEstudiantes(){
		return estudianteservice.findAll();
	}
	@PostMapping("/estudiantes")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante guardar(@RequestBody Estudiante e) {
		return estudianteservice.save(e);
	}
	@DeleteMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar (@PathVariable Long id) {
		estudianteservice.delete(id);
	}
	@GetMapping("/estudiantes/{id}")
	public Estudiante encontrarPorId(@PathVariable Long id) {
		return estudianteservice.searchById(id);
	}
	@PutMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Estudiante actualizar(@PathVariable Long id, @RequestBody Estudiante e) {
		Estudiante actual = estudianteservice.searchById(id);
		actual.setNombre(e.getNombre());
		actual.setApellido(e.getApellido());
		actual.setCarrera(e.getCarrera());
		actual.setPromedio(e.getPromedio());
		return estudianteservice.save(actual);
	}
}
