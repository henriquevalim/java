package Funcionario;

public class Vendedor extends Funcionario{
    double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Vendedor " + nome + "Realizando tarefas de vendedor");
    }

    @Override
    public double calcularSalario() {
        return salario + comissao;
    }
}
