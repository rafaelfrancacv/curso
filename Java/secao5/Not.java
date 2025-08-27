package secao5;

public class Not {

  public static void main(String[] args) {
        
    boolean estaChuvendo = false;
    boolean temGuardaChuva = true;

    System.out.println(estaChuvendo);
    System.out.println(!estaChuvendo);

    System.out.println(estaChuvendo || !temGuardaChuva);
    System.out.println(!(estaChuvendo || !temGuardaChuva));

  }
  
}
