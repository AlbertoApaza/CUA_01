package pe.edu.vallegrande.nuevoagrozam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.vallegrande.nuevoagrozam.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByState(String state);
    
}