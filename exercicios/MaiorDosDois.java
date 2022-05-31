package exercicios;
import java.util.Scanner;
public class MaiorDosDois {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int n1 = in.nextInt();
        System.out.print("Informe o segundo numero: ");
        int n2 = in.nextInt();
        System.out.print("Informe o terceiro numero: ");
        int n3 = in.nextInt();

        if(n1 < n2 && n1 < n3){
            int resultado = n2 + n3;
            System.out.print("O soma dos 2 maiores numeros e: " + resultado);
        }else if(n2 < n1 && n2 < n3){
            int resultado = n1 + n3;
            System.out.print("O maior numero e: " + resultado);
        }else{
            int resultado = n2 + n1;
            System.out.print("O maior numero e: " + resultado);
        }

    }
}
