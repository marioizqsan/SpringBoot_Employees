package tfg.employees.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Schema(description = "Details about the employee")
public class Employee {

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's name")
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters long")
    private String name;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's surname")
    @NotEmpty(message = "Surname cannot be null or empty")
    @Size(min = 1, max = 50, message = "Surname must be between 1 and 50 characters long")
    private String surname;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's unique identifier")
    @NotEmpty(message = "Identification cannot be null or empty")
    @Size(min = 1, max = 40, message = "Identification must be between 1 and 40 characters long")
    private String identification;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's date of birth")
    @NotEmpty(message = "Date of birth cannot be null or empty. Format must be yyyy-mm-dd")
    private Date date_of_birth;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's birth place")
    @NotEmpty(message = "Birthplace cannot be null or empty")
    @Size(min = 1, max = 50, message = "Birthplace must be between 1 and 50 characters long")
    private String birthplace;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's place of residence")
    @NotEmpty(message = "Residence cannot be null or empty")
    @Size(min = 1, max = 50, message = "Residence must be between 1 and 50 characters long")
    private String residence;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's phone number")
    @NotEmpty(message = "Phone cannot be null or empty")
    @Size(min = 1, max = 50, message = "Phone must be between 1 and 50 characters long")
    private String phone;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's email")
    @NotEmpty(message = "Email cannot be null or empty")
    @Size(min = 1, max = 50, message = "Email must be between 1 and 50 characters long")
    private String email;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's business position")
    @NotEmpty(message = "Business position cannot be null or empty")
    @Size(min = 1, max = 50, message = "Business position must be between 1 and 50 characters long")
    private String business_position;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's contract start date")
    @NotEmpty(message = "Contract start date cannot be null or empty. Format must be yyyy-mm-dd")
    private Date contract_start_date;

    @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "The employee's bank account number")
    @NotEmpty(message = "Bank account cannot be null or empty")
    @Size(min = 1, max = 50, message = "Bank account must be between 1 and 50 characters long")
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
