package aula2EstrutasRepeticao;

import java.util.Scanner;

public class ExercicioWhile1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.print("Digite um nome: ");
            nome = entrada.next();
            if (nome.equals("0")){
                break;
            }
            System.out.print("Digite uma idade: ");
            idade = entrada.nextInt();
        }
    }
}
