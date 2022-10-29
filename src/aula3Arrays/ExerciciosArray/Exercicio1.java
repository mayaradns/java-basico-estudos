package aula3Arrays.ExerciciosArray;

public class Exercicio1 {
    public static void main(String[] args){
        //ordem inversa
        int[] num = {10, 20, 30, 40, 50, 60};
        int cont = 0;

        System.out.println("Ordem normal.");
        while(cont < (num.length)){
            System.out.print(num[cont] + " - ");
            cont++;
        }
        System.out.println("\nOrdem inversa.");
        for(int i = (num.length - 1); i >= 0; i--){
            System.out.print(num[i] + " - ");
        }

    }
}
