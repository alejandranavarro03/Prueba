package ejercicio1;

public class Funcionario {
    
    private String rut;
    private String nombres;
    private String apellidos;
    private String domicilio;
    private String fnacimiento;
    private double sueldoBruto;

    public Funcionario(String rut, String nombres, String apellidos, String domicilio, String fnacimiento, double sueldoBruto) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.fnacimiento = fnacimiento;
        this.sueldoBruto = sueldoBruto;
    }

    public String getRut() {
        return rut;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    
}
