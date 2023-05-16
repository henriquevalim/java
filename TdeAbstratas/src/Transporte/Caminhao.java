package Transporte;


public class Caminhao extends Transporte {
    @Override
    public void carregar() {
        System.out.println("Caminhão carregando a carga.");
    }

    @Override
    public void descarregar() {
        System.out.println("Caminhão descarregando a carga.");
    }
}
