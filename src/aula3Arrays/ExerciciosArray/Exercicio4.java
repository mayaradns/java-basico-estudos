package aula3Arrays.ExerciciosArray;

import java.util.Random;

public class Exercicio4 {
    public static void main(String[] args) {
        // matriz 4x4 com números aleatórios 0-9
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }

        for(int[] linha: matriz){
            for(int coluna: linha){
                System.out.print(coluna + " - ");
            }
            System.out.println();
        }
    }
}
