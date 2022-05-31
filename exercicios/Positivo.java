package exercicios;
import java.util.Scanner;
public class Positivo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = in.nextInt();
        if(numero > 1 ){
            System.out.print("Positivo");
        }else if(numero == 0){
            System.out.print("Zero");
        }else{
            System.out.print("Negativo");
        }
    }
}
