public class Main {
    public static void main(String[]args){
        Produto produto1 = new Produto("Teclado", 200, 50);
        Produto produto2 = new Produto("Mouse", 150, 30 );
        Produto produto3 = new Produto("Monitor", 400, 90);

        Loja loja = new Loja();

        loja.adicionarProduto(produto1);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);

        loja.listarProdutos();

        loja.venderProduto(produto2, 9);

        loja.listarProdutos();

        loja.adicionarEstoque(produto1, 9);

        loja.listarProdutos();

        loja.removerProduto(produto3);

        loja.listarProdutos();
    }
}
