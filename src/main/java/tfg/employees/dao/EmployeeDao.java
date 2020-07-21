package tfg.employees.dao;

import tfg.employees.model.Employee;
import java.util.List;

public interface EmployeeDao {

    //Obtenemos todos los empleados almacenados en la base de datos
    List<Employee> obtenerEmpleados();


}
