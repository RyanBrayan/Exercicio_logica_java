package exercicios;
import java.util.Scanner;
public class Maior {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int n1 = in.nextInt();
        System.out.print("Informe o segundo numero: ");
        int n2 = in.nextInt();
        System.out.print("Informe o terceiro numero: ");
        int n3 = in.nextInt();

        if(n1 < n2 && n2 < n3){
            System.out.print("O maior numero e: " + n3);
        }else if(n2 < n3 && n3 < n1){
            System.out.print("O maior numero e: " + n1);
        }else{
            System.out.print("O maior numero e: " + n2);
        }

    }
}
