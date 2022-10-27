package aula2EstrutasRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        int maior = 0;
        int soma = 0;

        int cont = 0;
        do{
            System.out.print("Número: ");
            num = entrada.nextInt();
            if (num > maior){
                maior = num;
            }
            soma += num;
            cont++;
        }while(cont < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);
    }
}
