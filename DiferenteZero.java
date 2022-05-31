package exercicios;
import java.util.Scanner;
public class DiferenteZero {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        int p1 = in.nextInt();
        System.out.print("Informe o segundo numero: ");
        int p2 = in.nextInt();

        while(p2 <= 0){
            System.out.print("Informe o segundo numero: ");
            p2 = in.nextInt();
        }
        double div = p1 / p2;
        System.out.print("O valor da divisão e: " + div);
    }
}
