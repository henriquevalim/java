package Impressora;

public class ImpressoraMatricial extends Impressora {
    @Override
    public void imprimir(String documento) {
        System.out.println("Impressão matricial: " + documento);
    }

    @Override
    public void escanear() {
        System.out.println("Não é possível escanear na impressora matricial.");
    }
}