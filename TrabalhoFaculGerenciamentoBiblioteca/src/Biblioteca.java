class Biblioteca {
    private Livro livro1;
    private Livro livro2;
    private Livro livro3;
    private Livro livro4;
    private Livro livro5;

    public void adicionarLivro(Livro livro) {
        if (livro1 == null) {
            livro1 = livro;
        } else if (livro2 == null) {
            livro2 = livro;
        } else if (livro3 == null) {
            livro3 = livro;
        } else if (livro4 == null) {
            livro4 = livro;
        } else if (livro5 == null) {
            livro5 = livro;
        } else {
            System.out.println("Não é possível adicionar mais livros. A biblioteca está cheia.");
        }
    }

    public void removerLivro(Livro livro) {
        if (livro1 == livro) {
            livro1 = null;
        } else if (livro2 == livro) {
            livro2 = null;
        } else if (livro3 == livro) {
            livro3 = null;
        } else if (livro4 == livro) {
            livro4 = null;
        } else if (livro5 == livro) {
            livro5 = null;
        }
    }

    public void atualizarDetalhesLivro(Livro livro, String novoTitulo, String novoAutor, int novoAnoPublicacao) {
        livro.setTitulo(novoTitulo);
        livro.setAutor(novoAutor);
        livro.setAnoPublicacao(novoAnoPublicacao);
    }

    public boolean verificarDisponibilidadeLivro(Livro livro) {
        return livro.isDisponibilidade();
    }
}