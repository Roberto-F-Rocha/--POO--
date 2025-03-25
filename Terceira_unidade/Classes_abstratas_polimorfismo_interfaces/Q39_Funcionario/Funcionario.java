package Terceira_unidade.Classes_abstratas_polimorfismo_interfaces.Q39_Funcionario;

public class Funcionario {
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioPorHora = 2.0;
        this.horasTrabalhadas = 0;
    }

    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = 0;
    }

    public void registrarHoras(double horas) {
        this.horasTrabalhadas += horas;
    }

    public double calcularSalario() {
        return this.salarioPorHora * this.horasTrabalhadas;
    }

    public void exibirNome() {
        System.out.println(nome);
    }
}