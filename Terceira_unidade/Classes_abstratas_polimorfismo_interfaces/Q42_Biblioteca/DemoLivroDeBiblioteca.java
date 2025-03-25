package Terceira_unidade.Classes_abstratas_polimorfismo_interfaces.Q42_Biblioteca;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("J", "C", 2, 2023, "C-3, P-B");
        
        System.out.println(livro);

        livro.empresta();
        System.out.println(livro);

        livro.devolve();
        System.out.println("devolver: " + livro);
    }
}

