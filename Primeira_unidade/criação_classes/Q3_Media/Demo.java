package Primeira_unidade.criação_classes.Q3_Media;
public class Demo{
    public static void main(String[] args) {
        Aluno a = new Aluno(123, "java", 7,4, 5);
        System.out.println(a.media() + " " + a.provaFinal());
    }
}