package Semana3.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("12345678", "Javier de la Cruz",
                12.5, "2023-1B", 22);
        Docente docente = new Docente("22223333", "James Huiza",
                176, 10);

        estudiante.Imprimir();
        docente.Imprimir();

        estudiante.setDni("87654321");
        estudiante.setNombre("Jose Cotos");
        estudiante.setPonderado(16.9);
        estudiante.setMatricula("2023-1A");
        estudiante.setCreditos(18);

        estudiante.Imprimir();

        docente.setDni("55664411");
        docente.setNombre("Jorge Narvaez");
        docente.setHoras(160);
        docente.setTarifahora(50);

        docente.Imprimir();
    }
}
