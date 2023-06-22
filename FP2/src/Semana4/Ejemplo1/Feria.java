package Semana4.Ejemplo1;

public abstract class Feria {
    private String lugar;
    private String nombreFeria;
    private String fecha;

    public Feria(String lugar, String nombreFeria, String fecha) {
        this.lugar = lugar;
        this.nombreFeria = nombreFeria;
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombreFeria() {
        return nombreFeria;
    }

    public void setNombreFeria(String nombreFeria) {
        this.nombreFeria = nombreFeria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public abstract void Imprimir();
}
