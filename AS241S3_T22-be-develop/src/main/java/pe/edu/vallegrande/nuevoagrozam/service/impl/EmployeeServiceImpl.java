package pe.edu.vallegrande.nuevoagrozam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import pe.edu.vallegrande.nuevoagrozam.model.Employee;
import pe.edu.vallegrande.nuevoagrozam.repository.EmployeeRepository;
import pe.edu.vallegrande.nuevoagrozam.service.EmployeeService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        log.info("Listando todos los empleados activos");
        return employeeRepository.findByState("A");
    }

    @Override
    public Optional<Employee> findById(Long id) {
        log.info("Buscando empleado con ID: {}", id);
        return employeeRepository.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        log.info("Registrando empleado: {}", employee);
        if (employee.getState() == null) {
            employee.setState("A");
        }
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        log.info("Actualizando empleado: {}", employee);
        return employeeRepository.save(employee);
    }

    @Override
    public void changeState(Long id, String state) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isPresent()) {
            Employee employee = optional.get();
            employee.setState(state); // "I" para inactivar, "A" para activar
            employeeRepository.save(employee);
        }
    }
}
