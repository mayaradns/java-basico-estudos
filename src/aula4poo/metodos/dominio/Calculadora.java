package aula4poo.metodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }
   //recebendo parâmetros
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    //método com retorno
    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }
}
