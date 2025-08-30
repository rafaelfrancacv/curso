package secao5.Exercicios;

import java.util.Scanner;

public class Exercicio02 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do seu usuário");
    String user = sc.nextLine();

    System.out.println("Digite sua senha de 4 dígitos");
    int senha = sc.nextInt();

    if (user.equals("admin") && senha == 1234) {

      System.out.println("Acesso permitido.");

    } else{

      System.out.println("Acesso negado.");

    }

    sc.close();

  }
  
}
