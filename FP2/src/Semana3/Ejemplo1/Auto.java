package Semana3.Ejemplo1;

public class Auto extends Vehiculo {
    private String maletero;
    private String parabriza;
    private String plumillas;

    public Auto(String placa, String marca, String modelo,
                String maletero, String parabriza, String plumillas) {
        super(placa, marca, modelo);
        this.maletero = maletero;
        this.parabriza = parabriza;
        this.plumillas = plumillas;
    }

    public String getMaletero() {
        return maletero;
    }

    public String getParabriza() {
        return parabriza;
    }

    public String getPlumillas() {
        return plumillas;
    }

    public void setMaletero(String maletero) {
        this.maletero = maletero;
    }

    public void setParabriza(String parabriza) {
        this.parabriza = parabriza;
    }

    public void setPlumillas(String plumillas) {
        this.plumillas = plumillas;
    }

    public void Correr() {
        System.out.printf("El auto %s %s suena Rrrrrrrrr...", this.getMarca(), this.getModelo());
    }
}
