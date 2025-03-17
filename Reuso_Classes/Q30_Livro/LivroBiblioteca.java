package Reuso_Classes.Q30_Livro;

class LivroBiblioteca extends Livro {
    int exemplar;

    public LivroBiblioteca(String titulo, String autor, int ano, int exemplar) {
        super(titulo, autor, ano);
        this.exemplar = exemplar;
    }

    @Override
    public String toString(){
        return (super.toString() + exemplar);
    }
}