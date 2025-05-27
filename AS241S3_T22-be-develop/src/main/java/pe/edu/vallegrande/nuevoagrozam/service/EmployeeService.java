package pe.edu.vallegrande.nuevoagrozam.service;

import java.util.List;
import java.util.Optional;

import pe.edu.vallegrande.nuevoagrozam.model.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    Employee save(Employee employee);

    Employee update(Employee employee);

    void changeState(Long id, String state);
}
