package Primeira_unidade.criação_classes_2.Q11_Registro;

public class RegistroAcademico {
    private static int numeroDeMatriculas = 0;
    private int matricula;
    private String nome;

    public RegistroAcademico(String nome){
        numeroDeMatriculas++;
        this.matricula = numeroDeMatriculas;
        this.nome = nome;
    }

    public int getMatricula(){
        return(matricula);
    }

    public String getNome(){
        return(nome);
    }

    public static int getNumeroDeMatricula(){
        return(numeroDeMatriculas);
    }
}
