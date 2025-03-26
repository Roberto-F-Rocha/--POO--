package Primeira_unidade.criação_classes.Q2_Fatura;

public class Demo {
    public static void main(String[] args) {
    Fatura f = new Fatura("cola", "branca", 5, 10.50);
    f.calculaTotal();
    System.out.println(f);
    }
}
