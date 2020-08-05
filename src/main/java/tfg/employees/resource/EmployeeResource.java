package tfg.employees.resource;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    @Operation(summary = "Get all employees")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Employees successfully found",
            content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Employee.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Employees not found",
                    content = @Content)

    })
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{employeeIdentification}"

    )
    @Operation(summary = "Get employee by identification")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Employee successfully found",
                    content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Employee.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Employee not found",
                    content = @Content)

    })
    public Optional<Employee> getEmployeeByIdentification(@PathVariable("employeeIdentification") String identification){
        return employeeService.getEmployeeByIdentification(identification);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE

    )
    @Operation(summary = "Create a new employee")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Employee successfully created",
                    content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid request",
                    content = @Content)
    })
    public void newEmployee(@RequestBody Employee employee){
        employeeService.newEmployee(employee);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "{employeeIdentification}"
    )
    @Operation(summary = "Update an employee")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Employee successfully updated",
            content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid request",
            content = @Content),
            @ApiResponse(responseCode = "404", description = "Unable to update requested employee because it was not found",
            content = @Content)
    })
    public void updateEmployee(@RequestBody Employee employee, @PathVariable("employeeIdentification") String identification){
        employeeService.updateEmployee(employee, identification);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "{employeeIdentification}"
    )
    @Operation(summary = "Remove an employee")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Employee successfully removed",
            content = @Content),
            @ApiResponse(responseCode = "400", description = "Invalid request",
            content = @Content),
            @ApiResponse(responseCode = "404", description = "Cannot delete the requested employee because it was not found",
            content = @Content)
    })
    public void deleteEmployee(@PathVariable("employeeIdentification") String identification){
        employeeService.deleteEmployee(identification);
    }

}
