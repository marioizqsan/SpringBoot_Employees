package tfg.employees.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import tfg.employees.model.Employee;

import java.sql.ResultSet;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository("postgresDao")
public class EmployeeDaoImpl implements EmployeeDao {

    //This object allows us to execute sql commands to the database
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;

    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employee_details";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String identification = resultSet.getString("identification");
            Date date_of_birth = resultSet.getDate("date_of_birth");
            String birthplace = resultSet.getString("birthplace");
            String residence = resultSet.getString("residence");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");
            String business_position = resultSet.getString("business_position");
            Date contract_start_date = resultSet.getDate("contract_start_date");
            String bank_account = resultSet.getString("bank_account");
            return new Employee(name, surname, identification, date_of_birth, birthplace, residence, phone, email, business_position,
                    contract_start_date, bank_account);

        });
    }

    @Override
    public Optional<Employee> getEmployeeByIdentification(String identification) {
        String sql = "SELECT * FROM employee_details WHERE identification = ?";
        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{identification}, ((resultSet, i) ->
        {
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            Date date_of_birth = resultSet.getDate("date_of_birth");
            String birthplace = resultSet.getString("birthplace");
            String residence = resultSet.getString("residence");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");
            String business_position = resultSet.getString("business_position");
            Date contract_start_date = resultSet.getDate("contract_start_date");
            String bank_account = resultSet.getString("bank_account");
            return new Employee(name, surname, identification, date_of_birth, birthplace, residence, phone, email,
                    business_position, contract_start_date, bank_account);

        }));
        return Optional.ofNullable(employee);
    }

    @Override
    public void newEmployee(Employee employee) {
        String name = employee.getName();
        String surname = employee.getSurname();
        String identification = employee.getIdentification();
        Date date_of_birth = employee.getDate_of_birth();
        String birthplace = employee.getBirthplace();
        String residence = employee.getResidence();
        String phone = employee.getPhone();
        String email = employee.getEmail();
        String business_position = employee.getBusiness_position();
        Date contract_start_date = employee.getContract_start_date();
        String bank_account = employee.getBank_account();
        String sql = "INSERT INTO employee_details (name, surname, identification, date_of_birth, birthplace, residence, phone, email, business_position, contract_start_date, bank_account) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, name, surname, identification, date_of_birth, birthplace, residence, phone, email, business_position, contract_start_date, bank_account);
    }

    @Override
    public void updateEmployee(Employee employee, String identification) {
        String residence = employee.getResidence();
        String phone = employee.getPhone();
        String email = employee.getEmail();
        String business_position = employee.getBusiness_position();
        Date contract_start_date = employee.getContract_start_date();
        String bank_account = employee.getBank_account();
        String sql = "UPDATE employee_details SET residence = ?, phone = ?, email = ?, business_position = ?, contract_start_date = ?, bank_account = ? WHERE employee_details.identification = ?";
        jdbcTemplate.update(sql, residence, phone, email, business_position, contract_start_date, bank_account, identification);
    }

    @Override
    public void deleteEmployee(String identification) {
        String sql = "DELETE FROM employee_details WHERE identification = ?";
        jdbcTemplate.update(sql, identification);
    }

}
