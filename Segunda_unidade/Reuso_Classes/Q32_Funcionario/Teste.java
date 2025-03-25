package Reuso_Classes.Q32_Funcionario;

public class Teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 2500);
        Assistente a = new Assistente("Maria", 2000, 123);
        Tecnico t = new Tecnico("Carlos", 3000, 124, 500);
        Administrativo adm = new Administrativo("Ana", 2200, 125, "noite", 300);

        System.out.println(f);
        System.out.println(a);
        System.out.println(t);
        System.out.println(adm);
        
        System.out.println("Ganho Anual do Técnico: " + t.ganhoAnual());
        System.out.println("Ganho Anual do Administrativo: " + adm.ganhoAnual());
    }
}
