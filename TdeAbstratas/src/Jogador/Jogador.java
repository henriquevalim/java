package Jogador;

public abstract class Jogador {
    String nome;

    public Jogador(String nome) {
        this.nome = nome;
    }
    public abstract void atacar();
    public abstract void defender();
}
