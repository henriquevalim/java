package DispositivoArmazenamento;

public class CartaoMemoria extends DispositivoArmazenamento {
    @Override
    public void lerDados() {
        System.out.println("Lendo dados do cartão de memória.");
    }

    @Override
    public void gravarDados() {
        System.out.println("Gravando dados no cartão de memória.");
    }
}
