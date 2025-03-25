package Array_ArrayList.Q17_agenda;
public class Demo_Agenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.adicionarCompromisso(new EntradaEmAgenda(10, 16, 9, 2024, "A"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(15, 16, 9, 2024, "B"));
        
        agenda.listaDia(16, 9, 2024);
    }
}