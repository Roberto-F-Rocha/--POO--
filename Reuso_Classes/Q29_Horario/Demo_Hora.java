package Reuso_Classes.Q29_Horario;

public class Demo_Hora {
    public static void main(String[] args) {
        EventoDelegacao eventoD = new EventoDelegacao(2025, 3, 17, 11, 30, "ECOP");
        EventoHeranca eventoH = new EventoHeranca(2025, 3, 17, 11, 30, "ECOP");

        System.out.println(eventoD);
        System.out.println(eventoH);
    }
}

