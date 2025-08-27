package secao5;

public class Switch {
  public static void main(String[] args) {
    
    // Validar dia de semana baseada em um numero
    // 1 = Domingo
    // 7 = sábado
    int diaDaSemana = 1;

    switch(diaDaSemana){
      case 1:
        System.out.println("Domingo");
        break;
      case 2: 
        System.out.println("Segunda-feira");
        break;
      case 3:
        System.out.println("Terça-feira");
        break;
    }

  }
}
