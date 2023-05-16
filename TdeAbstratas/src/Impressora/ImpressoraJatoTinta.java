package Impressora;

public class ImpressoraJatoTinta extends Impressora{
    @Override
    public void imprimir(String documento) {
        System.out.println("Impressão a jato de tinta: " + documento);
    }
    public void escanear() {
        System.out.println("Escaneando o documento na impressora a jato de tinta.");
    }
}
