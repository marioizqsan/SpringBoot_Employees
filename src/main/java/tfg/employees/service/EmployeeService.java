package tfg.employees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tfg.employees.dao.EmployeeDao;
import tfg.employees.model.Employee;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(@Qualifier("postgresDao") EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public List<Employee> obtenerEmpleados(){
        return employeeDao.obtenerEmpleados();
    }
}
