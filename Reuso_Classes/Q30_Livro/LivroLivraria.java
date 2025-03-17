package Reuso_Classes.Q30_Livro;

class LivroLivraria extends Livro {
    double preco;

    public LivroLivraria(String titulo, String autor, int ano, double preco) {
        super(titulo, autor, ano);
        this.preco = preco;
    }
    @Override 
    public String toString(){
        return(super.toString() + preco);
    }

}
