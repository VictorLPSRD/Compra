package compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        String[] produtos = {};
        Float[] valores = {};

        while (true) {
            System.out.print("Carrinho de Compras:\n");

       
            System.out.println("\nEscolha a operação:\n");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Sair\n");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            limpar.limparTerminal();
   
            if (opcao == 1) {
                System.out.println("Você escolheu adicionar produto:\n");
         
                Object[] arrays = Adicionar.adicionarProduto(scanner, produtos, valores);
                produtos = (String[]) arrays[0];
                valores = (Float[]) arrays[1];
            } else if (opcao == 2) {
             
                Listar.listarProdutos(produtos , valores);
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break; 
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close(); // Fechar o scanner quando não for mais necessário
    }
}
