package Terceira_unidade.Classes_abstratas_polimorfismo_interfaces.Q42_Biblioteca;

public interface ItemDeBiblioteca {
    int maximoDeDiasParaEmprestimo = 14;

    boolean estaEmprestado();
    void empresta();
    void devolve();
    String localizacao();
    String descricao();
}
