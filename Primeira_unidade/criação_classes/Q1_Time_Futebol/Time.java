package Primeira_unidade.criação_classes.Q1_Time_Futebol;
public class Time {
    String nome_time;
    int vitorias, derrotas;
    public Time(String nome_time, int vitorias, int derrotas){
        this.nome_time = nome_time;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
    }

    public void qtd_Vitoias(){
        this.vitorias ++;
    }

    public void qtd_Derrotas(){
        this.derrotas++;
    }

    @Override
    public String toString(){
        return(nome_time + " " + vitorias + " " + derrotas);
    }
}
