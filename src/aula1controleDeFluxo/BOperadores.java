package aula1controleDeFluxo;

public class BOperadores {
    public static void main(String[] args){
        //OPERADORES ARITIMÉTICOS
        // + - / * %
        int num1 = 20;
        int num2 = 2;
        int a = num1 - num2;
        System.out.println("Subtração: " + a);

        int b = num1 + num2;
        System.out.println("Adição: " + b);

        int c = num1 / num2;
        System.out.println("Divisão: " + c);

        int d = num1 * num2;
        System.out.println("Multiplicação: " + d);

        int e = 37 % num2;
        System.out.println("Módulo (resto): " + e);


        //OPERADORES RELACIONAIS
        // < > <= >= == !=
        // OBS.: o '=' é um operador de atribuição.

        System.out.println(20 > 10);
        System.out.println(20 == 15);
        System.out.println(20 != 5);
        System.out.println(17 >= 17);

        // OPERADORES LÓGICOS
        // && (end); || (or); ^ (xor)

        // OPERADOR DE ATRIBUIÇÃO
        // = += -= /= *= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        // contador ++ --
        int contador = 0;
        contador +=1; // contador = contador + 1
        contador++; // executa depois incrementa
        contador--;
        ++contador; // incrementa depois executa
        --contador;

    }
}
