package pe.edu.vallegrande.nuevoagrozam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import pe.edu.vallegrande.nuevoagrozam.model.Customer;
import pe.edu.vallegrande.nuevoagrozam.repository.CustomerRepository;
import pe.edu.vallegrande.nuevoagrozam.service.CustomerService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        log.info("Listando todos los clientes activos");
        return customerRepository.findByState("A");
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        log.info("Buscando cliente con ID: {}", id);
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        log.info("Registrando cliente: {}", customer);
        if (customer.getState() == null) {
            customer.setState("A");
        }
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        log.info("Actualizando cliente: {}", customer);
        return customerRepository.save(customer);
    }

    @Override
    public void changeState(Integer id, String state) {
        Optional<Customer> optional = customerRepository.findById(id);
        if (optional.isPresent()) {
            Customer customer = optional.get();
            customer.setState(state); // Cambiamos el estado: "I" para inactivar, "A" para activar
            customerRepository.save(customer);
        }
    }
}
