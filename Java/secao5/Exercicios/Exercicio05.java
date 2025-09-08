package secao5.Exercicios;

import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira um número: ");
    int numero = sc.nextInt();

    if (numero >= 10 && numero <= 20 ) {
      System.out.println("Dentro do Intervalo");
    }else{
      System.out.println("Fora do Intervalo");
    }

    sc.close();
  }
  
}
