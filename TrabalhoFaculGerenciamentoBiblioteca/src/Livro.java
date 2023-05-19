
class Livro extends Produto {
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String detalhesDoProduto() {
        return "Título: " + getTitulo() + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nDisponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível");
    }

    public void setTitulo(String titulo) {
        setTitulo(titulo, 0);
    }

    public void setTitulo(String titulo, int edicao) {
        super.setTitulo(titulo + " - Edição " + edicao);
    }
}