package aula3Arrays;

public class Array3Foreach {
    public static void main(String[] args) {
        //formas de declarar o array
        int[] numeros = new int[3];
        int[] numeros2 = new int[]{1,2,3,4};
        int[] numeros3 = {22,31,10,55,11};

        for (int i = 0; i < numeros2.length; i++){
            System.out.println(numeros2[i]);
        }

        //foreach  - não é possível trabalhar com os índices.
        for (int num: numeros3){
            System.out.println(num);
        }
    }
}
