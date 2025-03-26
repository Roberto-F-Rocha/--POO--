package Primeira_unidade.criação_classes.Q1_Time_Futebol;

public class Demo_Time {
    public static void main(String [] args){
        Time t = new Time("javaFC", 2, 4);
        t.qtd_Derrotas();
        t.qtd_Vitoias();
        System.out.println(t);
    }
}
