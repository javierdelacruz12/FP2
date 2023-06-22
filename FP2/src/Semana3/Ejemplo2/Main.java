package Semana3.Ejemplo2;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(2, 30, 10);
        Triangulo triangulo = new Triangulo(3, 10, 8, 7);

        System.out.printf("El area del rectangulo es: %.2f \n", rectangulo.area());
        System.out.printf("El area del triangulo es: %.2f", triangulo.area());
    }
}
