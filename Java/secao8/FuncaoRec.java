package secao8;

public class FuncaoRec {
    public static void main(String[] args) {
        int soma = somaRecursiva(6);
        System.out.println(soma);
    }

    public static int somaRecursiva(int n){
       if (n==1){
           return 1;
       }else{
           return n + somaRecursiva(n-1);
       }
    }

}
