package Jogador;

public class Goleiro extends Jogador{
    int defesas;

    public Goleiro(String nome, int defesas) {
        super(nome);
        this.defesas = defesas;
    }

    @Override
    public void atacar() {
        System.out.println("Goleiro atacando");
    }

    @Override
    public void defender() {
        System.out.println("Defendendo com" + defesas + "Feitas");
    }
}
