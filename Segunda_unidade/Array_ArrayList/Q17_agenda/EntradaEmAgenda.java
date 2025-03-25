package Array_ArrayList.Q17_agenda;
import java.util.ArrayList;

class EntradaEmAgenda {
    private int hora, dia, mes, ano;
    private String assunto;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        return this.dia == dia && this.mes == mes && this.ano == ano;
    }

    @Override
    public String toString() {
        return hora + " " + dia + " " + mes + " " + ano + " " + assunto;
    }
}

class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        compromissos = new ArrayList<>();
    }

    public void adicionarCompromisso(EntradaEmAgenda compromisso) {
        compromissos.add(compromisso);
    }

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda compromisso : compromissos) {
            if (compromisso.ehNoDia(dia, mes, ano)) {
                System.out.println(compromisso);
            }
        }
    }
}
