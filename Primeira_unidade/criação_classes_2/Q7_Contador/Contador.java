package Primeira_unidade.criação_classes_2.Q7_Contador;

public class Contador {
    private int valor;

    public Contador(){
        this.valor = 0;
    }

    public void zerar(){
        this.valor = 0;
    }

    public void incrementar(){
        this.valor++;
    }

    public void imprimir(){
        System.out.println(this.valor);
    }

}
