package Produto;

public abstract class Livro extends Produto {
    String nome;
    double preco;
    String sinopse;

    public Livro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void calcularPreco() {
        System.out.println("Livro do nome" + nome + " tem o preço de: " + preco + ".");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("A sinopse do livro" + nome + " é: " + sinopse);
    }
}
