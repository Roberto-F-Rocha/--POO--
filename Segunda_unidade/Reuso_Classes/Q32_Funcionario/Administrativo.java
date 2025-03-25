package Reuso_Classes.Q32_Funcionario;

public class Administrativo extends Assistente {
    String turno;
    double adicionalNoturno;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + (turno.equals("noite") ? adicionalNoturno * 12 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + ", Turno: " + turno + ", Adicional Noturno: " + adicionalNoturno;
    }
}
