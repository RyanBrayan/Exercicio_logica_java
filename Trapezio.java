package exercicios;
import java.util.Scanner;
public class Trapezio {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Informe base maior: ");
        int baseMaior = in.nextInt();

        System.out.print("Informe base menor: ");
        int baseMenor = in.nextInt();

        System.out.print("Informe altura: ");
        int altura = in.nextInt();

        System.out.print("O valor da area de um trapezio e:"+((baseMenor+baseMaior)*altura)/2);

    }
}
