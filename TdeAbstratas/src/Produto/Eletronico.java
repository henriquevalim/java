package Produto;

public abstract class Eletronico extends Produto{
String nome;
double valor;
String descricao;

    public Eletronico(String nome, double valor, String descricao) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public void calcularPreco() {
        System.out.println("O eletrônico " + nome + "Tem o preço de: " + valor);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("A descrição do eletrônico é " + descricao);
    }
}
