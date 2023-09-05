// Subclasse Veterinario
class Veterinario extends Funcionario {
    private String especialidade;

    /**
     * Construtor da classe Veterinario.
     *
     * @param nome         O nome do veterinário.
     * @param cargo        O cargo do veterinário.
     * @param salario      O salário do veterinário.
     * @param especialidade A especialidade do veterinário.
     */
    public Veterinario(String nome, String cargo, double salario, String especialidade) {
        super(nome, cargo, salario);
        this.especialidade = especialidade;
    }

    /**
     * Realiza um exame em um animal.
     *
     * @param animal O animal a ser examinado.
     */
    public void realizarExame(Animal animal) {
        System.out.println("Veterinário está realizando um exame no animal: " + animal.getNome());
    }
}