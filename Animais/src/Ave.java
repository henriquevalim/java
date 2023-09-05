
// Subclasse Ave
class Ave extends Animal implements Treinavel {
    private double envergaduraAsa;

    /**
     * Construtor da classe Ave.
     *
     * @param nome           O nome da ave.
     * @param idade          A idade da ave.
     * @param peso           O peso da ave.
     * @param especie        A espécie da ave.
     * @param envergaduraAsa A envergadura das asas da ave.
     */
    public Ave(String nome, int idade, double peso, String especie, double envergaduraAsa) {
        super(nome, idade, peso, especie);
        this.envergaduraAsa = envergaduraAsa;
    }

    /**
     * Faz a ave voar.
     */
    public void voar() {
        System.out.println("Ave está voando: " + getNome());
    }

    /**
     * Realiza um truque voador.
     */
    public void realizarTruque() {
        System.out.println("Ave realizou um truque voador: " + getNome());
    }
}
