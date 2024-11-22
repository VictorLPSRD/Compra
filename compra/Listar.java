package compra;

public class Listar {
    // Método para listar os produtos do carrinho
    public static void listarProdutos(String[] produtos, Float[] valores) {
        if (produtos.length == 0) {
            System.out.println("O carrinho está vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            for (int i = 0; i < produtos.length; i++) {
                // Para cada produto, imprime o nome e o valor correspondente
                System.out.println("Nome: " + produtos[i] + " | Valor: " + valores[i]);
            }
        }
    }
}
