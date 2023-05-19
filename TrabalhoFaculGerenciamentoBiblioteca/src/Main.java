public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro();
        livro1.setTitulo("Livro 1");
        livro1.setAutor("Autor 1");
        livro1.setAnoPublicacao(2020);
        livro1.setDisponibilidade(true);

        Livro livro2 = new Livro();
        livro2.setTitulo("Livro 2",2);
        livro2.setAutor("Autor 2");
        livro2.setAnoPublicacao(2021);
        livro2.setDisponibilidade(false);

        Livro livro3 = new Livro();
        livro3.setTitulo("Livro 3");
        livro3.setAutor("Autor 3");
        livro3.setAnoPublicacao(2019);
        livro3.setDisponibilidade(true);

        Livro livro4 = new Livro();
        livro4.setTitulo("Livro 4",4);
        livro4.setAutor("Autor 4");
        livro4.setAnoPublicacao(2022);
        livro4.setDisponibilidade(true);

        Livro livro5 = new Livro();
        livro5.setTitulo("Livro 5");
        livro5.setAutor("Autor 5");
        livro5.setAnoPublicacao(2023);
        livro5.setDisponibilidade(false);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro1);

        System.out.println(livro1.detalhesDoProduto());
        System.out.println();
        System.out.println(livro2.detalhesDoProduto());
        System.out.println();
        System.out.println(livro3.detalhesDoProduto());
        System.out.println();
        System.out.println(livro4.detalhesDoProduto());
        System.out.println();
        System.out.println(livro5.detalhesDoProduto());

        biblioteca.atualizarDetalhesLivro(livro1, "Livro 1 Atualizado", "Novo Autor", 2022);

        boolean disponivelLivro1 = biblioteca.verificarDisponibilidadeLivro(livro1);
        System.out.println("Livro 1 Disponível? " + (disponivelLivro1 ? "Sim" : "Não"));

        boolean disponivelLivro2 = biblioteca.verificarDisponibilidadeLivro(livro2);
        System.out.println("Livro 2 Disponível? " + (disponivelLivro2 ? "Sim" : "Não"));

        biblioteca.removerLivro(livro2);

        System.out.println(livro1.detalhesDoProduto());
        System.out.println(livro2.detalhesDoProduto());
    }
}