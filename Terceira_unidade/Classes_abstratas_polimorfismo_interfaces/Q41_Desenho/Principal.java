package Terceira_unidade.Classes_abstratas_polimorfismo_interfaces.Q41_Desenho;

public class Principal {
    public static void main(String[] args) {
        Desenho desenho1 = new Desenho(new Circulo(), 1, 2, new Quadrado(), 3, 4);
        Desenho desenho2 = new Desenho(new Quadrado(), 5, 6, new Triangulo(), 7, 8);

        desenho1.apresenta();
        desenho2.apresenta();
    }
}

