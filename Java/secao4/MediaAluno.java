package secao4;

import java.util.Scanner;

public class MediaAluno {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // Nome
    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();
    System.out.println("---------------------------");
    System.out.println("Olá, " + nome);
    
    // Nota 1
    System.out.println("Digite sua 1º nota: ");
    float n1 = scanner.nextFloat();
    System.out.println("---------------------------");
    
    // Nota 2
    System.out.println("Digite sua 2º nota: ");
    float n2 = scanner.nextFloat();
    System.out.println("---------------------------");
    
    // Nota 3
    System.out.println("Digite sua 3º nota: ");
    float n3 = scanner.nextFloat();
    System.out.println("---------------------------");
    
    // Nota média
    float notaMedia = (n1 + n2 + n3) / 3;
    
    // nota < = >
    if (notaMedia >= 7) {
      System.out.println("Sua nota foi: " + notaMedia + " Parabéns!! Você foi aprovado 🥳.");
    } else {
      System.out.println("Sua nota foi: " + notaMedia + " Infelizmente você foi reprovado 😕.");
    }


    // fechamento de scanner
    scanner.close();
    

  }
  
}
