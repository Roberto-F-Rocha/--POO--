package Primeira_unidade.criação_classes_2.Q8_Lampada;

public class Lampada {
    private boolean estadoDaLampada;
    private ContadorLampada CL;
    public Lampada(){
        this.estadoDaLampada = false;
        CL = new ContadorLampada();
    }

    public void acende(){
        if(estadoDaLampada == false){
            this.estadoDaLampada = true;
            CL.incrementarLampada();
        }
    }

    public void apaga(){
        if(estadoDaLampada == true){
            this.estadoDaLampada = false;
        }
    }

    public boolean estaLigada() {
        return estadoDaLampada;
    }

    public void mostraEstado(){
        if(estadoDaLampada == true){
            System.out.println("A lampada esta acesa");
        }
        else{
            System.out.println("A lampada esta apagada");
        }
    }

    public void mostrarComatagem(){
        System.out.println(CL.getValorLampada());
    }

}
