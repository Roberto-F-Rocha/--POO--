package Reuso_Classes.Q28_Equipamento;

class Equipamento {
    private String marca;
    private double preco;

    public Equipamento(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return marca + " " + preco;
    }
}

class Computador extends Equipamento {
    private int memoria;
    private double processador;

    public Computador(String marca, double preco, int memoria, double processador) {
        super(marca, preco);
        this.memoria = memoria;
        this.processador = processador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public double getProcessador() {
        return processador;
    }

    public void setProcessador(double processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return super.toString() + " " + memoria + " " + processador;
    }
}
