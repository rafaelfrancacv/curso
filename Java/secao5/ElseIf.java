package secao5;

public class ElseIf {

  public static void main(String[] args) {
    
    double nota = 8.5;

    
    if (nota == 10) {
      System.out.println("Você tirou 10");
    } else if (nota >= 9) {
      System.out.println("Nota muito boa");
    } else if (nota >= 7){
      System.out.println("Acima de média");
    } else {
      System.out.println("Abaixo da média");
    }

  }
  
}
