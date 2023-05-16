package Arquivo;

public abstract class ArquivoImagem extends Arquivo{
    @Override
    public void abrir() {
        System.out.println("Arquivo tipo imagem aberto");
    }

    @Override
    public void fechar() {
        System.out.println("Arquivo tipo imagem fechado");
    }
}

