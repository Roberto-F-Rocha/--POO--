package Primeira_unidade.criação_classes_2.Q10_Maior;

public class Maior {
    public static int max(int a, int b){
        return(a > b) ? a : b;
    }
    public static int max(int a, int b, int c){
        return (max(max(a, b), c));
    }
    public static int max(int a, int b, int c, int d){
        return (max(max(a, b, c), d));
    }
    public static int max(int a, int b, int c, int d, int e){
        return (max(max(a, b, c, d), e));
    }

    public static double max(double a, double b){
        return((a > b) ? a : b);
    }
    public static double max(double a, double b, double c){
        return (max(max(a, b), c));
    }
    public static double max(double a, double b, double c, double d){
        return(max(max(a, b, c), d));
    }
    public static double max(double a, double b, double c, double d, double e){
        return(max(max(a, b, c, d), e));
    }
}
