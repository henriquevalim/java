package Transporte;


public class Navio extends Transporte {
    @Override
    public void carregar() {
        System.out.println("Navio carregando a carga.");
    }

    @Override
    public void descarregar() {
        System.out.println("Navio descarregando a carga.");
    }
}
