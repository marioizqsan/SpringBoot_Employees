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
    private String email;
    private String business_position;
    private Date contract_start_date;
    private String bank_account;

    public Employee(@JsonProperty("name") String name, @JsonProperty("surname") String surname, @JsonProperty("identification") String identification,
                    @JsonProperty("date_of_birth") Date date_of_birth, @JsonProperty("birthplace") String birthplace, @JsonProperty("residence") String residence, @JsonProperty("phone") String phone, @JsonProperty("email") String email,
                    @JsonProperty("business_position") String business_position, @JsonProperty("contract_start_date") Date contract_start_date, @JsonProperty("bank_account") String bank_account) {

        this.name = name;
        this.surname = surname;
        this.identification = identification;
        this.date_of_birth = date_of_birth;
        this.birthplace = birthplace;
        this.residence = residence;
        this.phone = phone;
        this.email = email;
        this.business_position = business_position;
        this.contract_start_date = contract_start_date;
        this.bank_account = bank_account;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBusiness_position() {
        return business_position;
    }

    public void setBusiness_position(String business_position) {
        this.business_position = business_position;
    }

    public Date getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(Date contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }
}
