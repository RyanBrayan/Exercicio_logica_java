package exercicios;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        System.out.print("Informe seu nome: ");
        Scanner in = new Scanner(System.in);
        String nome = in.nextLine();

        System.out.print("Informe sua idade: ");

        Scanner in2 = new Scanner(System.in);
        int idade = in2.nextInt();

        System.out.print("Ola "+nome+" sua idade e "+ idade);
    }

}
