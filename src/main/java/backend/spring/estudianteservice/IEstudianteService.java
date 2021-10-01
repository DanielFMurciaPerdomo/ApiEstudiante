package backend.spring.estudianteservice;

import java.util.List;

import backend.spring.modelentity.Estudiante;

public interface IEstudianteService {
	public List<Estudiante> findAll();
	public Estudiante save(Estudiante e);
	public void delete(Long id);
	public Estudiante searchById(Long id);
}
