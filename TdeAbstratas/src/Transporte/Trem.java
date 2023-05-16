package Transporte;

public class Trem extends Transporte {
    @Override
    public void carregar() {
        System.out.println("Trem carregando a carga.");
    }

    @Override
    public void descarregar() {
        System.out.println("Trem descarregando a carga.");
    }
}

