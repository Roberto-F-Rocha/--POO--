package Terceira_unidade.Colecoes_Genericas.Q63_Atendimento;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Paciente{
    int rg, idade;
    Paciente(int rg, int idade){
        this.rg = rg;
        this.idade = idade;
    }
}

public class Consultorio{
    public static void main(String[] args){
        Queue<Paciente> prioridade = new LinkedList<>();
        Queue<Paciente> comum = new LinkedList<>();
        Random random = new Random();

        int tempo = 0, atendidos = 0;
        int proximoPaciente = 0;

        while (atendidos < 20) {
            if (tempo == proximoPaciente && atendidos + prioridade.size() + comum.size() < 20){
                int rg = 1000 + random.nextInt(9000);
                int idade = random.nextInt(100);
                (idade > 60 ? prioridade : comum).add(new Paciente(rg, idade));
                proximoPaciente += 4;
            }

            if (tempo % 5 == 0 && atendidos < 20) {
                if (!prioridade.isEmpty()) prioridade.poll();
                else if (!comum.isEmpty()) comum.poll();
                atendidos++;
            }
            tempo++;
        }
    }
}
