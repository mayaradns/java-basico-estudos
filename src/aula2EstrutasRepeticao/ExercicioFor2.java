package aula2EstrutasRepeticao;
import java.util.Scanner;

public class ExercicioFor2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cont = 1;

        System.out.print("Fatorial: ");
        int fatorial = entrada.nextInt();

        for(int i = 1; i <= fatorial; i++){
            cont *= i;
        }
        System.out.println(fatorial + "! = " + cont);
    }
}
