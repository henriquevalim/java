package Impressora;

public class ImpressoraLaser extends Impressora {
    @Override
    public void imprimir(String documento) {
        System.out.println("Impressão a laser: " + documento);
    }

    @Override
    public void escanear() {
        System.out.println("Escaneando o documento na impressora a laser.");
    }
}
