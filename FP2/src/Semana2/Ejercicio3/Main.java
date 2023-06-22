package Semana2.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("u1234", "James", "Huiza", 17, 18, 10, 14);

        //Llamamos al procedimiento presentarse (void) en la clase Alumno
        //Lo llamamos directamente porque el procedimiento realiza la impresión
        alumno.presentarse();

        //En estas llamadas se debe imprimir, porque los metodos solo retornan valores
        System.out.println("Nota Final: " + alumno.calcularNotaFinal());
        System.out.println("El alumno esta: " + alumno.obtenerAprobadoDesaprobado());

        System.out.println("Nota Final es: " + alumno.calcularNotaFinal() + ", entonces esta: " + alumno.obtenerAprobadoDesaprobado());
        System.out.printf("Nota Final es: %.2f, entonces esta %s", alumno.calcularNotaFinal(), alumno.obtenerAprobadoDesaprobado());
    }
}
