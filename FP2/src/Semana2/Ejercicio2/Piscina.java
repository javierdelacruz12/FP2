package Semana2.Ejercicio2;

public class Piscina {
    private double largo;
    private double ancho;
    private double profundidad;

    public Piscina(double largo, double ancho, double profundidad) {
        this.largo = largo;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double calcularVolumen() {
        return this.profundidad * this.ancho * this.largo;
    }

    public double calcularAgua() {
        double volumen = calcularVolumen();
        return volumen * 1000 * 0.75;
    }

    public double calcularCloro() {
        double agua = calcularAgua();
        return (agua / 1.5) * 0.015;
    }
}
