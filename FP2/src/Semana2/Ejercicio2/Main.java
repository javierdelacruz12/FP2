package Semana2.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double largo;
        double ancho;
        double profundidad;

        System.out.print("Ingrese el largo de la piscina: ");
        largo = sc.nextDouble();

        System.out.print("Ingrese el ancho de la piscina: ");
        ancho = sc.nextDouble();

        System.out.print("Ingrese la profundidad de la piscina: ");
        profundidad = sc.nextDouble();

        Piscina piscina1 = new Piscina(largo, ancho, profundidad);
        System.out.println("El volumen de la piscina es: " + piscina1.calcularVolumen());
        System.out.println("La cantidad de agua en litros es: " + piscina1.calcularAgua());
        System.out.println("La cantidad de cloro en gramos es: " + piscina1.calcularCloro());
    }
}
