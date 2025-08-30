package secao5.Exercicios;

import java.util.Scanner;


public class Exercicio01 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor de um produto: ");
    float valor = sc.nextFloat();

    if (valor < 50) {

      System.out.println("Barato");
      
    } else if (valor >= 50 && valor < 100) {

      System.out.println("Médio");
      
    } else{

      System.out.println("Caro");

    }

    sc.close();

  }

  
}
