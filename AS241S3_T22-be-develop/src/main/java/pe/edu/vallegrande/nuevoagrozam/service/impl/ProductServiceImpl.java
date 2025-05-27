package pe.edu.vallegrande.nuevoagrozam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import pe.edu.vallegrande.nuevoagrozam.model.Product;
import pe.edu.vallegrande.nuevoagrozam.repository.ProductRepository;
import pe.edu.vallegrande.nuevoagrozam.service.ProductService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        log.info("Listando todos los productos");
        return productRepository.findByState("A");
    }

    @Override
    public Optional<Product> findById(Long id) {
        log.info("Buscando producto con ID: {}", id);
        return productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        log.info("Registrando producto: {}", product);
        if (product.getState() == null) {
            product.setState("A");
        }
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        log.info("Actualizando producto: {}", product);
        return productRepository.save(product);
    }
    

    @Override
    public void changeState(Long id, String state) {
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()) {
            Product product = optional.get();
            product.setState(state); // Aquí no alteramos el valor recibido
            productRepository.save(product);
        }
    }
}
