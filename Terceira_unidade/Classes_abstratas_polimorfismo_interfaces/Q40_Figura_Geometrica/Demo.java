package Terceira_unidade.Classes_abstratas_polimorfismo_interfaces.Q40_Figura_Geometrica;

public class Demo {
    public static void main(String[] args) {
        FiguraGeometrica c = new Circulo();
        FiguraGeometrica q = new Quadrado();
        FiguraGeometrica t = new Triangulo();
        c.descricao();
        q.descricao();
        t.descricao();
    }
}
