package aula3Arrays;

public class Array4Multidimensional {
    public static void main(String[] args) {
        // é necessário definir pelo menos o tamanho base do array
        int[][] dias = new int[3][];
       // int[][] arrayInt = {{0,0}, {1,2,3}, {4,5,6,7,8,9}}; -> outra forma de inicializar array multidimensional

        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i=0; i < dias.length; i++){
            for (int j =0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------");

        //foreach
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
