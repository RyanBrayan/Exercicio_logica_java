package exercicios;
import java.util.Scanner;
public class Retangulo {
    public static void main(String[] args){
        System.out.print("Informe o valor da base: ");
        Scanner in = new Scanner(System.in);

        int base = in.nextInt();
        System.out.print("Informe o valor da altura: ");

        Scanner in2 = new Scanner(System.in);
        int altura = in2.nextInt();

        System.out.print("O valor da sua area e igual:" + altura * base);
    }
}
