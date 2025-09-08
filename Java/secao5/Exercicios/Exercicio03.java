package secao5.Exercicios;

import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int numero = sc.nextInt();

    if (numero % 2 == 0) {
      System.out.println("Seu Número: " + numero + " é PAR!");
    } else{
      System.out.println("Seu Número: " + numero + " é IMPAR!");
    }

    sc.close();

  }
  
}
