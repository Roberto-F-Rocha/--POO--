package Primeira_unidade.criação_classes.Q3_Media;

public class Aluno {
    int matricula;
    String nome;
    double p1, p2, t;
    public Aluno(int matricula, String nome, double p1, double p2, double t){
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public double media(){
        return(2.5 * p1 + 2.5 * p2 + 2 * t) / 7;
    }

    public double provaFinal(){
        double mp = media();
        double ef=(mp * 6 - 5 * 10) / 4;
        if(mp < 3 || mp > 7){
            return(0);
        }
        return(ef);
    }
}