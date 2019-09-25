package pe.edu.upc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.model.Producto;

@Repository
public interface ProductoRepository
extends JpaRepository<Producto, Integer>{

}
