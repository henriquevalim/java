package Jogador;

public class Atacante extends Jogador{
    int ataques;

    public Atacante(String nome, int ataques) {
        super(nome);
        this.ataques = ataques;
    }

    @Override
    public void atacar() {
        System.out.println("Atacando com " + ataques + "feitos");
    }

    @Override
    public void defender() {
        System.out.println("Atacante Defendendo");
    }
}
