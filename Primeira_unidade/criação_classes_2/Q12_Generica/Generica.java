package Primeira_unidade.criação_classes_2.Q12_Generica;

public class Generica<T> {
    private T n1, n2, n3;

    public Generica(T n1, T n2, T n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int iguais() {
        int cont = 0;

        if (n1.equals(n2) && n2.equals(n3)) {
            cont = 3;
        } else if (n1.equals(n2) || n1.equals(n3) || n2.equals(n3)) {
            cont = 2;
        }
        
        return (cont);
    }

    @Override
    public String toString() {
        return (n1 + " " + n2 + " " + n3);
    }
}
