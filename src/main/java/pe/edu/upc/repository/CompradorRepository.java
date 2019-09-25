package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Comprador;

@Repository
public interface CompradorRepository 
extends JpaRepository<Comprador, Integer> {

}
