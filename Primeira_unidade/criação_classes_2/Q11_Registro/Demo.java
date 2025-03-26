package Primeira_unidade.criação_classes_2.Q11_Registro;

public class Demo {
    public static void main(String[] args) {
        RegistroAcademico ra1 = new RegistroAcademico("java");
        RegistroAcademico ra2 = new RegistroAcademico("avaj");

        System.out.println(ra1.getNome() + " " + ra1.getMatricula());
        System.out.println(ra2.getNome() + " " + ra2.getMatricula());

        System.out.println(RegistroAcademico.getNumeroDeMatricula());
    }
}
