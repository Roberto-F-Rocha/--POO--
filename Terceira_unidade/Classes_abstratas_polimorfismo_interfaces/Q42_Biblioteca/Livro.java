package Terceira_unidade.Classes_abstratas_polimorfismo_interfaces.Q42_Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDaEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDaEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDaEdicao = anoDaEdicao;
    }

    public String qualTitulo() {
        return titulo;
    }

    public String qualAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return(titulo + " " + autor + " " + numeroDePaginas + " " + anoDaEdicao);
    }
}

