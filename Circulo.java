package exercicios;
import java.util.Scanner;
public class Circulo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("informe o valor do raio: ");
        int raio = in.nextInt();
        System.out.print("O valor da area do circulo e: "+ (raio*raio)*3.14);
    }
}
