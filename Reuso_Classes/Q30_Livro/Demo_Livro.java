package Reuso_Classes.Q30_Livro;

public class Demo_Livro {
    public static void main(String[] args) {
        LivroLivraria livroLivraria = new LivroLivraria("POO", "D", 1000, 1.0);
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("JAVA", "D", 1600, 1);

        System.out.println(livroLivraria);
        System.out.println(livroBiblioteca);
    }
}
