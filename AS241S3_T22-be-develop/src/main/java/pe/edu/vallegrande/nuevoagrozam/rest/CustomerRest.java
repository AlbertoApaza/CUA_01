package pe.edu.vallegrande.nuevoagrozam.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.vallegrande.nuevoagrozam.model.Customer;
import pe.edu.vallegrande.nuevoagrozam.service.CustomerService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/customer")
public class CustomerRest {

    private final CustomerService customerService;

    @Autowired
    public CustomerRest(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Leer todos los clientes
    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    // Leer un cliente por ID
    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable Integer id) {
        return customerService.findById(id);
    }

    // Crear un nuevo cliente
    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    // Actualizar un cliente existente
    @PutMapping("/update")
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

    // Eliminar (inhabilitar) un cliente por ID
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        customerService.changeState(id, "I");
    }

    // Restaurar un cliente por ID
    @PutMapping("/restore/{id}")
    public void restore(@PathVariable Integer id) {
        customerService.changeState(id, "A");
    }
}
