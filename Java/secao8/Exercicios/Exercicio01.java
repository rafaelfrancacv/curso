package secao8.Exercicios;

public class Exercicio01 {

  public static void main(String[] args) {
    
    double celsius = 25.0;
    double fahrenheit = converterTemperatura(celsius);
    System.out.println("A temperatuda de " + celsius + "C é equivalente a " + fahrenheit + "F");

  }

  public static double converterTemperatura(double celsius){
    return (celsius * 9/5) + 32;
  }
  
}
