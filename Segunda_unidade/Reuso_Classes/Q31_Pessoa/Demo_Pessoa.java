package Reuso_Classes.Q31_Pessoa;

public class Demo_Pessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("I", 45);
        Politico politico = new Politico("M", 50, "PSL");
        Prefeito prefeito = new Prefeito("R", 40, "PT", "SP");
        Governador governador = new Governador("A", 55, "PMDB", "SP");

        System.out.println(p);
        System.out.println(politico);
        System.out.println(prefeito);
        System.out.println(governador);
    }
}
