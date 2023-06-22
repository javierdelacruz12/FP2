package Semana3.Ejemplo2;

public abstract class Poligono {
    private int numLados;
    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public abstract double area();
}
