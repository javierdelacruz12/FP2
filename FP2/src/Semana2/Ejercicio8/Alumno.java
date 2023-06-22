package Semana2.Ejercicio8;

public class Alumno {
    protected String codigo;
    protected String nombre;
    protected String apellido;
    protected double pc1;
    protected double pc2;
    protected double pc3;
    protected double notaParcial;
    protected double notaFinal;

    public Alumno(String c, String n, String a, double pc1, double pc2, double pc3, double np, double nf) {
        this.codigo = c;
        this.nombre = n;
        this.apellido = a;
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.notaParcial = np;
        this.notaFinal = nf;
    }

    public double calcularPromedio() {
        double practicas = (this.pc1 + this.pc2 + this.pc3) / 3;
        double promedio = practicas * 0.2 + this.notaParcial * 0.3 + this.notaFinal * 0.5;
        return promedio;
    }
}
