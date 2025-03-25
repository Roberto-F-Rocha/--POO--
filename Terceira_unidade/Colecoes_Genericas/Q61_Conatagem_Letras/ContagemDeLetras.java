package Terceira_unidade.Colecoes_Genericas.Q61_Conatagem_Letras;

import java.util.Map;
import java.util.TreeMap;

public class ContagemDeLetras {
    public static void main(String[] args) {
        String texto = "JAVA";
        Map<Character, Integer> mapaDeLetras = new TreeMap<>();

        for (char letra : texto.toCharArray())
            if (Character.isLetter(letra))
                mapaDeLetras.put(letra, mapaDeLetras.getOrDefault(letra, 0) + 1);

        mapaDeLetras.forEach((letra, ocorrencias) -> System.out.println(letra + ": " + ocorrencias));
    }
}


