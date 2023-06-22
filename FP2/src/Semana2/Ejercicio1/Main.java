package Semana2.Ejercicio1;

public class Main {
    public static void main(String[] args){
        Boleta boleta1 = new Boleta(20.45);
        System.out.println("El IGV de la Boleta es: " + boleta1.calcularIGV());
        System.out.println("El Total de la Boleta es: " + boleta1.calcularTotal());
        System.out.printf("El Total de la Boleta es: %.1f", boleta1.calcularTotal());
    }
}
