package tfg.employees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tfg.employees.dao.EmployeeDao;
import tfg.employees.model.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(@Qualifier("postgresDao") EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAllEmployees(){
        return employeeDao.getAllEmployees();
    }

    public Optional<Employee> getEmployeeByIdentification(String identification){
        return employeeDao.getEmployeeByIdentification(identification);
    }

    public void newEmployee(Employee employee){
        employeeDao.newEmployee(employee);
    }

    public void updateEmployee(Employee employee, String identification){
        employeeDao.updateEmployee(employee, identification);
    }

    public void deleteEmployee(String identification){
        employeeDao.deleteEmployee(identification);
    }
}
