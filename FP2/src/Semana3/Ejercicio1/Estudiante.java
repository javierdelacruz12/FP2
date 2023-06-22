package Semana3.Ejercicio1;

public class Estudiante extends Persona {
    private double ponderado;
    private String matricula;
    private int creditos;

    public Estudiante(String dni, String nombre, double ponderado, String matricula, int creditos) {
        super(dni, nombre);
        this.ponderado = ponderado;
        this.matricula = matricula;
        this.creditos = creditos;
    }

    public double getPonderado() {
        return ponderado;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setPonderado(double ponderado) {
        this.ponderado = ponderado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public double Pension() {
        return this.getCreditos() * 80;
    }

    public void Imprimir() {
        System.out.println("Datos de Estudiante");
        System.out.println("--------------------");
        System.out.println("\tDNI: " + this.getDni());
        System.out.println("\tNombre: " + this.getNombre());
        System.out.println("\tPonderado: " + this.getPonderado());
        System.out.println("\tMatricula: " + this.getMatricula());
        System.out.println("\tCreditos: " + this.getCreditos());
        System.out.println("\tPesion (S/. 80.00 x credito): S/. " + this.Pension() + "\n");
    }
}
