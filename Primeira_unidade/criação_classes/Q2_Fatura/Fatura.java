package Primeira_unidade.criação_classes.Q2_Fatura;

public class Fatura {
    String numero_identificacao, descricao;
    int qtd_comprada;
    double preco;

    public Fatura (String numero_identificacao, String descricao, int qtd_comprada, double preco){
        this.numero_identificacao = numero_identificacao;
        this.descricao = descricao;
        this.qtd_comprada = (qtd_comprada > 0) ? qtd_comprada : 0;
        this.preco = (preco > 0) ? preco : 0;
    }

    public double calculaTotal(){
        return(qtd_comprada * preco);
    }

    @Override
    public String toString(){
    return(numero_identificacao + " " + descricao + " " +qtd_comprada + " " + preco + " " + calculaTotal());
    }

}
