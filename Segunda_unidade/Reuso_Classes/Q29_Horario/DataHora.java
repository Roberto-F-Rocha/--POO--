package Reuso_Classes.Q29_Horario;
import java.time.LocalDateTime;

public class DataHora {
    LocalDateTime dataHora;

    public DataHora(int ano, int mes, int dia, int hora, int minuto) {
        dataHora = LocalDateTime.of(ano, mes, dia, hora, minuto);
    }

    @Override
    public String toString() {
        return (dataHora.toString());
    }
}
class EventoDelegacao {
    DataHora dataHora;
    String evento;

    public EventoDelegacao(int ano, int mes, int dia, int hora, int minuto, String evento) {
        dataHora = new DataHora(ano, mes, dia, hora, minuto);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return (evento + " - " + dataHora.toString());
    }
}

class EventoHeranca extends DataHora {
    String evento;

    public EventoHeranca(int ano, int mes, int dia, int hora, int minuto, String evento) {
        super(ano, mes, dia, hora, minuto);
        this.evento = evento;
    }

    @Override
    public String toString() {
        return (evento + " - " + super.toString());
    }
}

