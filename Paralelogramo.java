package exercicios;
import java.util.Scanner;
public class Paralelogramo {
    public static void main(String[] args){
        System.out.print("Informe a base: ");
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();

        System.out.print("Informe a altura: ");
        int altura = in.nextInt();

        System.out.print("Area do paralelogramo: "+ altura*base);
    }
}
