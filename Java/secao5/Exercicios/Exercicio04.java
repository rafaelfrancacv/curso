package secao5.Exercicios;

import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira número de 1 a 7");
    int diaDaSemana = sc.nextInt();

    switch (diaDaSemana) {
      case 1:
        System.out.println("Hoje é Domingo!");
        break;
      case 2:
        System.out.println("Hoje é Segunda-feira, dia útil!");
        break;
      case 3:
        System.out.println("Hoje é Terça-feira, dia útil!");
        break;
      case 4:
        System.out.println("Hoje é Quarta-feira, dia útil!");
        break;
      case 5:
        System.out.println("Hoje é Quinta-feira, dia útil!");
        break;
      case 6:
        System.out.println("Hoje é Sexta-feira, dia útil!");
        break;
      case 7:
        System.out.println("Hoje é Sábado!");
        break;
    }

    sc.close();

  }
  
}
