package Semana2.Ejercicio1;

public class Boleta {
    private double monto;
    public Boleta(double monto) {
        this.monto = monto;
    }
    public double calcularIGV() {
        double igv = this.monto * 0.18;
        return Math.round(igv * 100.0) / 100.0;
    }
    public double calcularTotal() {
        double igv = calcularIGV();
        double total = igv + this.monto;
        return total;
    }
}
