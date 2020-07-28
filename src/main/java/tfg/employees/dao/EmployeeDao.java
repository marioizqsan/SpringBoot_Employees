package tfg.employees.dao;

import tfg.employees.model.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeByIdentification(String identification);

    void newEmployee(Employee employee);

    void updateEmployee(Employee employee, String identification);

    void deleteEmployee(String identification);

}
