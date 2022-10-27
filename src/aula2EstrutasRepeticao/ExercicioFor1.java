package aula2EstrutasRepeticao;

import java.util.Scanner;

public class ExercicioFor1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Tabuada de qual número você deseja ver? ");
        num = entrada.nextInt();
        System.out.println("==================");
        System.out.println("  Tabuada de " + num);
        System.out.println("==================");
        for(int i = 1; i <= 10; i++){
            System.out.println("    " + num + "x" + i + "=" + (num*i));
        }
    }
}
