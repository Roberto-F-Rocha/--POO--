package Terceira_unidade.Colecoes_Genericas.Q60_LinkedList;

import java.util.LinkedList;

public class InverterLinkedList{
    public static void main(String[] args) {
        LinkedList<Character> listaOriginal = new LinkedList<>();
        for (char c = 'A'; c <= 'J'; c++) listaOriginal.add(c); 

        LinkedList<Character> listaInvertida = new LinkedList<>();
        for (int i = listaOriginal.size() - 1; i >= 0; i--)
        listaInvertida.add(listaOriginal.get(i));

        System.out.println(listaOriginal);
        System.out.println(listaInvertida);
    }
}

