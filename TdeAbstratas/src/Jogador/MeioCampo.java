package Jogador;

public class MeioCampo extends Jogador {
    int passes;

    public MeioCampo(String nome, int passes) {
        super(nome);
        this.passes = passes;
    }

    @Override
    public void atacar() {
        System.out.println("Atacando com " + passes + "Feitos");
    }

    @Override
    public void defender() {
        System.out.println("Meio campo defendendo");
    }
}
