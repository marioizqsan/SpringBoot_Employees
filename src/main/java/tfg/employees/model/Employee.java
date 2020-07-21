package tfg.employees.model;

import java.util.Date;

public class Employee {

    //Atributos de un empleado
    private String nombre;
    private String apellido_primero;
    private String apellido_segundo;
    private String tipo_identificacion;
    private String identificacion;


    /*

    Comentado para hacer pruebas más simples

    private Date fecha_nacimiento;
    private String lugar_nacimiento;
    private String residencia;
    private String telefono;
    private String movil;
    private String email;
    private String banco;
    private String cuenta_bancaria;
    private String puesto;
    private String tipo_contrato;
    private String salario;
    private Date inicio_contrato;
    private Date fin_contrato;
    private Boolean activo;

    public Employee(String nombre, String apellido_primero, String apellido_segundo, String tipo_identificacion, String identificacion, Date fecha_nacimiento, String lugar_nacimiento, String residencia, String telefono, String movil, String email, String banco, String cuenta_bancaria,
        String puesto, String tipo_contrato, String salario, Date inicio_contrato, Date fin_contrato) {
        this.nombre = nombre;
        this.apellido_primero = apellido_primero;
        this.apellido_segundo = apellido_segundo;
        this.tipo_identificacion = tipo_identificacion;
        this.identificacion = identificacion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lugar_nacimiento = lugar_nacimiento;
        this.residencia = residencia;
        this.telefono = telefono;
        this.movil = movil;
        this.email = email;
        this.banco = banco;
        this.cuenta_bancaria = cuenta_bancaria;
        this.puesto = puesto;
        this.tipo_contrato = tipo_contrato;
        this.salario = salario;
        this.inicio_contrato = inicio_contrato;
        this.fin_contrato = fin_contrato;
        this.activo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_primero() {
        return apellido_primero;
    }

    public void setApellido_primero(String apellido_primero) {
        this.apellido_primero = apellido_primero;
    }

    public String getApellido_segundo() {
        return apellido_segundo;
    }

    public void setApellido_segundo(String apellido_segundo) {
        this.apellido_segundo = apellido_segundo;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCuenta_bancaria() {
        return cuenta_bancaria;
    }

    public void setCuenta_bancaria(String cuenta_bancaria) {
        this.cuenta_bancaria = cuenta_bancaria;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(String tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Date getInicio_contrato() {
        return inicio_contrato;
    }

    public void setInicio_contrato(Date inicio_contrato) {
        this.inicio_contrato = inicio_contrato;
    }

    public Date getFin_contrato() {
        return fin_contrato;
    }

    public void setFin_contrato(Date fin_contrato) {
        this.fin_contrato = fin_contrato;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    */


    public Employee(String nombre, String apellido_primero, String apellido_segundo, String tipo_identificacion, String identificacion) {
        this.nombre = nombre;
        this.apellido_primero = apellido_primero;
        this.apellido_segundo = apellido_segundo;
        this.tipo_identificacion = tipo_identificacion;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_primero() {
        return apellido_primero;
    }

    public void setApellido_primero(String apellido_primero) {
        this.apellido_primero = apellido_primero;
    }

    public String getApellido_segundo() {
        return apellido_segundo;
    }

    public void setApellido_segundo(String apellido_segundo) {
        this.apellido_segundo = apellido_segundo;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
