package Reuso_Classes.Q32_Funcionario;

public class Assistente extends Funcionario {
    int matricula;

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula;
    }
}

