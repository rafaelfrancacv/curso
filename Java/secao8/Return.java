package secao8;

public class Return {

  public static void main(String[] args) {
    
    saudar("Matheus");
    
    int numero = 10;

    // retorno em variável
    String r1 = verificarPar(numero);

    String r2 = verificarPar(3);

    System.out.println(r1);
    System.out.println(r2);

  }

  public static void saudar(String nome) {

    System.out.println("Olá, " + nome + ", tudo bem?");
    
  }

  public static String verificarPar(int n){

    if (n % 2 == 0) {

      return "O numero " + n + " é par!";
      
    }else{

      return "O numero " + n + " não é par!";

    }

  }
  
}
