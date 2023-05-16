package Funcionario;

public class Gerente extends Funcionario{
    String funcao;

    public Gerente(String nome,double salario,String funcao){
        super(nome,salario);
        this.funcao = funcao;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Gerente "+ nome +"fazendo tarefas de gerente");
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
