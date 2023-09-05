// Parte 1: Construtores, Classes e Objetos

// Classe Animal
class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String especie;

    /**
     * Construtor da classe Animal.
     *
     * @param nome   O nome do animal.
     * @param idade  A idade do animal.
     * @param peso   O peso do animal.
     * @param especie A espécie do animal.
     */
    public Animal(String nome, int idade, double peso, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.especie = especie;
    }
    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    /**
     * Movimenta o animal de maneira padrão.
     */
    public void movimentar() {
        System.out.println("Animal se moveu de maneira padrão: " + getNome());
    }

    /**
     * Movimenta o animal de uma maneira específica.
     *
     * @param movimento O movimento específico do animal.
     */
    public void movimentar(String movimento) {
        System.out.println("Animal se moveu de maneira específica: " + movimento);
    }
}