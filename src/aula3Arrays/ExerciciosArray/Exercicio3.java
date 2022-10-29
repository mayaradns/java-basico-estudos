package aula3Arrays.ExerciciosArray;

import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt(100); //número aleatório até 100
            numAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for(int num: numAleatorios){
            System.out.print(num + " - ");
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for(int num: numAleatorios){
            System.out.print((num + 1) + " - ");
        }
    }
}
