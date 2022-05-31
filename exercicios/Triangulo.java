package exercicios;
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("informe a base: ");
        int base = in.nextInt();
        System.out.print("informe a altura: ");
        int altura = in.nextInt();
        System.out.print("A area do traingulo e: "+ (base*altura)/2);

    }
}
