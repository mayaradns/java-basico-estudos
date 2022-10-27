package aula1controleDeFluxo;

public class CondicionalIF1 {
    public static void main(String[] args){
        // só executa se a expressão dentro do if for verdadeira
        // if necessariamente precisa receber uma expressão booleana.

        int idade = 19;

        // se idade for maior igual 18 anos, pode comprar bebida, senão, não pode.
        if(idade >= 18){
            System.out.println("Pode comprar bebida.");
        }else{
            System.out.println("Não pode comprar bebida.");
        }
        System.out.println("Fora do if");
    }
}