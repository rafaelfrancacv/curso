package secao5;

public class Default {

  public static void main(String[] args) {
    
    int n = 10;

    // Default é o else do switch
    switch (n) {
      case 1:
        System.out.println("É 1");
        break;
      case 2:
        System.out.println("É 2");
        break;
      default:
        System.out.println("Número não encontrado");
        break;
    }

  }
  
}
