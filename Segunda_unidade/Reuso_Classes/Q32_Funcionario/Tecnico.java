package Reuso_Classes.Q32_Funcionario;

public class Tecnico extends Assistente {
    double bonusSalarial;

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonusSalarial; // Inclui o bônus no 13º salário
    }

    @Override
    public String toString() {
        return super.toString() + ", Bônus Salarial: " + bonusSalarial;
    }
}

