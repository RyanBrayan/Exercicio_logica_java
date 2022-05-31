package exercicios;
import java.util.Scanner;
public class Quadrado {
    public static void main(String[] args){
        System.out.print("Informe o lado: ");
        Scanner in = new Scanner(System.in);

        int lado = in.nextInt();
        
        System.out.print("Area do quadrado: " + lado * lado);
    }
}
