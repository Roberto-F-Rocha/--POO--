package Terceira_unidade.Classes_abstratas_polimorfismo_interfaces.Q41_Desenho;

/*40. Crie a classe FiguraGeometrica que possui um método abstrato descricao(). Crie também as classes Circulo, Quadrado e Triangulo que são subclasses da classe FiguraGeometrica e implementam o método descricao() apropriado para sua classe. Por fim, crie
uma classe Principal com um método main que cria um objeto de cada uma das classes
e chama seus respectivos métodos descricao().
• O método descricao() deve exibir um texto que descreva a figura.*/

abstract class FiguraGeometrica {
    abstract void descricao();
}
