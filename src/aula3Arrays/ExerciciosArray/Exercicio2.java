package aula3Arrays.ExerciciosArray;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        //vetor com 6 carecteres e número de consoantes.
        Scanner entrada = new Scanner(System.in);
        String[] consoantes = new String[6];
        int qtddConsoantes = 0;
        int cont=0;

        do{
            System.out.print("Letra: ");
            String letra = entrada.next();

            if (!(letra.equalsIgnoreCase("a") ||
            letra.equalsIgnoreCase("e") ||
            letra.equalsIgnoreCase("i") ||
            letra.equalsIgnoreCase("o") ||
            letra.equalsIgnoreCase("u"))){

                qtddConsoantes++;
            }
            consoantes[cont] = letra;
            cont++;
        }while(cont < consoantes.length);

        System.out.print("Vetor: ");
        for (String cons: consoantes){
            System.out.print(cons + " - ");
        }
        System.out.println("\nSão " + qtddConsoantes + " consoantes.");

    }
}
