package tfg.employees.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Employee {

    private String name;
    private String surname;
    private String identification;
    private Date date_of_birth;
    private String birthplace;
    private String residence;
    private String phone;
    private String mobile_phone;
    private String email;
    private String banking_entity;
    private String business_position;
    private String contract_type;
    private String salary;
    private Date contract_start_date;
    private Date contract_end_date;


    public Employee(@JsonProperty("name") String name, @JsonProperty("surname") String surname, @JsonProperty("identification") String identification,
                    @JsonProperty("date_of_birth") Date date_of_birth, @JsonProperty("birthplace") String birthplace, @JsonProperty("residence") String residence, @JsonProperty("phone") String phone, @JsonProperty("mobile_phone") String mobile_phone, @JsonProperty("email") String email, @JsonProperty("banking_entity") String banking_entity,
                    @JsonProperty("business_position") String business_position, @JsonProperty("contract_type") String contract_type, @JsonProperty("salary") String salary, @JsonProperty("contract_start_date") Date contract_start_date, @JsonProperty("contract_end_date") Date contract_end_date) {
        this.name = name;
        this.surname = surname;
        this.identification = identification;
        this.date_of_birth = date_of_birth;
        this.birthplace = birthplace;
        this.residence = residence;
        this.phone = phone;
        this.mobile_phone = mobile_phone;
        this.email = email;
        this.banking_entity = banking_entity;
        this.business_position = business_position;
        this.contract_type = contract_type;
        this.salary = salary;
        this.contract_start_date = contract_start_date;
        this.contract_end_date = contract_end_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBanking_entity() {
        return banking_entity;
    }

    public void setBanking_entity(String banking_entity) {
        this.banking_entity = banking_entity;
    }

    public String getBusiness_position() {
        return business_position;
    }

    public void setBusiness_position(String business_position) {
        this.business_position = business_position;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Date getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(Date contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public Date getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(Date contract_end_date) {
        this.contract_end_date = contract_end_date;
    }
}
