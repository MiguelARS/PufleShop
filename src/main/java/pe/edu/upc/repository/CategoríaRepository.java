package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Categoria;

@Repository
public interface CategoríaRepository extends JpaRepository<Categoria, Integer> {

}
