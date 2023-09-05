public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(10, 5);

        Animal leao = new Animal("Leão", 5, 200, "Felino");
        zoo.adicionarAnimal(leao);

        Veterinario veterinario = new Veterinario("João", "Veterinário", 5000, "Animais selvagens");
        veterinario.realizarExame(leao);

        Mamifero elefante = new Mamifero("Elefante", 10, 5000, "Proboscidea", "Pelos grossos");
        elefante.amamentar();

        Ave papagaio = new Ave("Papagaio", 3, 0.5, "Psittacidae", 0.8);
        papagaio.voar();
        papagaio.realizarTruque();

        leao.movimentar();
        leao.movimentar("Correndo");

        Funcionario cuidador = new Funcionario("Maria", "Cuidador", 3000);
        zoo.adicionarFuncionario(cuidador);
    }
}