package exercicios;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        System.out.print("Informe seu nome: ");
        Scanner in = new Scanner(System.in);

        String nome = in.nextLine();

        System.out.print("Ola "+ nome);
    }
}
