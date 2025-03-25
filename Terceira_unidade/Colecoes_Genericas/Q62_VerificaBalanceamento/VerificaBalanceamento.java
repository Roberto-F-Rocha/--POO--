package Terceira_unidade.Colecoes_Genericas.Q62_VerificaBalanceamento;

import java.util.Stack;

public class VerificaBalanceamento {
    public static boolean estaBalanceada(String entrada) {
        Stack<Character> pilha = new Stack<>();
        for (char c : entrada.toCharArray()) {
            if (c == '(') pilha.push(c);
            else if (c == ')' && (pilha.isEmpty() || pilha.pop() != '(')) return false;
        }
        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String[] testes = {"()", "()()", "()()()", "))", "((", "))(("};
        for (String teste : testes) System.out.println(estaBalanceada(teste));
    }
}

