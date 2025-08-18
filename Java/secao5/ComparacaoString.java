package secao5;

public class ComparacaoString {

  public static void main(String[] args) {
    
    String str1 = "Java";
    String str2 = new String("Java");

    System.out.println(str1);
    System.out.println(str2);

    System.out.println(str1 == str2);

    System.out.println(str1.equals(str2));

    String str3 = "JAVA";

    // Java == JAVA (false) > java == java
    System.out.println(str1.equalsIgnoreCase(str3));


  }
  
}
