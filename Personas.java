package ejercicio1;

public class Personas {
    
    private String rut;
    private String nombre;
    private String apellidos;
    private String domicilio;    

    public Personas(String rut, String nombre, String apellidos) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Personas(String rut, String nombre, String apellidos, String domicilio) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
    }
    
}

