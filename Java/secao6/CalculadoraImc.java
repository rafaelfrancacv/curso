package secao6;

import java.util.Scanner;

public class CalculadoraImc {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira seu Peso em kg: ");
    double peso = sc.nextDouble();

    System.out.println("Insira sua altura em M");
    double altura = sc.nextDouble();

    double resultado = peso / (altura * altura);

    System.out.println(resultado);

    if (resultado < 18.5) {
        System.out.println("Seu IMC é: " + resultado + ". Seu peso é Baixo!");
      } else if (resultado >= 18.5 && resultado <= 24.9){
        System.out.println("Seu IMC é: " + resultado + ". Seu peso é Normal!");
      }else if (resultado >= 25 && resultado <= 29.9) {
        System.out.println("Seu IMC é: " + resultado + ". Está com Sobrepeso!");
      }else{
        System.out.println("Seu IMC é: " + resultado + "Está Obeso!");
      }

      
    sc.close();

  }
  
}
