package pe.edu.vallegrande.nuevoagrozam.service;

import java.util.List;
import java.util.Optional;

import pe.edu.vallegrande.nuevoagrozam.model.Customer;

public interface CustomerService {

    List<Customer> findAll();

    Optional<Customer> findById(Integer id);

    Customer save(Customer customer);

    Customer update(Customer customer);

    void changeState(Integer id, String state);
}
