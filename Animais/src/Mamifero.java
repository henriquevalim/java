// Parte 2: Herança e Polimorfismo

// Subclasse Mamifero
class Mamifero extends Animal {
    private String tipoPelagem;

    /**
     * Construtor da classe Mamifero.
     *
     * @param nome        O nome do mamífero.
     * @param idade       A idade do mamífero.
     * @param peso        O peso do mamífero.
     * @param especie     A espécie do mamífero.
     * @param tipoPelagem O tipo de pelagem do mamífero.
     */
    public Mamifero(String nome, int idade, double peso, String especie, String tipoPelagem) {
        super(nome, idade, peso, especie);
        this.tipoPelagem = tipoPelagem;
    }

    /**
     * Realiza a amamentação do mamífero.
     */
    public void amamentar() {
        System.out.println("Mamífero está amamentando: " + getNome());
    }
}