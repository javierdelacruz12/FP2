package Semana2.Ejercicio3;

public class Alumno {
    private String codigo;
    private String nombre;
    private String apellido;
    private double pc1;
    private double pc2;
    private double pa;
    private double ef;

    public Alumno(String cod, String nom, String ape, double pc1, double pc2, double pa, double ef) {
        this.codigo = cod;
        this.nombre = nom;
        this.apellido = ape;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pa = pa;
        this.ef = ef;
    }

    public void presentarse() {
        System.out.println("Datos del Alumno");
        System.out.println("----------------");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    public double calcularNotaFinal() {
        return this.pc1 * 0.2 + this.pc2 * 0.25 + this.pa * 0.25 + this.ef * 0.5;
    }

    public String obtenerAprobadoDesaprobado() {
        double notaFinal = calcularNotaFinal();
        //return (notaFinal >= 13) ? "Aprobado" : "Desaprobado";

        if(notaFinal >= 13) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }
}
