package Semana3.Ejercicio1;

public class Docente extends Persona {
    private int horas;
    private double tarifahora;

    public Docente(String dni, String nombre, int horas, double tarifahora) {
        super(dni, nombre);
        this.horas = horas;
        this.tarifahora = tarifahora;
    }

    public int getHoras() {
        return horas;
    }

    public double getTarifahora() {
        return tarifahora;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTarifahora(double tarifahora) {
        this.tarifahora = tarifahora;
    }

    public double Sueldo() {
        return this.getHoras() * this.getTarifahora();
    }

    public void Imprimir() {
        System.out.println("Datos del Docente");
        System.out.println("-----------------");
        System.out.println("\tDNI: " + this.getDni());
        System.out.println("\tNombre: " + this.getNombre());
        System.out.println("\tHoras Trabajadas: " + this.getHoras());
        System.out.println("\tTarifa x Hora: " + this.getTarifahora());
        System.out.println("\tSueldo: " + this.Sueldo() + "\n");
    }
}
