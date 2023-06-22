package Semana3.Ejercicio1;

public class Persona {
    private String dni;
    private String nombre;
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
