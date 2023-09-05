// Parte 4: Arrays e Associações

// Classe Zoo
class Zoo {
    private Animal[] animais;
    private Funcionario[] funcionarios;
    private int numAnimais;
    private int numFuncionarios;

    /**
     * Construtor da classe Zoo.
     *
     * @param capacidadeAnimais     A capacidade máxima de animais que o zoológico pode abrigar.
     * @param capacidadeFuncionarios A capacidade máxima de funcionários que o zoológico pode ter.
     */
    public Zoo(int capacidadeAnimais, int capacidadeFuncionarios) {
        animais = new Animal[capacidadeAnimais];
        funcionarios = new Funcionario[capacidadeFuncionarios];
        numAnimais = 0;
        numFuncionarios = 0;
    }
    /**
     * Adiciona um animal ao zoológico.
     *
     * @param animal O animal a ser adicionado.
     */
    public void adicionarAnimal(Animal animal) {
        if (numAnimais < animais.length) {
            animais[numAnimais] = animal;
            numAnimais++;
            System.out.println("Animal adicionado ao zoológico: " + animal.getNome());
        } else {
            System.out.println("Capacidade máxima de animais atingida. Não é possível adicionar mais animais.");
        }
    }
    /**
     * Adiciona um funcionário ao zoológico.
     *
     * @param funcionario O funcionário a ser adicionado.
     */
    public void adicionarFuncionario(Funcionario funcionario) {
        if (numFuncionarios < funcionarios.length) {
            funcionarios[numFuncionarios] = funcionario;
            numFuncionarios++;
            System.out.println("Funcionário adicionado ao zoológico: " + funcionario.getNome());
        } else {
            System.out.println("Capacidade máxima de funcionários atingida. Não é possível adicionar mais funcionários.");
        }
    }
}