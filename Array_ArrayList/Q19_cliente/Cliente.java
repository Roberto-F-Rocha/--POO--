package Array_ArrayList.Q19_cliente;
class Cliente {
    private int id, idade;
    private String nome, telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return id + " " + nome + " " + idade + " " + telefone;
    }
}