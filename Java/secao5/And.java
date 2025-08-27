package secao5;

public class And {

  public static void main(String[] args) {
    
  int idade = 18;
  boolean temCarteiraDeMotorista = true;
  System.out.println(idade >= 18 && temCarteiraDeMotorista);
  
  // 
  int a = 10;
  int b = 20;
  if (a > 5 && b > 10) {
    System.out.println("Deu certo!");
  }
    

  // False && True => True (Curto circuito)
  int c = 10;
  int d = 20;
  if (c > 55 && d > 10) {
    System.out.println("Deu certo!2");
  }

  }
  
}
