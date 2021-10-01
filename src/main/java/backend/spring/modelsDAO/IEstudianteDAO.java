package backend.spring.modelsDAO;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.spring.modelentity.Estudiante;

public interface IEstudianteDAO extends JpaRepository<Estudiante, Long> {

}
