package compra;

import java.util.Arrays;
import java.util.Scanner;

public class Adicionar {
    // Método para adicionar produto
    public static Object[] adicionarProduto(Scanner scanner, String[] produtos, Float[] valores) {
        System.out.print("Informe o nome do Item: ");
        String item = scanner.nextLine();
    
        System.out.print("Informe o valor do Item: ");
        Float valorItem = scanner.nextFloat();

       
        produtos = Arrays.copyOf(produtos, produtos.length + 1);
        valores = Arrays.copyOf(valores, valores.length + 1);

    
        produtos[produtos.length - 1] = item;
        valores[valores.length - 1] = valorItem; 
        
        System.out.println("Produto adicionado com sucesso!");
        
        // Retorna ambos os arrays atualizados
        return new Object[] {produtos, valores};
    }
}
