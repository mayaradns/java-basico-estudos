package aula1controleDeFluxo;

public class CondicionalOpTernario {
    public static void main(String[] args){
        // condição ? se verdadeiro : se falso;
        // Doar se salario > 5000

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para a instituição.";
        String mensagemNaoDoar = "Ainda não tenho condições,  mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        //  String resultado = salario > 5000 ? "Eu vou doar 500 para a instituição." : "Ainda não tenho condições,  mas vou ter!";

        System.out.println(resultado);

    }
}
