package secao6;

import java.util.Scanner;

public class ClassificacaoProduto {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Produtos
    String produto1 = "Teclado";
    String produto2 = "Mouse";
    String produto3 = "Monitor";

    double preco = 0;

    System.out.println("Digite o nome do produto: ");
    String nomeProduto = sc.nextLine();

    // Ver se o produto ta no catalogo
    if (produto1.equalsIgnoreCase(nomeProduto) || produto2.equalsIgnoreCase(nomeProduto) || produto3.equalsIgnoreCase(nomeProduto)) {
      System.out.println("Produto já existe. Quer atualizar o preço? (Sim/Não)");
      String resposta = sc.nextLine();
      if (resposta.equalsIgnoreCase("Sim")) {
        System.out.println("Insira o novo preço: ");
        preco = sc.nextDouble();
        
      }else{
        System.out.println("Preço não atualizado");
        sc.close();
        return;
      }

    }else{
      System.out.println("Insira o preço do produto: ");
      preco = sc.nextDouble();
    }

    // Classificacao
    if (preco < 50) {
      System.out.println("Classificação: barato");
      
    }else if (preco >= 50 && preco <= 100) {

      System.out.println("Classificação: moderado");
      
    }else{
      System.out.println("Classificação: caro");
    }

    System.out.println("Produto: " + nomeProduto + ". Preço: "  + preco);

    sc.close();


  }
  
}
