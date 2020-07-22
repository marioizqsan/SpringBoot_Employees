package tfg.employees.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tfg.employees.model.Employee;
import tfg.employees.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeResource {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeResource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Employee> obtenerEmpleados(){
        return employeeService.obtenerEmpleados();
    }
}
