package backend.spring.estudianteservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.spring.modelentity.Estudiante;
import backend.spring.modelsDAO.IEstudianteDAO;

@Service
public class EstudianteService implements IEstudianteService {
	@Autowired
	private IEstudianteDAO estudiantedao;

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudiantedao.findAll();
	}

	@Override
	public Estudiante save(Estudiante e) {
		// TODO Auto-generated method stub
		return estudiantedao.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		estudiantedao.deleteById(id);
	}

	@Override
	public Estudiante searchById(Long id) {
		// TODO Auto-generated method stub
		return estudiantedao.findById(id).orElse(null);
	}
	
}
