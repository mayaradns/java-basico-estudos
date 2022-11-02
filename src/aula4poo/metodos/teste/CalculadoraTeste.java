package aula4poo.metodos.teste;

import aula4poo.metodos.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10, 6);
        //System.out.println(calculadora.divideDoisNumeros(30, 2));
        double resultado = calculadora.divideDoisNumeros(30, 2);
        System.out.println(resultado);
    }
}
