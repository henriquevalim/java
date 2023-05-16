package Funcionario;

public class Estagiario extends Funcionario{
    int tarefasFeitas;

    public Estagiario(String nome, double salario, int tarefasFeitas) {
        super(nome, salario);
        this.tarefasFeitas = tarefasFeitas;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Estagiario " + nome + "fazendo tarefas de estagiario");
    }

    @Override
    public double calcularSalario() {
        return salario + tarefasFeitas;
    }
}
