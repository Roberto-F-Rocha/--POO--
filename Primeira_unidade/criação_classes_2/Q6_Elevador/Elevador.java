package Primeira_unidade.criação_classes_2.Q6_Elevador;

public class Elevador {
    private int andar_atual, qtd_andares, capacidade, qtd_pessoas;
    public Elevador(int qtd_andares, int capacidade){
        this.andar_atual = 0;
        this.qtd_andares = qtd_andares;
        this.capacidade = qtd_pessoas;
        this.qtd_pessoas = 0;
    }

    public void sobe(){
        if(andar_atual < qtd_andares){
            andar_atual++;
        }
    }

    public void desce(){
        if(andar_atual > 0){
            andar_atual--;
        }
    }

    public void entra(){
        if(qtd_pessoas < capacidade){
            qtd_pessoas++;
        }
    }

    public void sai(){
        if(qtd_pessoas > 0){
            qtd_pessoas--;
        }
    }

}
