package Primeira_unidade.criação_classes_2.Q12_Generica;

public class Demo {    public static void main(String[] args) {
    Generica<Integer> g1 = new Generica<>(1, 2, 1);
    Generica<String> g2 = new Generica<>("J", "J", "P");

    System.out.println(g1);
    System.out.println(g1.iguais());

    System.out.println(g2);
    System.out.println(g2.iguais());
}
}
