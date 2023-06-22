package Semana4.Ejemplo1;

public class Participante extends Feria {
    private String dni;
    private String nombre;
    private String plato;
    private int puntajeSabor;
    private int puntajePresentacion;
    private int puntajeOriginalidad;
    private double puntajeFinal;
    private String tipo;
    private String institucion;
    private boolean ganador;

    public Participante(String lugar, String nombreFeria, String fecha) {
        super(lugar, nombreFeria, fecha);
    }

    public Participante(String lugar, String nombreFeria, String fecha, String dni, String nombre, String plato, int puntajeSabor, int puntajePresentacion, int puntajeOriginalidad, String tipo, String institucion, boolean ganador) {
        super(lugar, nombreFeria, fecha);
        this.dni = dni;
        this.nombre = nombre;
        this.plato = plato;
        this.puntajeSabor = puntajeSabor;
        this.puntajePresentacion = puntajePresentacion;
        this.puntajeOriginalidad = puntajeOriginalidad;
        this.tipo = tipo;
        this.institucion = institucion;
        this.ganador = ganador;
        this.puntajeFinal = this.calcularPuntajeFinal();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public int getPuntajeSabor() {
        return puntajeSabor;
    }

    public void setPuntajeSabor(int puntajeSabor) {
        this.puntajeSabor = puntajeSabor;
    }

    public int getPuntajePresentacion() {
        return puntajePresentacion;
    }

    public void setPuntajePresentacion(int puntajePresentacion) {
        this.puntajePresentacion = puntajePresentacion;
    }

    public int getPuntajeOriginalidad() {
        return puntajeOriginalidad;
    }

    public void setPuntajeOriginalidad(int puntajeOriginalidad) {
        this.puntajeOriginalidad = puntajeOriginalidad;
    }

    public double getPuntajeFinal() {
        return puntajeFinal;
    }

    public void setPuntajeFinal(double puntajeFinal) {
        this.puntajeFinal = puntajeFinal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

    public double calcularPuntajeFinal() {
        double puntaje = this.getPuntajeSabor() * 0.7 +
                            this.getPuntajePresentacion() * 0.2 +
                            this.getPuntajeOriginalidad() * 0.1;

        if(this.getTipo().equals("P")) {
            if(this.isGanador()) {
                puntaje += 5.0;
            }
        }

        return puntaje;
    }

    @Override
    public void Imprimir() {
        System.out.println("Datos del Participante");
        System.out.println("----------------------");
        System.out.printf("Feria %s en %s desde %s \n",
                this.getNombreFeria(), this.getLugar(), this.getFecha());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Tipo Participante: " + this.obtenerDescripcionTipo(this.getTipo()));
        if(this.getTipo().equals("P")) {
            System.out.println("Institución: " + this.getInstitucion());
            System.out.println("¿Gano premio?: " + (this.isGanador() ? "SI" : "NO"));
        }
        System.out.println("Plato: " + this.getPlato());
        System.out.println("Puntaje: " + this.getPuntajeFinal() + "\n");
    }

    public String obtenerDescripcionTipo(String tipo) {
        String descripcion = "";

        switch (tipo){
            case "A":
                descripcion = "Amateurs";
                break;
            case "D":
                descripcion = "Dueños de Restaurantes";
                break;
            case "P":
                descripcion = "Profesionales";
                break;
        }

        return descripcion;
    }
}
