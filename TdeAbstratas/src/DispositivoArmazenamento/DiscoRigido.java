package DispositivoArmazenamento;

public class DiscoRigido extends DispositivoArmazenamento {
    @Override
    public void lerDados() {
        System.out.println("Lendo dados do disco rígido.");
    }

    @Override
    public void gravarDados() {
        System.out.println("Gravando dados no disco rígido.");
    }
}

