package Reuso_Classes.Q28_Equipamento;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento eq = new Equipamento("HP", 1500.0);
        Computador pc = new Computador("Dell", 3000.0, 16, 2.5);

        System.out.println(eq);
        System.out.println(pc);
    }
}

