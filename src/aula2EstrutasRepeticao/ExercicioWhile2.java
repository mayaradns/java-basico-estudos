package aula2EstrutasRepeticao;

import java.util.Scanner;

public class ExercicioWhile2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int nota;

        System.out.print("Nota: ");
        nota = entrada.nextInt();

        while(nota < 0 || nota > 10 ){
            System.out.print("Nota inválida. Digite novamente: ");
            nota = entrada.nextInt();
        }
    }
}
