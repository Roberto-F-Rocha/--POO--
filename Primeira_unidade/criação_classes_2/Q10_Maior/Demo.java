package Primeira_unidade.criação_classes_2.Q10_Maior;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Maior.max(1, 2));
        System.out.println(Maior.max(1, 3, 5));
        System.out.println(Maior.max(2, 4, 6, 8));
        System.out.println(Maior.max(1, 3, 5, 7, 9));

        System.out.println(Maior.max(1.5, 2.5));
        System.out.println(Maior.max(1.5, 3.5, 5.5));
        System.out.println(Maior.max(2.5, 4.5, 6.5, 8.5));
        System.out.println(Maior.max(1.5, 3.5, 5.5, 7.5, 9.5));

    }
}
