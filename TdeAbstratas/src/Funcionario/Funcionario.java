package Funcionario;

public abstract class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void realizarTarefa();
    public abstract double calcularSalario();
}
