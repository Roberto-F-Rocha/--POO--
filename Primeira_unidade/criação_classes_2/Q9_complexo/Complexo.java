package Primeira_unidade.criação_classes_2.Q9_complexo;

public class Complexo {
    private double real;
    private double imaginario;

    public Complexo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo(double real){
        this.real = real;
        this.imaginario = 0;
    }

    public Complexo(){
        this.real = 0;
        this.imaginario = 0;
    }

    @Override
    public String toString(){
        return String.format("%.2f %s %.2fi", real, (imaginario >= 0) ? "+" : "", imaginario);
    }

}
