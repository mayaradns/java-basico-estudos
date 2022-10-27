package aula2EstrutasRepeticao;

import java.util.Scanner;

public class ExercicioDoWhile2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num;
        int somaPar = 0;
        int somaImpar = 0;
        int qtddNumeros;
        int cont = 0;

        System.out.print("Digite a quantidade de números irá usar: ");
        qtddNumeros = entrada.nextInt();

        do{
            System.out.print("Digite um número inteiro: ");
            num = entrada.nextInt();

            if (num % 2 == 0){
                somaPar += 1;
            }else{
                somaImpar += 1;
            }
            cont++;
        }while(cont < qtddNumeros);

        System.out.println("Quantidade de números Pares: " + somaPar);
        System.out.println("Quantidade de números Ímpares: " + somaImpar);
    }
}
