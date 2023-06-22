package Semana4.Ejemplo1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Participante> participantes = new ArrayList<>();
        participantes.add(new Participante("Lima", "Cintura", "28/07/2023",
                "12345678", "James Huiza", "Arroz con Pollo",
                95, 85, 80,
                "A", "", false));

        participantes.add(new Participante("Lima", "Cintura", "28/07/2023",
                "12345678", "Erik Aviles", "Lomo Saltado",
                95, 85, 80,
                "A", "", false));

        participantes.add(new Participante("Lima", "Cintura", "28/07/2023",
                "12345678", "Christian Montes", "Cebiche",
                99, 88, 77,
                "P", "DGalia", true));

        ListarParticipantes(participantes);
        System.out.println("Ganador de la Feria");
        ObtenerGanadorGeneral(participantes);
        System.out.println("Ganador Amateur de la Feria");
        ObtenerGanadorAmateur(participantes);
    }

    static void ListarParticipantes(ArrayList<Participante> participantes) {
        for(Participante p: participantes){
            p.Imprimir();
        }
    }

    static void ObtenerGanadorGeneral(ArrayList<Participante> participantes) {
        Participante ganador = new Participante("", "", "");
        double mayor = 0;

        for(Participante p: participantes){
            if(p.getPuntajeFinal() > mayor) {
                mayor = p.getPuntajeFinal();
                ganador = p;
            }
        }

        ganador.Imprimir();
    }

    static void ObtenerGanadorAmateur(ArrayList<Participante> participantes) {
        Participante ganador = new Participante("", "", "");
        double mayor = 0;

        for(Participante p: participantes){
            if(p.getTipo().equals("A")) {
                if(p.getPuntajeFinal() > mayor) {
                    mayor = p.getPuntajeFinal();
                    ganador = p;
                }
            }
        }

        ganador.Imprimir();
    }
}
