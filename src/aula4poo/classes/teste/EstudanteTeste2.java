package aula4poo.classes.teste;

import aula4poo.classes.dominio.Estudante;

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        //valores de inicialização padrão
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
    }
}
