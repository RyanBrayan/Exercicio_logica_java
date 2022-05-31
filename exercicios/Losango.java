package exercicios;
import java.util.Scanner;
public class Losango {
    public static void main(String[] args){
        System.out.print("Informe diagonal maior: ");
        Scanner in = new Scanner(System.in);
        int diagonalMaior = in.nextInt();

        System.out.print("Informe diagonal menor: ");
        
        int diagonalMenor = in.nextInt();

        System.out.print("O valor da area do losango e: "+ (diagonalMaior*diagonalMenor)/2);
    }
}
