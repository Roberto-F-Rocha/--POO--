package Array_ArrayList.Q21_dardos;

import java.util.Random;

public class SimulacaoDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequencia = new int[13];
        
        for (int i = 0; i < 36000000; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int soma = dado1 + dado2;
            frequencia[soma]++;
        }
        
        for (int i = 2; i <= 12; i++) {
            System.out.println(i + " " + frequencia[i]);
        }
    }
}
