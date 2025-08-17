package secao2;

public class typeCasting {
  
  public static void main(String[] args) {
  
    //implicito (widening)
    int numero2 = 42;

    long numeroLong = numero2;

    double numeroDouble = numero2;

    System.out.println(numeroLong);

    System.out.println(numeroDouble);
  

    //explicito (narrowing)
    double valorDouble = 9.76;
    
    int valorInt = (int) valorDouble;

    System.out.println(valorInt);

  }

}
