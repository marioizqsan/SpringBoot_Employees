package tfg.employees.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tfg.employees.model.Employee;

import java.sql.ResultSet;
import java.util.List;

@Repository("postgresDao")
public class EmployeeDaoImpl implements EmployeeDao {

    //Objeto que nos permite ejecutar comandos SQL a la base de datos
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;

    }

    @Override
    public List<Employee> obtenerEmpleados() {
        String sql = "SELECT * FROM employee";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            String nombre = resultSet.getString("nombre");
            String apellido_primero = resultSet.getString("apellido_primero");
            String apellido_segundo = resultSet.getString("apellido_segundo");
            String tipo_identificacion = resultSet.getString("tipo_identificacion");
            String identificacion = resultSet.getString("identificacion");
            return new Employee(nombre, apellido_primero, apellido_segundo, tipo_identificacion, identificacion);
        });
    }
}
