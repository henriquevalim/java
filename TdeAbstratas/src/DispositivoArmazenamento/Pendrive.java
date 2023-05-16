package DispositivoArmazenamento;

public class Pendrive extends DispositivoArmazenamento {
    @Override
    public void lerDados() {
        System.out.println("Lendo dados do pendrive.");
    }

    @Override
    public void gravarDados() {
        System.out.println("Gravando dados no pendrive.");
    }
}
