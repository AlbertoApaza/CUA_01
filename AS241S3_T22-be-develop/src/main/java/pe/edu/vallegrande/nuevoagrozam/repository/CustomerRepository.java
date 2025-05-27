package pe.edu.vallegrande.nuevoagrozam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.vallegrande.nuevoagrozam.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByState(String state); // Por ejemplo: "A" o "I"
}
