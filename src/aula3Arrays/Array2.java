package aula3Arrays;

public class Array2 {
    public static void main(String[] args){
        String[] nomes = new String[4];
        nomes[0] = "Ishigo";
        nomes[1] = "Goku";
        nomes[2] = "Naruto";
        nomes[3] = "Lawliet";

        //percorrendo o array
        for (int i=0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

    }
}
