package Pagamento;

public abstract class CartaoDebito extends Pagamento {
    String numeroCartao;
    String nomeTitular;
    String dataValidade;
    int cvv;

    public CartaoDebito(String numeroCartao, String nomeTitular, String dataValidade, int cvv) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }
    public void realizarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + "realizado com sucesso no cartao de debito");
    }
    public void emitirRecibo(){
        System.out.println("Recibo de pagamento no Cartao de débito !!!!!!!!!!!");
    }
}
