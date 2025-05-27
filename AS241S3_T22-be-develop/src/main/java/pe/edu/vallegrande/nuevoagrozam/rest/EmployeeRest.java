package pe.edu.vallegrande.nuevoagrozam.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.nuevoagrozam.model.Employee;
import pe.edu.vallegrande.nuevoagrozam.service.EmployeeService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/employee")
public class EmployeeRest {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRest(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Leer todos los empleados
    @GetMapping
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    // Leer un empleado por ID
    @GetMapping("/{id}")
    public Optional<Employee> findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }

    // Crear un nuevo empleado
    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    // Actualizar un empleado existente
    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    // Inhabilitar un empleado por ID
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.changeState(id, "I");
    }

    // Restaurar un empleado por ID
    @PutMapping("/restore/{id}")
    public void restore(@PathVariable Long id) {
        employeeService.changeState(id, "A");
    }
}
