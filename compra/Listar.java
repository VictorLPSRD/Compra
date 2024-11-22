package compra;

public class Listar {

    public static void listarProdutos(String[] produtos, Float[] valores) {
        if (produtos.length == 0) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (int i = 0; i < produtos.length; i++) {
          
                System.out.println("Nome: " + produtos[i] + " | Valor: " + valores[i]);
            }
        }
    }
}
