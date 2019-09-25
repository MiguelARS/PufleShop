package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Opcion;

@Repository
public interface OpcionRepository 
extends JpaRepository<Opcion, Integer> {

}
