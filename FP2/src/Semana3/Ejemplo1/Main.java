package Semana3.Ejemplo1;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("ABC123", "Toyota", "Yaris",
                "Pequeño", "Simple", "Dobles");
        auto.Correr();

        auto.setMarca("Mercedes Benz");
        auto.setModelo("GLA");
        auto.Correr();
    }
}
