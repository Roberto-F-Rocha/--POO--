package Terceira_unidade.Classes_abstratas_polimorfismo_interfaces.Q42_Biblioteca;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private boolean emprestado;
    private String localizacao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localizacao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.emprestado = false;
        this.localizacao = localizacao;
    }

    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }
     
    @Override
    public void empresta() {
        emprestado = true;
    }

    @Override
    public void devolve() {
        emprestado = false;
    }

    @Override
    public String localizacao() {
        return localizacao;
    }

    @Override
    public String descricao() {
        return qualTitulo() + " " + qualAutor();
    }

    @Override
    public String toString() {
        return super.toString() + " " + localizacao + " " + (emprestado ? "Sim" : "Não");
    }
}

