package tfg.employees.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tfg.employees.model.Employee;
import tfg.employees.service.EmployeeService;

import java.util.List;
import java.util.Optional;

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
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{employeeIdentification}"

    )
    public Optional<Employee> getEmployeeByIdentification(@PathVariable("employeeIdentification") String identification){
        return employeeService.getEmployeeByIdentification(identification);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE

    )

    public void newEmployee(@RequestBody Employee employee){
        employeeService.newEmployee(employee);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "{employeeIdentification}"
    )

    public void updateEmployee(@RequestBody Employee employee, @PathVariable("employeeIdentification") String identification){
        employeeService.updateEmployee(employee, identification);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "{employeeIdentification}"
    )

    public void deleteEmployee(@PathVariable("employeeIdentification") String identification){
        employeeService.deleteEmployee(identification);
    }
}
