package pe.edu.vallegrande.nuevoagrozam.service;

import java.util.List;
import java.util.Optional;

import pe.edu.vallegrande.nuevoagrozam.model.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);

    Product save(Product product);

    Product update(Product product);

    void changeState(Long id, String state);
}


