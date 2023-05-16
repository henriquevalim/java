package Pagamento;

public abstract class Dinheiro extends  Pagamento{
    private double valorPagamento;

    public Dinheiro(double valorPago) {
        this.valorPagamento = valorPagamento;
    }

    public void realizarPagamento(double valor) {
        // Implementação da lógica para pagamento em dinheiro
        if (valorPagamento >= valor) {
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso em dinheiro");
        } else {
            System.out.println("Valor insuficiente para pagamento em dinheiro");
        }
    }

    public void emitirRecibo() {
        // Implementação da lógica para emissão de recibo para pagamento em dinheiro
        System.out.println("Recibo de pagamento em dinheiro no valor de R$" + valorPagamento + " emitido com sucesso");
    }
}
