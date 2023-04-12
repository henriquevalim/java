public class Loja {
    Produto produto1;
    Produto produto2;
    Produto produto3;

    public Loja() {
        produto1 = null;
        produto2 = null;
        produto3 = null;
    }

    public void adicionarProduto(Produto produto) {
        if (produto1 == null) {
            produto1 = produto;
        } else if (produto2 == null) {
            produto2 = produto;
        } else if (produto3 == null) {
            produto3 = produto;
        }else{
            System.out.println("Não foi possível adicionar mais produtos");
        }
    }
    public void removerProduto(Produto produto) {
        if (produto1 == produto) {
            produto1 = null;
        } else if (produto2 == produto) {
            produto2 = null;
        } else if (produto3 == produto) {
            produto3 = null;
        } else {
            System.out.println("Produto não foi encontrado");
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos disponíveis na loja");
        if (produto1 != null) {
            System.out.println(produto1.getNome() + " Preço: R$" + produto1.getPreco() + " - Quantidade: " + produto1.getQuantidade());
        }
        if (produto2 != null) {
            System.out.println(produto2.getNome() + " Preço R$" + produto2.getPreco() + " - Quantidade: " + produto2.getQuantidade());
        }
        if (produto3 != null) {
            System.out.println(produto3.getNome() + " Preço R$" + produto3.getPreco() + " - Quantidade " + produto3.getQuantidade());
        }
    }
    public void venderProduto(Produto produto, int quantidade) {
        if (produto == produto1) {
            if (produto1.getQuantidade() >= quantidade) {
                produto1.setQuantidade(produto1.getQuantidade() - quantidade);
                System.out.println("Venda realizada");
            } else {
                System.out.println("Não há estoque para a venda");
            }
        } else if (produto == produto2) {
            if (produto2.getQuantidade() >= quantidade) {
                produto2.setQuantidade(produto2.getQuantidade() - quantidade);
                System.out.println("Venda realizada");
            } else {
                System.out.println("Não há estoque para a venda");
            }
        } else if (produto == produto3) {
            if (produto3.getQuantidade() >= quantidade) {
                produto3.setQuantidade(produto3.getQuantidade() - quantidade);
                System.out.println("Venda realizada com sucesso.");
            } else {
                System.out.println("Não há estoque suficiente para realizar a venda.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void adicionarEstoque(Produto produto, int quantidade) {
        if (produto == produto1) {
            produto1.setQuantidade(produto1.getQuantidade() + quantidade);
            System.out.println("Estoque atualizado!");
        } else if (produto == produto2) {
            produto2.setQuantidade(produto2.getQuantidade() + quantidade);
            System.out.println("Estoque atualizado!");
        } else if (produto == produto3) {
            produto3.setQuantidade(produto3.getQuantidade() + quantidade);
            System.out.println("Estoque atualizado!");
        } else {
            System.out.println("Produto não encontrado na loja.");
        }
    }
}

