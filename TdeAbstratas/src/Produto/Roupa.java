package Produto;

public abstract class Roupa extends Produto {
    String nome;
    double preco;
    String detalhes;

    public Roupa(String nome, double preco, String detalhes) {
        this.nome = nome;
        this.preco = preco;
        this.detalhes = detalhes;
    }

    @Override
    public void calcularPreco() {
        System.out.println("A roupa " + nome + "Tem o preço de:" + preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Sua roupa é: " + detalhes);
    }
}
