package Reuso_Classes.Q32_Funcionario;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double aumento) {
        salario += aumento;
    }

    public double ganhoAnual() {
        return salario * 12 + salario / 12; // 13º salário
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: " + salario;
    }
}

