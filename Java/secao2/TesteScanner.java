package secao2;

import java.util.Scanner;

public class TesteScanner {
  
  public static void main(String[] args) {
    
    // 1 - testando scanner
    Scanner scanner = new Scanner(System.in);

    // Mensagem para o usuario entender oq precisa digitar
    System.out.println("Digite o seu nome: ");

    // Resgata o valor do terminal
    String nome = scanner.nextLine();

    // Exibe o valor
    System.out.println("Olá " + nome + "!");


    // nextInt
    System.out.println("Digite um numero: ");

    int n1 = scanner.nextInt();

    System.out.println("Seu número é: " + n1 + "!");






    // Aula NextLine

    System.out.println(" Digite um número: ");
    int n = scanner.nextInt();

    // Sempre que tiver um scanner next que pegue um número, colocar um nextLine vazio.
    scanner.nextLine();

    System.out.println("Digite um texto: ");
    String txt = scanner.nextLine();

    System.out.println("Os dados são, n = " + n + " e txt = " + txt);



     // Fechamento de scanner; é bom para performance e boas praticas.
    scanner.close();


  }

}
